package deliverables.clase3.ej2;

import deliverables.clase3.ej1.Pila;

import java.util.ArrayList;

/*
* 2. Implementar la clase **Fila** (cola), utilizando una Collection que no implemente la interfaz Queue/Deque
 * */
public class Fila<T> {

    private final ArrayList<T> fila;

    public Fila() {
        this.fila = new ArrayList<T>();
    }

    public ArrayList<T> getFila() {
        return fila;
    }

    public void encolar(T data) {
        this.fila.add(0, data);
        System.out.println("Elemento añadido a la fila: " + data
                + " -> " + getFila());
    }

    public void desencolar() {
        T datoBorrado = this.fila.remove(this.fila.size() - 1);
        System.out.println("Elemento removido de la fila: " + datoBorrado
                + " -> " + getFila());
    }

    public static void main(String[] args) {
        Fila<String> fideos = new Fila<String>();

        fideos.encolar("Luchetti");
        fideos.encolar("Matarazzo");
        fideos.encolar("Arcor");
        fideos.desencolar();
        fideos.desencolar();
        fideos.encolar("Favorita");
        fideos.encolar("Regio");
        fideos.encolar("Vigente");
        fideos.desencolar();
        fideos.desencolar();
        fideos.desencolar();
        fideos.desencolar();
    }

}
