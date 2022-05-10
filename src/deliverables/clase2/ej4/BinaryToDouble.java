package deliverables.clase2.ej4;

/*
* 3 - Metodo que recibe un entero en formato decimal y devuelve un double en formato binario.
* */
public class BinaryToDouble {

    public static double transform(Byte num) {
        System.out.println("Numero recibido: " + num);
        return num.doubleValue();
    }

    public static void printResult(Byte num) {
        System.out.println("El numero " + num + " en decimal es: " + transform(num));
    }

    public static void main(String[] args) {
        printResult((byte) 43);
        printResult((byte) 100);
        printResult((byte) 52);
        printResult((byte) 7);
        printResult((byte) 91);
    }
}
