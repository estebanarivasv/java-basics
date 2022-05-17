package deliverables.clase4.Resueltos.Adicionales;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Ejercicio5 {
	
	@FunctionalInterface
	public interface LambdaFunction<T, L, R> {
		R apply(T t, L l);
	}
	
	public static <T> T eval(LambdaFunction<T, T, T> f, T ... params) {
		return f.apply(params[0], params[1]);
	}

	public static <T> T evalBI(BiFunction<T, T, T> f, T ... params) {
		return f.apply(params[0], params[1]);
	}

	public static <T> T evalFunc(Function<T, Function<T, T>> f, T ... params) {
		return f.apply(params[0])
				.apply(params[1]);
	}

	public static <T> T evalTriFunc(Function<T, Function<T, Function<T, T>>> f, T ... params) {
		return f.apply(params[0])
				.apply(params[1])
				.apply(params[2]);
	}
	
	public static void main(String[] args) {

		/**
		 * f(x, y) = 2*x + 3*y con Interfaz Funcional propia
		 */
		LambdaFunction<Long, Long, Long> lf = new LambdaFunction<Long, Long, Long>() {

			@Override
			public Long apply(Long t, Long l) {
				return 2*t + 3*l;
			}
		};
	
		System.out.println("f(x, y) = 2*x + 3*y (sin lambda) -> " + eval(lf, 3L, 4L));
		
		/**
		 * ahora invocaremos eval directamente con un lambda que haga matching
		 */
		System.out.println("f(x, y) = 2*x + 3*y (con lambda) -> " + eval((x, y) -> 2*x + 3*y, 3L, 4L));
		
		/**
		 * Ahora utilicemos la interface funcional BiFunction que nos provee java
		 */
		BiFunction<Long, Long, Long> biFunc = new BiFunction<Long, Long, Long>() {

			@Override
			public Long apply(Long t, Long u) {
				return 2*t + 3*u;
			}
			
		};

		
		System.out.println("f(x, y) = 2*x + 3*y (sin lambda con BIFunction) -> " + evalBI(biFunc, 3L, 4L));
		
		/**
		 * ahora invocaremos evalBI directamente con un lambda que haga matching
		 */
		System.out.println("f(x, y) = 2*x + 3*y (con lambda con BIFunction) -> " + evalBI((x, y) -> 2*x + 3*y, 3L, 4L));
		
		/**
		 * Ahora intentaremos implementarlo con Function (Function solo recibe un parametro!) -> Currying
		 */
		
		Function<Long, Function<Long, Long>> func = new Function<Long, Function<Long, Long>>() {

			@Override
			public Function<Long, Long> apply(Long t) {
				return new Function<Long, Long>() {

					@Override
					public Long apply(Long u) {
						return 2*t + 3*u;
					}
					
				};
			}
			
		};
		
		System.out.println("f(x, y) = 2*x + 3*y (sin lambda con Function) -> " + evalFunc(func, 3L, 4L));
		
		System.out.println("f(x, y) = 2*x + 3*y (con lambda con Function) -> " + evalFunc(x -> y -> 2*x + 3*y, 3L, 4L));
	
		/**
		 * Implementamos f(x, y, z) = 2*x + 3*y + 4*z con Function
		 * 
		 */
	
		Function<Long, Function<Long, Function<Long, Long>>> triFunc = new Function<Long, Function<Long, Function<Long, Long>>>() {

			@Override
			public Function<Long, Function<Long, Long>> apply(Long t) {
				return new Function<Long, Function<Long, Long>>() {

					@Override
					public Function<Long, Long> apply(Long u) {
						// TODO Auto-generated method stub
						return new Function<Long, Long>() {

							@Override
							public Long apply(Long v) {
								// TODO Auto-generated method stub
								return 2*t + 3*u + 4*v;
							}
							
						};
					}
					
				};
			}
			
		};
		
		System.out.println("f(x, y, z) = 2*x + 3*y + 4*z (sin lambda con Function) -> " + evalTriFunc(triFunc, 3L, 4L, 5L));

		System.out.println("f(x, y, z) = 2*x + 3*y + 4*z (con lambda con Function) -> " + evalTriFunc(x -> y -> z -> 2*x + 3*y + 4*z, 3L, 4L, 5L));
		
	}

}
