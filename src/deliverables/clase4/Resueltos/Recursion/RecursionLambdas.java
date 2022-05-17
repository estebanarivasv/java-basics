package deliverables.clase4.Resueltos.Recursion;

import java.util.function.Function;

public class RecursionLambdas {

	public static Function<Integer,Long> factorial;

	static {
	    factorial = n -> {
	        assert n >= 0;
	        return (n == 0) ? 1 : n * factorial.apply(n - 1);
	    };
	}	

	
	public static void main(String[] args) {
		
		System.out.println(factorial.apply(10));

		Function<Long, Function<Long, Function<Long, Long>>> sumatoria = x -> y -> z -> x + y + z;
		
		System.out.println(sumatoria.apply(factorial.apply(2))
				 					.apply(factorial.apply(3))
				 					.apply(factorial.apply(4)));
	}

}
