package deliverables.clase4.Resueltos.Adicionales;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Ejercicio2 {

	public static List<Integer> obtenerListaSecuencialCondicionada(Integer desde, Integer hasta, Predicate<Integer> condicion) {
		return Stream.iterate(Optional.ofNullable(desde)
									  .orElse(1), 
							  x -> x <= Optional.ofNullable(hasta)
							  					.orElse(100), 
							  x -> x + 1)
					 .filter(Optional.ofNullable(condicion)
							 		 .orElse(x -> true))
					 .toList();
	}

	public static List<Integer> obtenerListaSecuencialCondicionadaMultiple(Integer desde, Integer hasta, List<Predicate<Integer>> condiciones) {
		Predicate<Integer> condCompuesta = Optional.ofNullable(condiciones)
												   .orElse(List.of(x -> true))
												   .stream()
												   .reduce((x, y) -> y.and(x))
												   .orElse(x -> true);
		
		return obtenerListaSecuencialCondicionada(desde, hasta, condCompuesta);
	}

	public static List<Integer> obtenerListaSecuencial(Integer desde, Integer hasta) {
		return obtenerListaSecuencialCondicionada(desde, hasta, null);
	}
	
	@SafeVarargs
	public static List<Integer> obtenerListaSecuencialCondicionadaMultiple(Integer desde, Integer hasta, Predicate<Integer> ... condiciones) {
		return obtenerListaSecuencialCondicionadaMultiple(desde, hasta, Arrays.asList(Optional.ofNullable(condiciones).orElse(null)));
	}
	
	public static void main(String[] args) {

		List<Integer> lInt = obtenerListaSecuencialCondicionada(10, 20, x -> x % 2 == 0);
		
		System.out.println(lInt);

		lInt = obtenerListaSecuencialCondicionada(1, 100, x -> x % 3 == 0);
		
		System.out.println(lInt);

		lInt = obtenerListaSecuencialCondicionadaMultiple(1, 100, x -> x % 3 == 0, x -> x % 2 == 0);
		
		System.out.println(lInt);

		lInt = obtenerListaSecuencialCondicionadaMultiple(1, 100, new ArrayList<Predicate<Integer>>());
		
		System.out.println(lInt);

		lInt = obtenerListaSecuencial(1, 50);
		
		System.out.println(lInt);
		
	
	}

}
