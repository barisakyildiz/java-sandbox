package NerdleBack;

public class InvalidOperandException extends Exception{
    String message;
    public InvalidOperandException(String message){
        this.message = message;
    }
    @Override
    public String getMessage(){
        return this.message;
    }
}
