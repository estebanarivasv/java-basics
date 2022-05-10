package deliverables.clase3.ej4;

public class ArbolBinarioImpl {

    public static void main(String[] args) {

        ArbolBinario<Integer> arbolBinario = new ArbolBinario<>();

        arbolBinario.add(10);
        arbolBinario.add(5);
        arbolBinario.add(15);
        arbolBinario.add(7);
        arbolBinario.add(12);

        System.out.println("\n PreOrder: ");
        arbolBinario.recorrerPreOrder(arbolBinario.raiz);
        System.out.println("\n InOrder: ");
        arbolBinario.recorrerInOrder(arbolBinario.raiz);
        System.out.println("\n PostOrder: ");
        arbolBinario.recorrerPostOrder(arbolBinario.raiz);
    }
}