package com.erivas.OOP.Exceptions;

public class Business {

    // REPOSITORY LAYER: Simulate access to the database and retrieve an error
    public void accessDatabase() throws ExceptionDAO {
        System.out.println("Accessing DB");
        // Runtime exception and
        try {
            throw new RuntimeException("Error trying to access the database");
        } catch (Throwable t) {
            throw new ExceptionDAO("Error trying to access the database", t);
        }
    }

    /*
    * SERVICE / BUSINESS MODEL LAYER: Executes the access to database. If the DAO raises an exception,
    * the method returns an ExceptionBO.
    * */
    public void executeBusiness() throws ExceptionBO {
        System.out.println("Executing business policy");
        boolean processFailed = false;
        try {
            System.out.println("Starting graph");
            this.accessDatabase();
            System.out.println("Graph finished");
        } catch (ExceptionDAO e) {
            System.out.println("Cant access data");
            processFailed = true;
            throw new ExceptionBO("Business error: ", e);
        } finally {
            if (processFailed) {
                System.out.println("Graph finished with an error");
            }
        }

    }

    // This method emulates the APPLICATION LAYER
    public static void main(String[] args) {
        try {
            new Business().executeBusiness();
        } catch (ExceptionBO e) {
            e.printStackTrace();
        }
    }

}
