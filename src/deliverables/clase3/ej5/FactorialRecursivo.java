package deliverables.clase3.ej5;

/*
* 5. **Recursion**: Método factorial recursivo
* */
public class FactorialRecursivo {

    int num;
    int result;

    public FactorialRecursivo(int num) {
        this.num = num;
    }

    public static int getFactorial(int numero) {
        if (numero == 0)
            return 1;
        return numero * getFactorial(numero - 1);
    }

    public void imprimirResultadoFactorial() {
        int i;
        System.out.print("\n" + num + "! = ");
        for (i = 1; i<=num; i++) {
            if (i == num) {
                System.out.print(i);
            } else {
                System.out.print(i + " * ");
            }
        }
        System.out.print(" = " + getFactorial(num));
    }

    public static void main(String[] args) {

        new FactorialRecursivo(16).imprimirResultadoFactorial();
        new FactorialRecursivo(2).imprimirResultadoFactorial();
        new FactorialRecursivo(6).imprimirResultadoFactorial();
        new FactorialRecursivo(9).imprimirResultadoFactorial();
        new FactorialRecursivo(13).imprimirResultadoFactorial();
        new FactorialRecursivo(11).imprimirResultadoFactorial();

    }

}
