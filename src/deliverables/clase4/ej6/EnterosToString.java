package deliverables.clase4.ej6;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


/*
 * Utilizando el metodo anterior, obtenga una lista de numeros entre 2 limites y proceda a transformarlos en String
 * para despues obtener una cadena como la siguiente: 10 -> 11 -> 12 -> 13 -> 14 -> 15 ...
 *
 * Y como haría para obtener un String concatenando n veces el número a concatenar?
 * */
public class EnterosToString {

    static String getStringDesdeLista(Integer desde, Integer hasta) {

        List<String> stringNumbers = new ArrayList<>();
        Stream.iterate(
                        Optional.ofNullable(desde).orElse(10),
                        x -> x <= Optional.ofNullable(hasta).orElse(20),
                        x -> x + 1)
                .forEach(numero -> {
                    String repeated = new String(new char[numero]).replace("\0", numero.toString());
                    stringNumbers.add(repeated);
                });
        return String.join("", stringNumbers);
    }

    public static void main(String[] args) {
        System.out.println(getStringDesdeLista(10, 20));
        System.out.println(getStringDesdeLista(1, 5));
    }
}
