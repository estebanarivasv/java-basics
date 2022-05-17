package deliverables.clase4.Resueltos.Adicionales;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Ejercicio3 {
	
	public static String concatNumerico(Integer x) {
		String str = "";
		
		for (int i = 0; i <= x; i++) {
			str += x;
		}
		
		return str;
	}

	public static void main(String[] args) {

		String concat = Ejercicio2.obtenerListaSecuencial(10, 20)
						          .stream()
						          .map(x -> String.valueOf(x)).collect(Collectors.joining(" -> "));

		System.out.println(concat);

		concat = Ejercicio2.obtenerListaSecuencial(1, 9)
		          		   .stream()
		          		   .map(x -> concatNumerico(x))
		          		   .reduce("", (x, y) -> y = x + y);
		
		
		System.out.println(concat);
	}

}
