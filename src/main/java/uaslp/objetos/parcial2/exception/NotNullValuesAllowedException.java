package uaslp.objetos.parcial2.exception;

public class NotNullValuesAllowedException extends RuntimeException {

    public NotNullValuesAllowedException() {
        super("Null values are not allowed");
    }
}