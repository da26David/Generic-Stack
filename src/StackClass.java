public class StackClass <T>{
    private T[] stack;
    private int counter = 0;
    public StackClass(){
        stack = (T[])new Object[5];
    }
    public StackClass(int size){
        stack =(T[]) new Object[size];
    }
    public void push(T item) throws StackFullException{
        stack[counter++] = item;
    }
    public void pop() throws StackEmptyException{
        stack[counter--] = null;
    }
    public T peek() throws StackEmptyException{
        return stack[counter];
    }
}
