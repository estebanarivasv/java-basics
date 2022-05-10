import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Demo {

	public static void main(String[] args) {
		
		/**
		 * Creamos nuestra propia lambda y la probamos
		 */
		
		InterfaceFuncionalEjemplo ifun = (a, b, c) -> a * b * c;
		
		System.out.println(ifun.process(10, 20, 30));
		
		ValoresBean vBean = new ValoresBean(10, 20, 30);
		
		System.out.println(vBean.procesarValores((a, b, c) -> a * b * c));
		System.out.println(vBean.procesarValores(ifun));		
		/**
		 * Ejemplo de Lambda Supplier
		 */
		Supplier<String> str = () -> "Hola Mundo!";
		
		System.out.println(str.get());
		
		Consumer<String> cons = x -> System.out.println(x);
		
		cons.accept("HOLA QUE TAL");
		
		Function<Integer, Integer> duplicar = x -> 2*x;
		
		System.out.println(duplicar.apply(10));
		
		UnaryOperator<Integer> duplicar2 = x -> 2*x;

		/**
		 * Lambdas & Streams en Collections
		 */
		
		List<Integer> l = Arrays.asList(new Integer[] {1, 2, 3, 4, 5, 6, 7});
		
		l.stream()                        // Creamos un Stream a partir de la lista
		 .map(Integer::intValue)          // Generamos otro Stream transformando los Integer en int
		 .map(x -> x + 10)                // Generamos otro Stream sumandole 10 a cada elemento
		 .filter(x -> x % 2 == 0)         // Filtramos los pares
		 .forEach(System.out::println);   // Imprimimos los resultados
		
		
		// El segundo paso, generar un Stream de Int lo podemos hacer de otra manera.
		
		l.stream()                        // Creamos un Stream a partir de la lista
		 .mapToInt(x -> x)          // Generamos otro Stream transformando los Integer en int
		 .map(x -> x + 10)                // Generamos otro Stream sumandole 10 a cada elemento
		 .filter(x -> x % 2 == 0)         // Filtramos los pares
		 .forEach(System.out::println);   // Imprimimos los resultados
		
		/**
		 * Obtener el maximo par
		 */
		Integer maximo = l.stream().mapToInt(x -> x).filter(x -> x % 2 == 0).reduce(Integer::max).getAsInt();
		
		System.out.println("Maximo --> " + maximo);
		
		/**
		 * Utilizar collectors
		 */
		System.out.println("La lista tiene " + l.stream().collect(Collectors.counting()) + " elementos.");
		
		System.out.println("{" + l.stream().map(x -> x.toString()).collect(Collectors.joining(",")) + "}");
		
		Stream.of(1, 2, 3, 4)
		.map(x -> "Numero " + x)
		.map(x -> x + ".")
		.collect(Collectors.toList()).forEach(System.out::println);
	}

}
