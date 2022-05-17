package deliverables.clase4.ej2;

import java.util.concurrent.TimeUnit;

// imprima impares (1 al 10) y calcula la suma
public class OddNumbersThread implements Runnable {

    @Override
    public void run() {
        int i;
        int sum = 0;
        for (i = 1; i <= 10; i = i + 2) {
            sum += i;
            System.out.println("Impar: " + i);

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }
        System.out.println("Suma impares: " + sum);
    }
}
