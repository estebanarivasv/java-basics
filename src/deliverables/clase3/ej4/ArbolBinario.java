package deliverables.clase3.ej4;


public class ArbolBinario<Integer> {

    Nodo<Integer> raiz;

    private Nodo<Integer> insertarRecursivo(Nodo<Integer> actual, int valor) {
        // Creamos un nodo, si no existe
        if (actual == null) {
            return new Nodo<Integer>(valor);
        }
        if (valor < actual.valor) {
            // Si el valor del nuevo nodo es menor al del actual, lo mandamos al nodo izquierdo
            actual.nodoIzquierdo = insertarRecursivo(actual.nodoIzquierdo, valor);
        } else if (valor > actual.valor) {
            // Si el valor del nuevo nodo es mayor al del actual, lo mandamos al nodo derecho
            actual.nodoDerecho = insertarRecursivo(actual.nodoDerecho, valor);
        } else {
            // Si el valor ya existe, lo devolvemos
            return actual;
        }
        // Si el nuevo nodo actual es nulo, hemos encontrado un nodo hoja, donde insertamos el nuevo nodo en esa posicion
        return actual;
    }

    // Este método inicia la recusion desde el nodo raiz
    public void add(int value) {
        raiz = insertarRecursivo(raiz, value);
    }

    // 1- Raiz, 2- Izquierdo, 3- Derecho
    public void recorrerPreOrder(Nodo<Integer> nodo) {
        if (nodo != null) {
            System.out.print("\t" + nodo.valor);
            recorrerPreOrder(nodo.nodoIzquierdo);
            recorrerPreOrder(nodo.nodoDerecho);
        }
    }

    // 1- Izquierdo, 2- Raiz, 3- Derecho
    public void recorrerInOrder(Nodo<Integer> nodo) {
        if (nodo != null) {
            recorrerInOrder(nodo.nodoIzquierdo);
            System.out.print("\t" + nodo.valor);
            recorrerInOrder(nodo.nodoDerecho);
        }
    }

    // 1- Izquierdo, 2- Derecho, 3- Raiz
    public void recorrerPostOrder(Nodo<Integer> nodo) {
        if (nodo != null) {
            recorrerPostOrder(nodo.nodoIzquierdo);
            recorrerPostOrder(nodo.nodoDerecho);
            System.out.print("\t" + nodo.valor);
        }
    }


}
