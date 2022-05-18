package deliverables.clase4.ej2;

import java.util.concurrent.TimeUnit;

// Imprima numeros pares (1 al 10) y calcule la suma.
public class ThreadNrosPares implements Runnable {

    @Override
    public void run() {
        int i;
        int par;
        int suma = 0;
        for (i = 1; i <= 5; i++) {
            par = i * 2;
            suma += par;
            System.out.println("Par: " + par);
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Suma pares: " + suma);
    }
}
