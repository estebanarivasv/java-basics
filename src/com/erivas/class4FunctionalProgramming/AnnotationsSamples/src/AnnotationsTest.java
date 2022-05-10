import java.lang.reflect.Field;

public class AnnotationsTest {

	public static void validateUsuario(Usuario u) throws Exception {
		
		for (Field f : u.getClass().getDeclaredFields()) {
			if (f.isAnnotationPresent(ValidField.class)) {
				ValidField vf = f.getAnnotation(ValidField.class);
				
				String valueField = (String)f.get(u);
				
				if (valueField == null) {
					throw new Exception("El campo [" + f.getName() + "] no puede ser NULL");
				}
				
				if (valueField.length() < vf.minLength()) {
					throw new Exception("El campo [" + f.getName() + "] posee el valor [" + valueField + "] de longitud [" + valueField.length() + "] y la longitud minima es [" + vf.minLength() + "]");
				}

				if (valueField.length() > vf.maxLength()) {
					throw new Exception("El campo [" + f.getName() + "] posee el valor [" + valueField + "] de longitud [" + valueField.length() + "] y la longitud maxima es [" + vf.maxLength() + "]");
				}
			}
		}
	}
	
	public static void main(String[] args) {

		Usuario u = new Usuario("UserNamexxxxxxxxxxxxxxxxx", "12345");
		
		try {
			validateUsuario(u);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
