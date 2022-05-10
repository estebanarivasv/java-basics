package deliverables.clase3.ej3;

import java.util.EmptyStackException;

/*
 * STACK - LIFO
 * */
public class Pila<T> {

    Nodo<T> ultimo;    // Last node
    int tam;        // tamaño

    public Pila() {
        this.ultimo = null;
        this.tam = 0;
    }

    public boolean estaVacio() {
        return ultimo == null;
    }

    // get the number of elements in the stack
    public int getTam() {
        return tam;
    }

    // add a new element to the top of the stack
    public void apilar(T dato) {
        Nodo<T> nodo = new Nodo<T>(dato);
        nodo.setNodoSiguiente(ultimo);

        ultimo = nodo;
        tam++;

        System.out.println("Elemento añadido a la pila: " + nodo.getDato()
                + " -> Tamaño pila: " + getTam());
    }

    public void desapilar() {
        if (estaVacio()) throw new EmptyStackException();
        else {
            Object dato = ultimo.getDato();
            Nodo<T> siguiente = ultimo.getNodoSiguiente();

            ultimo = siguiente;
            tam--;

            System.out.println("Elemento removido de la pila: " + dato
                    + " -> Tamaño pila: " + getTam());
        }
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

