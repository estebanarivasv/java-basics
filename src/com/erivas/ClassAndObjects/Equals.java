package com.erivas.ClassAndObjects;

/*
* Class Object is the root of the class hierarchy.
* - Every class has Object as a superclass. This is why IntelliJ marks it as redundant
* - All objects, including arrays, implement the methods of this class.
* */
public class Equals extends Object {

    private final String name;

    public Equals(String newName) {
        this.name = newName;
    }

    // Equals: compares two strings, and returns true if the strings are equal, and false if not.
    @Override
    public boolean equals(Object obj) {
        System.out.println("Comparando " + this.getClass() + " con " + obj.getClass());
        if (obj instanceof Equals) {
            return this.equals((Equals) obj);
            // If obj is an instance of Equals, it runs the method below
        } else {
            // If obj is not an instance of Equals, it runs the method from Object superclass
            return super.equals(obj);
        }
    }

    // Method overloading with another object type as parameter
    public boolean equals(Equals obj) {
        return this.name.equals(obj.name);
    }

    public static void main(String[] args) {
        Equals p1 = new Equals("Hola");
        Equals p2 = new Equals("Hola");

        Object p3 = new Equals("Hola");

        // Compares if p1 and p2 are the same - SPOILER: Returns true
        System.out.println("Are p1 and p2 strings the same? " + p1.equals(p2));

        // Compares if p1 and p2 are the same - SPOILER: Returns true
        System.out.println("Are p1 and p3 strings the same? " + p1.equals(p3));
    }
}
