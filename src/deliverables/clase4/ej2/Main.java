package deliverables.clase4.ej2;

/* Generar un Thread o una Implementacion de Runnable que imprima numeros pares (1 al 10) y calcule la suma.
Lanzar junto a otro Thread o Runnable que imprima impares (1 al 10) y calcula la suma.
Cada Thread muestra la suma resultante cuando finaliza. Utilizar las pausas necesarias para que se observe
el paralelismo.
 */

public class Main {

    public static void main(String[] args) {
        Thread threadNrosPares = new Thread(new ThreadNrosPares());
        Thread threadNrosImpares = new Thread(new ThreadNrosImpares());

        threadNrosPares.start();
        threadNrosImpares.start();
    }
}
