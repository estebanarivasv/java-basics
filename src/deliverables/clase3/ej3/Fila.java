package deliverables.clase3.ej3;

/*
 * QUEUE - FIFO
 * */
public class Fila<T> {

    NodoBinario<T> primero;
    NodoBinario<T> ultimo;
    int tam;

    public Fila() {
        this.primero = null;
        this.ultimo = null;
        this.tam = 0;
    }

    public int getTam() {
        return tam;
    }

    public void encolar(T dato) {
        // crear nuevo nodo
        NodoBinario<T> nodo = new NodoBinario<T>(dato);
        // seteamos el nodo siguiente como el nodo actual
        nodo.setSigNodo(ultimo);

        System.out.println("\nCreando nuevo nodo: " + nodo);

        if (ultimo != null) {
            NodoBinario<T> nodoViejo = ultimo;
            nodoViejo.setAntNodo(nodo);
            System.out.println(
                    "\nEn memoria: " + nodoViejo +
                    "\nAñadiendo '"+ nodo.getDato() + "' como NODO ANTERIOR a ultimo '" + nodoViejo.getDato() + "'" +
                    " -> Tamaño fila: " + getTam() + "\nAnterior: " + nodoViejo.getAntNodo() + " Siguiente: " + nodoViejo.getSigNodo());
        }
        if ((ultimo == null) && (primero == null)) {
            primero = nodo;
            ultimo = nodo;
        } else {
            ultimo = nodo;
        }
        tam++;

        System.out.println(
                "\nEn memoria: " + ultimo +
                "\nElemento AÑADIDO a la fila: " + ultimo.getDato() +
                " -> Tamaño fila: " + getTam() + "\nAnterior: " + ultimo.getAntNodo() + " Siguiente: " + ultimo.getSigNodo() + "\n");
    }

    public void desencolar() {
        NodoBinario<T> nodoBorrado = primero;
        NodoBinario<T> anterior = primero.getAntNodo();

        primero = anterior;
        tam--;

        System.out.println(
                "\nEn memoria: " + primero +
                        "\nElemento REMOVIDO de la fila: " + nodoBorrado.getDato() +
                        " -> Tamaño fila: " + getTam() + "\nAnterior: " + nodoBorrado.getAntNodo() + " Siguiente: " + nodoBorrado.getSigNodo());

    }

    public static void main(String[] args) {

        Fila<String> fideos = new Fila<>();

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
