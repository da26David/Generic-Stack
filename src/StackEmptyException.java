public class StackEmptyException extends Exception{
    public StackEmptyException(String msg){
        super(msg);
    }
    public StackEmptyException(){
        super("Stack is full");
    }
    public StackEmptyException(Throwable thrw){
        super(thrw);
    }
}
