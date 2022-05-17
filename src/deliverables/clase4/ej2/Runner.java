package deliverables.clase4.ej2;

/* Generar un Thread o una Implementacion de Runnable que imprima numeros pares (1 al 10) y calcule la suma.
Lanzar junto a otro Thread o Runnable que imprima impares (1 al 10) y calcula la suma.
Cada Thread muestra la suma resultante cuando finaliza. Utilizar las pausas necesarias para que se observe
el paralelismo.
 */

public class Runner {

    public static void main(String[] args) {
        Thread evenNumbersThread = new Thread(new EvenNumbersThread());
        Thread oddNumbersThread = new Thread(new OddNumbersThread());

        evenNumbersThread.start();
        oddNumbersThread.start();
    }
}
