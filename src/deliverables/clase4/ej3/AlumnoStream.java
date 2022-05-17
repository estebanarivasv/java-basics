package deliverables.clase4.ej3;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

/*
* Defina la clase Alumno
*  Cree un Lista y carge un numero considerable de alumnos para que el ejercicio sea viable (15 o mas) con valores a azar.
1. Muestre todos los alumnos de la lista
2. Muestre todos los alumnos ordenados de menor a mayor por edad
3. Muestre aquellos alumnos cuyo nombre empieza con un caracter dado (elegir el caracter en base a la lista de nombre que se utilizo)
4. Sume la edad de todos los alumnos
5. Obtenga un mapa donde la clave sea la nota y el valor sea una lista de alumnos que tienen esa nota
* */
public class AlumnoStream {

    public static void main(String[] args) {
        Alumno alumno1 = new Alumno(1, "45.568.101", "Jimena", "Martinez", "1", 3.5, 12);
        Alumno alumno2 = new Alumno(2, "45.568.102", "Matias", "Rodriguez", "1", 9.0, 13);
        Alumno alumno3 = new Alumno(3, "45.568.103", "Pedro", "Vazques", "1", 5.4, 14);
        Alumno alumno4 = new Alumno(4, "45.568.104", "Juan", "Martinez", "1", 8.0, 15);
        Alumno alumno5 = new Alumno(5, "45.568.105", "Morena", "Rodriguez", "1", 3.0, 19);
        Alumno alumno6 = new Alumno(6, "45.568.106", "Ignacio", "Vazques", "1", 2.5, 20);
        Alumno alumno7 = new Alumno(7, "45.568.107", "Tobias", "Martinez", "1", 9.0, 11);
        Alumno alumno8 = new Alumno(8, "45.568.108", "Marcela", "Rodriguez", "1", 7, 12);
        Alumno alumno9 = new Alumno(9, "45.568.109", "Estela", "Vazques", "1", 6, 16);
        Alumno alumno10 = new Alumno(10, "45.568.110", "Francisca", "Martinez", "1", 9.0, 17);
        Alumno alumno11 = new Alumno(11, "45.568.111", "Ernesto", "Rodriguez", "1", 10, 15);
        Alumno alumno12 = new Alumno(12, "45.568.112", "Micaela", "Vazques", "1", 2, 15);
        Alumno alumno13 = new Alumno(13, "45.568.113", "Paulina", "Martinez", "1", 1, 19);
        Alumno alumno14 = new Alumno(14, "45.568.114", "Teresa", "Rodriguez", "1", 6.59, 20);
        Alumno alumno15 = new Alumno(15, "45.568.115", "José", "Vazques", "1", 1.6, 23);


        List<Alumno> alumnosList = List.of(alumno1, alumno2, alumno3, alumno4, alumno5, alumno6, alumno7, alumno8, alumno9, alumno10, alumno11, alumno12, alumno13, alumno14, alumno15);

        System.out.println("\nMostrando todos los alumnos: ");
        alumnosList.stream()
                .forEach(alumno -> {
                    System.out.println(alumno.toString());
                });

        System.out.println("\nMostrando todos los alumnos ordenados por edad: ");
        alumnosList.stream()
                .sorted(Comparator.comparingInt(Alumno::getEdad)).toList()
                .forEach(alumno -> {
                    System.out.println(alumno.toString());
                });


        String empiezaCon = "M";
        System.out.println("\nMostrando todos los alumnos cuyo nombre empieza con " + empiezaCon);
        alumnosList.stream()
                .filter(alumno -> alumno.getNombre().startsWith(empiezaCon))
                .forEach(alumno -> {
                    System.out.println(alumno.toString());
                });

        Integer sum = alumnosList.stream()
                .map(Alumno::getEdad)
                .reduce(0, Integer::sum);
        System.out.println("\nSuma de todas las edades: " + sum);

        double notaEspecifica = 9.0;
        System.out.println("\nMostrando todos los alumnos con una nota especifica: " + notaEspecifica);
        alumnosList.stream()
                .filter(alumno -> alumno.getNota() == notaEspecifica)
                .forEach(alumno -> {
                    System.out.println(alumno.toString());
                });

    }

}
