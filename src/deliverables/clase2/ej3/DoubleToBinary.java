package deliverables.clase2.ej3;

/*
* 3 - Metodo que recibe un entero en formato decimal y devuelve un double en formato binario.
* */
public class DoubleToBinary {

    public static byte transform(Double num) {
        return num.byteValue();
    }

    public static void printResult(Double num) {
        byte result = transform(num);
        System.out.println("El numero " + num + " en binario es: " + transform(num));
    }

    public static void main(String[] args) {
        printResult(3.6);
        printResult(48.2);
        printResult(50.3);
        printResult(8.0);
        printResult(62.1);
    }
}
