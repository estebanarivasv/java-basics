import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Parameter;

import reflect.Demo;

public class ReflectTest {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException, SecurityException {

        /**
         * Solicito una clase que se llame así
         */
		@SuppressWarnings("rawtypes")
		Class demoClass = Class.forName("reflect.Demo");
        
        @SuppressWarnings("rawtypes")
		Constructor[] constructores = demoClass.getConstructors();
        
        /**
         * Ejecuto el único constructor y creo un objeto        
         */
        Demo d = (Demo)constructores[0].newInstance(new Object[] {Integer.valueOf(5), "cinco"});
        
        Field fieldI1 = demoClass.getDeclaredField("i1");
        
        Object valueI1 = fieldI1.get(d);
        
        System.out.println("Value de I1 -> " + valueI1);
        
        /**
         * Itero por los campos del objeto
         */
        System.out.println("FIELDS -->");
        for (Field f : d.getClass().getDeclaredFields()) {
        	if (!f.canAccess(d)) {
        		f.setAccessible(Boolean.TRUE);
        	}
    		System.out.println(Modifier.toString(f.getModifiers()) + " " + f.getType() + " " + f.getName() + " " + f.get(d));
        }
        
        System.out.println();
        
        /**
         * Itero por los metodos del objeto
         */
        System.out.println("METHODS -->");
        for (Method m : d.getClass().getDeclaredMethods()) {
        	if (!m.canAccess(d)) {
        		m.setAccessible(Boolean.TRUE);
        	}
        	
        	System.out.print(Modifier.toString(m.getModifiers()) + " " + m.getReturnType() + " " + m.getName() + " (");
        	Parameter[] param = m.getParameters();
        	
        	int count = 0;
        	for (Parameter p : param) {
        		if (count > 0) {
        			System.out.print(", ");
        			count++;
        		}
        		
        		System.out.print(p.getType() + " " + p.getName());
        	}
        	
        	System.out.print(")");
        	
        	Class<?>[] exceptions = m.getExceptionTypes();
        	
        	if (exceptions.length > 0) {
        		System.out.print(" throws ");
            	
        		count = 0;
            	for (Class<?> exc : exceptions) {
            		if (count > 0) {
            			System.out.print(", ");
            			count++;
            		}
            		
            		System.out.print(exc.getSimpleName());
            	}
        	}
         		
        	System.out.println();
        	
        }
        
        System.out.println();
        
        /*
         * Itero por las interfaces que implementa
         */
        System.out.println("IMPLEMENTA -->");
        Class<?>[] interfaces = d.getClass().getInterfaces();
        
        for (Class<?> i : interfaces) {
        	System.out.println(i.getSimpleName());
        }
        
        System.out.println();
        System.out.println("SUPERCLASE --> " + d.getClass().getSuperclass().getSimpleName());
	}

}
