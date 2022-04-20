public class BalanceInsufficientException extends Exception{
    String Message;
    public BalanceInsufficientException(String Message){
        this.Message = Message;
    }
    @Override
    public String getMessage() {
        return this.Message;
    }
}
