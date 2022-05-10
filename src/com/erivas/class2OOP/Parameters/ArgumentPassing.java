package com.erivas.class2OOP.Parameters;

/*
* Parameter:special kind of variable used in a subroutine to refer to one of the pieces
* of data provided as input to the subroutine.
*
* Argument: actual input expression passed/supplied to a function, procedure, or routine
* in the invocation/call statement.
*
* Argument passing: assigning arguments to parameters
* */
public class ArgumentPassing {

    // Static inner class
    static class Container {
        private int value;

        public Container(int i) {
            this.value = i;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }

    }

    // value argument
    private void increment(int value) {
        value += 1;
        System.out.println("Value: " + value);
    }

    // reference argument
    private void increment(ArgumentPassing.Container container) {
        container.setValue(container.getValue() + 1);
        System.out.println("Value: " + container.getValue());
    }

    // reference argument
    private Container incrementContainer(int value) {
        Container container = new Container(value);

        System.out.println("Before increment: " + container.getValue());
        this.increment(value);
        System.out.println("After increment: " + container.getValue());

        return container;
    }


    public static void main(String[] args) {
        ArgumentPassing ap = new ArgumentPassing();
        int initialValue = 10;

        System.out.println("Initial: " + initialValue);
        ap.increment(initialValue); // value parameter
        System.out.println("Initial: " + initialValue);

        ArgumentPassing.Container container = new Container(initialValue);
        ap.increment(container); // reference parameter
        System.out.println("Initial from container: " + container.getValue());

        ArgumentPassing.Container incrementedContainer = ap.incrementContainer(initialValue);
        System.out.println("Incremented value in container: " + incrementedContainer.getValue());

    }

}
