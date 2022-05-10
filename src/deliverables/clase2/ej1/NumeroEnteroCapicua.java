package deliverables.clase2.ej1;

/*
* 1 - Número entero capicua.
	Construir un metodo que reciba un entero como parámetro y devuelva boolean indicando si es capicúa o no dicho número.
*/

class NumeroEnteroCapicua {

    private Integer num;

    public NumeroEnteroCapicua(Integer numero) {
        this.num = numero;
    }

    public Integer getNumero() {
        return num;
    }

    public void setNumero(Integer numero) {
        this.num = numero;
    }

    public boolean esCapicua() {
        Integer numeroOriginal = this.getNumero();
        Integer numeroInvertido = 0;

        System.out.println("Numero inicial: " + numeroOriginal);
        while (num > 0) {
            System.out.println("\nNumeros por analizar: " + num);
            // Se calcula el modulo dividiendo por 10 para obtener el resto, y así, el ultimo valor para
            // agregarlo a final de "numeroInvertido".
            int ultimoDigito = num % 10;  // Este mismo valor sera sumado al numero invertido
            // Se multiplica el numero invertido por 10 para aceptar el nuevo digito sumandolo
            numeroInvertido = numeroInvertido * 10 + ultimoDigito;
            num = num / 10;   // Se divide para quitar el ultimo digito y continuar con la iteración
            System.out.println("Ultimo digito: " + ultimoDigito);
            System.out.println("Numero que va resultando: " + numeroInvertido);
        }

        System.out.println("\nNumero invertido: " + numeroInvertido);
        System.out.println("Numero original: " + numeroOriginal);

        return numeroInvertido.equals(numeroOriginal);
    }

    public static void manejarSalida(Boolean esCapicua) {
        if (esCapicua) {
            System.out.println("Es capicua.");
        } else {
            System.out.println("No es capicua.");
        }
        System.out.println("\n\n");
    }

    public static void main(String[] args) {

        NumeroEnteroCapicua num1 = new NumeroEnteroCapicua(998757899);
        NumeroEnteroCapicua num2 = new NumeroEnteroCapicua(252);
        NumeroEnteroCapicua num3 = new NumeroEnteroCapicua(333);
        NumeroEnteroCapicua num4 = new NumeroEnteroCapicua(9715469);

        NumeroEnteroCapicua.manejarSalida(num1.esCapicua());
        NumeroEnteroCapicua.manejarSalida(num2.esCapicua());
        NumeroEnteroCapicua.manejarSalida(num3.esCapicua());
        NumeroEnteroCapicua.manejarSalida(num4.esCapicua());

    }

}