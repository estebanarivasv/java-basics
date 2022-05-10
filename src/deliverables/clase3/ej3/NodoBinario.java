package deliverables.clase3.ej3;

/*
* 3. Implementar las clases **Pila** y **Fila** sin utilizar Collections
 * */
public class NodoBinario<T> {

    private T dato;
    private NodoBinario<T> antNodo;
    private NodoBinario<T> sigNodo;

    public NodoBinario(T dato) {
        this.dato = dato;
        this.antNodo = null;
        this.sigNodo = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public void setSigNodo(NodoBinario<T> nodo) {
        this.sigNodo = nodo;
    }

    public NodoBinario<T> getSigNodo() {
        return this.sigNodo;
    }

    public NodoBinario<T> getAntNodo() {
        return antNodo;
    }

    public void setAntNodo(NodoBinario<T> antNodo) {
        this.antNodo = antNodo;
    }
}
