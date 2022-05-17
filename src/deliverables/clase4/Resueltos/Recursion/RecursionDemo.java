package deliverables.clase4.Resueltos.Recursion;

import java.util.Arrays;
import java.util.List;

public class RecursionDemo {
	
	public <E> void mostrarAlReves(List<E> l) {
		if (l == null || l.isEmpty() ) {
			return;
		}
		
		if (l.size() == 1) {
			System.out.println(l.get(0));
		} else {
			mostrarAlReves(l.subList(1, l.size()));
			System.out.println(l.get(0));
		}
	}

	public static void main(String[] args) {

		List<Integer> l = Arrays.asList(new Integer[] {1, 2, 3, 4, 5});
		
		new RecursionDemo().mostrarAlReves(l);
	}

}
