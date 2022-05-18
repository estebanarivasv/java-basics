package deliverables.clase4.ej8;

import java.util.function.Function;

/*
Ahora compliquemos un poco la situación: Utilicemos Function.

Con esto vamos a estar aplicando el concepto de Currying (investigen Currying) que es bastante común en los lenguajes
puramente funcionales y que también es posible en java (con un poco de esfuerzo)

Y finalmente, para que no se aburran, implementemos con Function un interface capaz de recibir un lamba de haga
esto f(x, y, z) = 2x + 3y + 4*z Que las interfaces utilicen Long

Importante, cuando hablamos de desarrollar una Interface es definir como será el tipo del parámetro que reciba dicho
lamba en un metodo que lo utilice.

Ej: debemos tener un metodo eval(Function f, Long ... parametros), este metodo obtendrá el resultado en base al lambda
que le estamos pasando y los parametros, por supuesto.
* */
public class Currying {

    @SafeVarargs
    public static <Long> Long solveEquation(Function<Long, Function<Long, Long>> f, Long...  parameters) {
        return f.apply(parameters[0])
                .apply(parameters[1]);
    }

    public static void main(String[] args) {
        Long value = solveEquation(x -> y -> 2*x + 3*y, 6L, 12L);
        System.out.println(value);
    }
}
