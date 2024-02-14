public class StackClass <T>{
    private T[] stack;
    public StackClass(){
        stack = (T[])new Object[5];
    }
    public StackClass(int size){
        stack =(T[]) new Object[size];
    }

}
