package com.erivas.OOP.Exceptions;

/*
    Exception DAO (Data Access Object): Represents an exception when trying to access the database
 */
public class ExceptionDAO extends Exception {

    private static final long serialVersionUID = 6205884429847637885L;

    // Extend the Exception class methods
    public ExceptionDAO() {
        super();
    }

    // Returns a message
    public ExceptionDAO(String message) {
        super(message);
    }

    // Returns a message with the cause of the problem
    public ExceptionDAO(String message, Throwable cause) {
        super(message, cause);
    }

    // Returns the error cause
    public ExceptionDAO(Throwable cause) {
        super(cause);
    }

}
