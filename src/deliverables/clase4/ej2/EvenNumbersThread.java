package deliverables.clase4.ej2;

import java.util.concurrent.TimeUnit;

// Imprima numeros pares (1 al 10) y calcule la suma.
public class EvenNumbersThread implements Runnable {

    @Override
    public void run() {
        int i;
        int even;
        int sum = 0;
        for (i = 1; i <= 5; i++) {
            even = i * 2;
            sum += even;
            System.out.println("Par: " + even);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Suma pares: " + sum);
    }
}
