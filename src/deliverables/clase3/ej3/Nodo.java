package deliverables.clase3.ej3;

/*
* 3. Implementar las clases **Pila** y **Fila** sin utilizar Collections
 * */
public class Nodo<T> {

    private T dato;
    private Nodo<T> siguiente;

    public Nodo(T dato) {
        this.dato = dato;
        this.siguiente = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public void setNodoSiguiente(Nodo<T> nodo) {
        this.siguiente = nodo;
    }

    public Nodo<T> getNodoSiguiente() {
        return this.siguiente;
    }

}
