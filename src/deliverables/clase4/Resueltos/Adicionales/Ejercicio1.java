package deliverables.clase4.Resueltos.Adicionales;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Ejercicio1 {

	public static void main(String[] args) {

		List<Integer> lInt = Stream.iterate(10, x -> x + 2)
								   .limit(6)
								   .collect(Collectors.toList()); // podemos usar directamente el toList de Stream

		System.out.println(lInt);

		lInt = Stream.iterate(10, x -> x + 2).limit(6).toList();
		
		lInt = Stream.iterate(10, x -> x < 21, x -> x + 2)
				     .toList();
		
		System.out.println(lInt);
		
		lInt = Stream.iterate(10, x -> x + 1)
					 .limit(11)
					 .filter(x -> x % 2 == 0)
					 .toList();
		
		System.out.println(lInt);
		
		lInt = IntStream.rangeClosed(10, 20)
						.filter(x -> x % 2 == 0)
						.boxed()
						.collect(Collectors.toList());

		System.out.println(lInt);

		lInt = IntStream.rangeClosed(10, 20)
						.filter(x -> x % 2 == 0)
						.mapToObj(Integer::valueOf)
						.toList();	

		System.out.println(lInt);
	}

}
