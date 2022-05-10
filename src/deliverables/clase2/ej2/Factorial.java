package deliverables.clase2.ej2;

/*
* 2 - Factorial
	Metodo que recibe un entero y devuelve el factorial del mismo
* */
public class Factorial {

    public static int getFactorial(int num) {
        if (num == 0)
            return 1;
        return num * getFactorial(num - 1);
    }

    public static void printOutput(int num) {
        int i;
        System.out.print("\n" + num + " = ");
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
        printOutput(5);
        printOutput(9);
        printOutput(30);
        printOutput(15);
    }
}
