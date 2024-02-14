public class StackFullException extends Exception{

    public StackFullException(String msg){
        super(msg);
    }
    public StackFullException(){
        super("Stack is full");
    }
    public StackFullException(Throwable thrw){
        super(thrw);
    }
}
