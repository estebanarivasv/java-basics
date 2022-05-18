package deliverables.clase4.ej4;

import java.util.List;
import java.util.stream.IntStream;

/*
* Construir un Stream de numeros naturales que contenga todos los números pares mayores o iguales a 10 y menores o
* iguales a 20. Presentar en una lista de Integer en forma ordenada. Existen varias formas de realizar esto y me
* gustaría ver todas las opciones que se les ocurren.
* */
public class EnteroStream {

    public static void main(String[] args) {

        List<Integer> numerosPares = IntStream.rangeClosed(10, 20)
                .filter(n -> n % 2 == 0).boxed().toList();

        System.out.printf("Lista de numeros pares: " + numerosPares.toString());
    }

}
