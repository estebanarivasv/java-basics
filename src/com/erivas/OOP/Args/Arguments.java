package com.erivas.OOP.Args;

public class Arguments {

    // This method awaits for an undefined quantity of parameters
    public void showParametersList(String... p) {

        System.out.print("{ ");
        for (String arg : p) {
            System.out.print(" " + arg);

            System.out.print(",");
        }
        System.out.println(" }");

    }

    public static void main(String[] args) {

        int numArgs = args.length;

        if (numArgs == 0) {

            System.out.println("Usted no hay ingresado parametros!");

        } else {

            Arguments arguments = new Arguments();
            arguments.showParametersList(args);

            System.out.println("You have inserted " + numArgs + " parameters.");

        }

    }

}
