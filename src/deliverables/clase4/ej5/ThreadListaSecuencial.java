package deliverables.clase4.ej5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

/*
 * Si pudieron realizar correctamente el anterior, ahora creemos un método como el siguiente:
 * List<Integer> obtenerListaSecuencialCondicionada(Integer desde, Integer hasta, Predicate<Integer> condicion) {}
 */
public class ThreadListaSecuencial {

    static List<Integer> getListaSecuencialCondicionada(Integer desde, Integer hasta, Predicate<Integer> condicion) {

        return Stream.iterate(Optional.ofNullable(desde)
                                .orElse(10),
                        x -> x <= Optional.ofNullable(hasta)
                                .orElse(20),
                        x -> x + 1)
                .filter(Optional.ofNullable(condicion)
                        .orElse(x -> true))
                .toList();
    }


    static List<Integer> getListaSecuencialCondicionadaMultipleArray(Integer desde, Integer hasta, Predicate<Integer>[] condiciones) {
        List<Predicate<Integer>> conds = Arrays.stream(condiciones).toList();
        Predicate<Integer> condCompuesta = Optional.ofNullable(conds)
                .orElse(List.of(x -> true))
                .stream()
                .reduce((x, y) -> y.and(x))
                .orElse(x -> true);

        return getListaSecuencialCondicionada(desde, hasta, condCompuesta);

    }

    static List<Integer> getListaSecuencialCondicionadaMultipleLista(Integer desde, Integer hasta, List<Predicate<Integer>> condiciones) {

        Predicate<Integer> condCompuesta = Optional.ofNullable(condiciones)
                .orElse(List.of(x -> true))
                .stream()
                .reduce((x, y) -> y.and(x))
                .orElse(x -> true);

        return getListaSecuencialCondicionada(desde, hasta, condCompuesta);

    }

    @SafeVarargs
    static List<Integer> getListaSecuencialCondicionadaMultipleVarargs(Integer desde, Integer hasta, Predicate<Integer>... condiciones) {
        assert condiciones != null;
        return getListaSecuencialCondicionadaMultipleLista(desde, hasta, Arrays.asList(condiciones));
    }


    public static void main(String[] args) {

        System.out.println("Lista de enteros ordenada: " +
                getListaSecuencialCondicionada(10, 20, n -> n % 2 == 0));

        System.out.println("Lista de enteros ordenada: " +
                getListaSecuencialCondicionada(1, 100, x -> x % 3 == 0));

        System.out.println("Lista de enteros ordenada: " +
                getListaSecuencialCondicionadaMultipleVarargs(
                        1,
                        100,
                        x -> x % 3 == 0,
                        x -> x % 2 == 0,
                        x -> x % 5 == 0));

        System.out.println("Lista de enteros ordenada: " +
                getListaSecuencialCondicionadaMultipleLista(
                        1,
                        100,
                        new ArrayList<Predicate<Integer>>())
        );

        // No se puede instanciar un array vacio, por lo tanto, no es viable el segundo metodo
        /*
        Predicate<Integer>[] arrayVacio = new Predicate<Integer>[] {}
        System.out.println("Lista de enteros ordenada: " +
                getListaSecuencialCondicionadaMultipleArray(
                        1,
                        100,
                        new Predicate<Integer>[] {})
        );
        */
    }
}
