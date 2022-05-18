package deliverables.clase4.ej7;

/*
* Tome un texto considerablemente largo de alguna página de internet y colóquelo en un String.
* Proceda a quitarle los simbolos de puntuación (, . ;). Luego realice un split en base a los espacios en blanco.
* Asi obtenemos una arreglo de palabras. Procesar dicho arreglo con un stream, quitando los duplicados y clasificando
* las palabras respecto de su dimensión, para lograr algo similar a esto:
*
 1 letra [5]:
 A
 a
 y
 e
 o

 2 letras [2]:
 de
 un

 3 letras ....

*
* */

import deliverables.clase4.ej3.Alumno;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SplitDeStrings {



    public static void main(String[] args) {
        String texto = "Bienvenidos al seguimiento en vivo del partido entre Boca y Corinthians, que se enfrentan en la " +
                "Bombonera por la penúltima fecha del Grupo E de la Copa Libertadores. En la ida en San Pablo, el equipo " +
                "brasileño ganó 2-0. El historial de enfrentamientos por el torneo continental es muy parejo, con dos " +
                "victorias para cada uno y tres empates. Ambos definieron la Libertadores 2012, obtenida por Corinthians, " +
                "tras el 1-1 en la Bombonera y el 2-0 en el estadio Pacaembú. Tras ese encuentro, Juan Román Riquelme " +
                "anunció que no seguiría más en Boca porque se sentía “vacío”, como trasfondo del distanciamiento que " +
                "mantenía con el entonces presidente Daniel Angelici y el director técnico Julio Falcioni.";

        List<String> palabras = List.of(texto.replaceAll("[^a-zA-Z ]", "").split("\\s+"));

        palabras.stream()
                .distinct()
                .collect(Collectors.groupingBy(String::length))
                .forEach((key, listaPalabras) -> {
                    System.out.println("Palabras con " + key + " letras:");
                    listaPalabras.forEach(System.out::println);
                    System.out.println();
                });
    }

}
