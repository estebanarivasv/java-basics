package deliverables.clase3.ej1;

import java.util.ArrayList;

// LIFO sample

/*
* 1. Implementar la clase **Pila**, utilizando una Collection que no implemente la interfaz Queue/Deque
 * */
public class Pila<T> {

    private final ArrayList<T> pila;

    public Pila() {
        this.pila = new ArrayList<T>();
    }

    public ArrayList<T> getPila() {
        return pila;
    }

    public void apilar(T data) {
        this.pila.add(0, data);
        System.out.println("Elemento añadido a la pila: " + data
                + " -> " + getPila());
    }

    public void desapilar() {
        T datoBorrado = this.pila.remove(0);
        System.out.println("Elemento removido de la pila: " + datoBorrado
                + " -> " + getPila());
    }

    public static void main(String[] args) {

        Pila<String> autos = new Pila<String>();
        autos.apilar("Clio");
        autos.apilar("Suran");
        autos.apilar("Toro");
        autos.desapilar();
        autos.apilar("Hilux");
        autos.apilar("QQ");
        autos.apilar("Cronos");
        autos.desapilar();
        autos.desapilar();
        autos.desapilar();
        autos.desapilar();
        autos.desapilar();


    }
}

