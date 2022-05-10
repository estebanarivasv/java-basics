package deliverables.clase3.ej7;

public class InversorDeCadenas {

    public static void invertir(String cadena) {
        invertir(cadena, "");
    }
    public static void invertir(String cadena, String cadenaResultante) {

        System.out.println("Cadena: " + cadena);
        if (cadena == null || cadena.length() == 0) {
            // Si la longitud de la cadena es 0, se la devuelve sin invertir
            System.out.println(cadena);

        } else if (cadena.length() == 1) {
            // Si la longitud de la cadena es igual a 1, tambien se la devuelve sin invertir
            cadenaResultante += cadena;
            System.out.println("Ultima letra: " + cadena + " ---> " + cadenaResultante);

        } else {
            // Si la longitud de la cadena es menor o igual a 1, se la devuelve sin invertir
            char letraInvertida = cadena.charAt(cadena.length() - 1);
            String subcadena = cadena.substring(0, cadena.length() - 1);
            cadenaResultante += letraInvertida;

            System.out.println("Ultima letra: " + letraInvertida + " -> " + subcadena + " ---> " + cadenaResultante);
            invertir(subcadena, cadenaResultante);
        }
    }

    public static void main(String[] args) {
        InversorDeCadenas.invertir("ELEFANTE");
        InversorDeCadenas.invertir("");
        InversorDeCadenas.invertir("CACA");
    }
}
