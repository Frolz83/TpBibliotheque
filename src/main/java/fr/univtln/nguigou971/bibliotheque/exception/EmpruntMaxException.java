package fr.univtln.nguigou971.bibliotheque.exception;

public class EmpruntMaxException extends Exception{
    public EmpruntMaxException() {
        super();
    }

    public EmpruntMaxException(String message){
        super(message);
    }
}
