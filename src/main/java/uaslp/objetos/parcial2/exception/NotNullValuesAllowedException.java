package uaslp.objetos.parcial2.exception;

public class NotNullValuesAllowedException extends Exception{
    public NotNullValuesAllowedException(){
        super("Null values are not allowed");
    }
}