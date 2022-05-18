package deliverables.clase4.ej8;

import java.util.function.BiFunction;

/*
* Supongamos que quiero utilizar una interface funcional que realice lo siguiente f(x, y) = 2x + 3y.
* Tengo 2 opciones,
* - implemento mi Interface Funcional que va a estar lista para acoplar con el lambda o
* - utilizo BIFunction que es similar a Funcion pero acepta 2 parámetros, justo lo que necesito.
*
* Quiero que implementen ambos casos, incluso, igualando contra el lambda pero previamente desarrollando la clase
* abstracta para comparar ambos funcionamientos.
* */
public class CustomAndBifunction {

    @FunctionalInterface
    public interface EquationSolver<U, T, V> {
        V solve(U x, T y);
    }

    public static void main(String[] args) {
        EquationSolver<Integer,Integer,Integer> eq = new EquationSolver<>() {
            @Override
            public Integer solve(Integer x, Integer y) {
                return 2 * x + 3 * y;
            }
        };

        System.out.println("Interfaz funcional custom: " + (eq.solve(6, 8)));

        BiFunction<Integer,Integer,Integer> eq2 = new BiFunction<Integer,Integer,Integer>() {

            @Override
            public Integer apply(Integer x, Integer y) {
                return 2 * x + 3 * y;
            }
        };
        System.out.println("Bifunction: " + eq2.apply(6,8));
    }
}
