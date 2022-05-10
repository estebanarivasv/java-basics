package deliverables.clase3.ej4;

/*
* 4. Implementar la clase **Arbol Binario** con los 3 recorridos básicos (inOrden, preOrden y postOrden)
 * */
public class Nodo<Integer> {

    int valor;
    Nodo<Integer> nodoIzquierdo;
    Nodo<Integer> nodoDerecho;

    public Nodo(int valor) {
        this.valor = valor;
        this.nodoIzquierdo = null;
        this.nodoDerecho = null;
    }
}
