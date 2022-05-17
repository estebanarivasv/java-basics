package com.erivas.topic2OOP.Generics;

public class GenericMethod {

    public static <T> T transform(T source) {
        if (source instanceof String) {
            // Casting T instance to string and setting whole string to UPPERCASE
            return (T) ((String) source).toUpperCase();
        }
        return source;
    }

    public static void main(String[] args) {

        String greeting = "Hi";
        int number = 25;

        System.out.println(transform(greeting) + " - " + ((Object) number).getClass().getName() );
        System.out.println(transform(number) + " - " + ((Object) number).getClass().getName() );
    }

}
