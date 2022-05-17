package com.erivas.topic4FunctionalProgramming.StreamAndLambdas;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class PruebaStream {
    public static void main(String[] args) {
/*        Stream<Integer> s = List.of(1, 2, 3, 4).stream();

        s.map(n -> n * 2)
                .forEach(System.out::println);

        List<List<Integer>> listaDeListas = List.of(List.of(7, 1, 2),
                List.of(2, 1, 2, 3),
                List.of(1, 5, 2, 3, 4),
                List.of(1, 2, 6, 3, 4, 5));

        listaDeListas.stream()
                .peek(l -> {
                    System.out.print("Voy a procesar la lista - > ");
                        System.out.println(l);
                })
                .flatMap(Collection::stream)
                .distinct()
                .map(n -> n * 2)
                .peek(n -> {
                    System.out.print("Voy a procesar el numero - > ");
                    System.out.println(n);
                })
                .sorted((x, y) -> y - x)
                .forEach(System.out::println);

        Stream.iterate(1, x -> x + 1)
                .limit(50)
                .map(n -> n * 2)
                .forEach(System.out::println);

        Stream.iterate(2, x -> x + 2)
                .limit(50)
                .forEach(System.out::println);

        List.of(1,2,3,4,5)
                .stream()
                .map(n -> n * 2)
                .map(n -> n * 3)
                .forEach(System.out::println);

        System.out.println("-------------");

        List.of(1,2,3,4,5)
                .parallelStream()
                .map(n -> n * 2)
                .map(n -> n * 3)
                .forEach(System.out::println);

        System.out.println("-------------");

        List.of(1,2,3,4,5)
                .stream()
                .parallel()
                .map(n -> n * 2)
                .map(n -> n * 3)
                .forEach(System.out::println);




        Integer[] arrInt = List.<Integer>of(1,2,3,4,5)
                .stream()
                .skip(2)
                .map(n -> n * 2)
                .toList().toArray(new Integer[] {});

        System.out.println(arrInt);

//        List<Integer> ages = Arrays.asList(25, 30, 45, 28, 32);
//        int computedAges = ages.parallelStream().reduce(0, (a, b) -> a + b, Integer::sum);

        List<Integer> ages = Arrays.asList(25, 30, 45, 28, 32);

        int computedAges = ages.stream()
                               .parallel()
                               .reduce((a, b) -> a + b)
                               .orElse(0);

        System.out.println(computedAges);

        int computedAges2 = ages.stream()
                                .parallel()
                                .reduce(0, (a, b) -> a + b);

        System.out.println(computedAges2);

        int computedAges3 = ages.stream()
                                .parallel()
                                .reduce(0, (a, b) -> a + b, (a, b) -> a + b);

        System.out.println(computedAges3);

 */
        List<Integer> lint = new ArrayList<>();

        System.out.println(lint.stream().reduce(1, Integer::sum));
    }
}
