package com.erivas.ClassAndObjects.InheritanceAndEncapsulation;


public class EqualsModifiers extends SuperClass {

    private final String name;

    public EqualsModifiers(String newName) {
        this.name = newName;
        // super.name is unreachable because it's protected
        super.surname = "Perez";
    }

    // Equals: compares two strings, and returns true if the strings are equal, and false if not.
    @Override
    public boolean equals(Object obj) {
        System.out.println("Comparing " + this.getClass() + " with " + obj.getClass());
        if (obj instanceof EqualsModifiers) {

            // If obj is an instance of Equals, it runs the method below
            return this.equals((EqualsModifiers) obj);
        } else {
            // If obj is not an instance of Equals, it runs the method from Object superclass
            return super.equals(obj);
        }
    }

    // Method overloading with another object type as parameter
    public boolean equals(EqualsModifiers obj) {
        return this.name.equals(obj.name);
    }

    public static void main(String[] args) {
        EqualsModifiers p1 = new EqualsModifiers("Hola");
        EqualsModifiers p2 = new EqualsModifiers("Hola");

        Object p3 = new EqualsModifiers("Hola");

        // Compares if p1 and p2 are the same - SPOILER: Returns true
        System.out.println("Are p1 and p2 strings the same? " + p1.equals(p2));

        // Compares if p1 and p2 are the same - SPOILER: Returns true
        System.out.println("Are p1 and p3 strings the same? " + p1.equals(p3));
    }
}
