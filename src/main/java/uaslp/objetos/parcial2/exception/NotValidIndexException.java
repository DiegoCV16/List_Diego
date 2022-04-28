package uaslp.objetos.parcial2.exception;


public class NotValidIndexException extends RuntimeException {

    public NotValidIndexException(int wrongIndex) {
        super("Index " + wrongIndex +  " is out of bounds");
    }
}