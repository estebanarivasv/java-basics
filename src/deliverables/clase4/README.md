## Clase IV - Ejercicios

### Threads

1. Mostrar los numeros del 1 al 20 con un retardo de 3 segundos entre cada numero
2. Generar un Thread o una Implementacion de Runnable que imprima numeros pares (1 al 10) y calcule la suma.  Lanzar junto a otro Thread o Runnable que imprima impares (1 al 10) y calcula la suma.  Cada Thread muestra la suma resultante cuando finaliza.  Utilizar las pausas necesarias para que se observe el paralelismo.

### Streams & Lambdas

1. Defina la clase Alumno con los siguientes campos:

        int id
        string dni
        string nombre
        string apellido
        string curso
        double nota
        int edad

    Cree un Lista y carge un numero considerable de alumnos para que el ejercicio sea viable (15 o mas) con valores a azar.
    1. Muestre todos los alumnos de la lista
    2. Muestre todos los alumnos ordenados de menor a mayor por edad
    3. Muestre aquellos alumnos cuyo nombre empieza con un caracter dado (elegir el caracter en base a la lista de nombre que se utilizo)
    4. Sume la edad de todos los alumnos
    5. Obtenga un mapa donde la clave sea la nota y el valor sea una lista de alumnos que tienen esa nota

2. Construir un Stream de numeros naturales que contenga todos los números pares mayores o iguales a 10 y menores o iguales a 20.  Presentar en una lista de Integer en forma ordenada.
Existen varias formas de realizar esto y me gustaría ver todas las opciones que se les ocurren.

3. Si pudieron realizar correctamente el anterior, ahora creemos un método como el siguiente:

	    List<Integer> obtenerListaSecuencialCondicionada(Integer desde, Integer hasta, Predicate<Integer> condicion)

    Como ven, estoy generalizando el ejercicio anterior. Y, como establecerían la posibilidad de recibir múltiples predicados condicionales?
    
        List<Integer> obtenerListaSecuencialCondicionadaMultiple(Integer desde, Integer hasta, List<Predicate<Integer>> condiciones)
        List<Integer> obtenerListaSecuencialCondicionadaMultiple(Integer desde, Integer hasta, Predicate<Integer>[] condiciones)	
        List<Integer> obtenerListaSecuencialCondicionadaMultiple(Integer desde, Integer hasta, Predicate<Integer> ... condicion)		

Desarrollar los 3 por favor. Es posible, por que? Si no es posible, defina 2.

Ahora pensemos que cualquiera de los parámetros (desde, hasta, condicion) podrían ser nulos.  Como lo resolverían.  Incluso, implementemos el metodo:

	List<Integer> obtenerListaSecuencial(Integer desde, Integer hasta)  reutilizando el metodo anterior!!!

4. Utilizando el metodo anterior, obtenga una lista de numeros entre 2 limites y proceda a transformarlos en String para despues obtener una cadena como la siguiente:
10 -> 11 -> 12 -> 13 -> 14 -> 15 ...
Y como haría para obtener un String concatenando n veces el número a concatenar?, ej:

        122333444455555....

5. Tome un texto considerablemente largo de alguna página de internet y colóquelo en un String.  Proceda a quitarle los simbolos de puntuación (, . ;).  Luego realice un split en base a los espacios en blanco.  Asi obtenemos una arreglo de palabras.
Procesar dicho arreglo con un stream, quitando los duplicados y clasificando las palabras respecto de su dimensión, para lograr algo similar a esto:

        1 letra [5]:
        A
        a
        y
        e
        o
        
        2 letras [2]:
        de
        un
        
        3 letras ....

6. Este último ejercicio lo pongo sobre la mesa para que lo veamos juntos ya que se basa en uso avanzado de Lambdas.

    Supongamos que quiero utilizar una interface funcional que realice lo siguiente f(x, y) = 2*x + 3*y. 
    Tengo 2 opciones, implemento mi Interface Funcional que va a estar lista para acoplar con el lambda o utilizo BIFunction que es similar a Funcion pero acepta 2 parámetros, justo lo que necesito. 
    
    Quiero que implementen ambos casos, incluso, igualando contra el lambda pero previamente desarrollando la clase abstracta para comparar ambos funcionamientos.
    
    Ahora compliquemos un poco la situación:  Utilicemos Function.  Con esto vamos a estar aplicando el concepto de Currying (investigen Currying) que es bastante común en los lenguajes puramente funcionales y que también es posible en java (con un poco de esfuerzo)
    Y finalmente, para que no se aburran, implementemos con Function un interface capaz de recibir un lamba de haga esto f(x, y, z) = 2*x + 3*y + 4*z
    Que las interfaces utilicen Long
    Importante, cuando hablamos de desarrollar una Interface es definir como será el tipo del parámetro que reciba dicho lamba en un metodo que lo utilice.  Ej:  debemos tener un metodo eval(Function f, Long ... parametros), este metodo obtendrá el resultado en base al lambda que le estamos pasando y los parametros, por supuesto.