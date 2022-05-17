package deliverables.clase4.ej1;

import java.util.concurrent.TimeUnit;

// Mostrar los numeros del 1 al 20 con un retardo de 3 segundos entre cada numero
public class ThreadOfNumbers extends Thread {

    @Override
    public void run() {
        int i;
        for (i = 1; i <= 20; i++) {
            try {
                TimeUnit.SECONDS.sleep(3);
                System.out.println(i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[] args) {
        ThreadOfNumbers numbersThread = new ThreadOfNumbers();
        numbersThread.start();
        System.out.println("ThreadOfNumbers finalizó la ejecución.");
    }
}
