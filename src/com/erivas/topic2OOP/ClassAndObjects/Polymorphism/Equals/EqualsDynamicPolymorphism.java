package com.erivas.topic2OOP.ClassAndObjects.Polymorphism.Equals;

/*
Dynamic polymorphism is polymorphism that occurs at runtime (during application execution).
* */
public class EqualsDynamicPolymorphism {

    private final String name;

    public EqualsDynamicPolymorphism(String newName) {
        this.name = newName;
    }

    // Equals: compares two strings, and returns true if the strings are equal, and false if not.
    @Override
    public boolean equals(Object obj) {
        System.out.println("Comparing from @Override  " + this.getClass() + " with  " + obj.getClass());
        if (obj instanceof EqualsDynamicPolymorphism) {
            // If obj is an instance of Equals, it runs the method below
            return this.equals((EqualsDynamicPolymorphism) obj);
        } else {
            // If obj is not an instance of Equals, it runs the method from Object superclass
            return super.equals(obj);
        }
    }

    // Method overloading with another object type as parameter
    public boolean equals(EqualsDynamicPolymorphism obj) {
        System.out.println("Comparing from 'equals'  " + this.getClass() + " with  " + obj.getClass());
        return this.name.equals(obj.name);
    }

    public static void main(String[] args) {
        EqualsDynamicPolymorphism p1 = new EqualsDynamicPolymorphism("Hola");
        Object p3 = new EqualsDynamicPolymorphism("Hola");

        // Compares if p1 and p2 are the same - SPOILER: Returns true
        System.out.println("Are p1 and p3 strings the same? " + p1.equals(p3));
    }
}
