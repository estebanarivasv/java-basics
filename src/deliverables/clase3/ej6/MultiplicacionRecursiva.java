package deliverables.clase3.ej6;

public class MultiplicacionRecursiva {

    public static int multiplicar(int x, int y) {
        if (y != 0) {
            // Encontramos de manera recursiva "y" veces la sumatoria de x
            return (x + multiplicar(x, y - 1));
        } else {
            return 0;
        }
    }

    public static void imprimirResultadoFactorial(int x, int y) {
        System.out.println("Multiplicacion -> " + x + " * " + y + " = " + multiplicar(x, y));
    }


    public static void main(String[] args) {
        MultiplicacionRecursiva.imprimirResultadoFactorial(9, 21);
        MultiplicacionRecursiva.imprimirResultadoFactorial(2, 3);
        MultiplicacionRecursiva.imprimirResultadoFactorial(8, 2);
    }

}
