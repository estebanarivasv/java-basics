package deliverables.clase4.Resueltos.Adicionales;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Ejercicio4 {
	
	private static final String str = "Un texto literario es un documento en el que se relata un hecho utilizando figuras literarias con el fin de hacerlo atractivo, de embellecer la lectura y as� captar la atenci�n del lector. Puede tratar cualquier tema, describir un momento hist�rico o un paisaje, puede incluso basarse en alg�n acontecimiento real o puede tratarse de un texto imaginativo. En cuanto a la extensi�n, puede ser un documento de varias p�ginas o de tan s�lo unas l�neas lo importante es que el lenguaje utilizado sea correcto y es habitual que contenga expresiones literarias como met�foras, onomatopeyas, polis�ndeton";
	
	public static void main(String[] args) {

		String[] strSplit = str.replaceAll("\\.", "").replaceAll(",", "").split(" ");
		
		Map<Integer, List<String>> wordsByDimension = Arrays.stream(strSplit)
															.distinct()
															.collect(Collectors.groupingBy(String::length));
	
		wordsByDimension.forEach((key, value) -> { 
													System.out.println(key + " letras [" + value.size() + "] :");
													value.stream().forEach(System.out::println);
													System.out.println();
				
												 });
	}

}
