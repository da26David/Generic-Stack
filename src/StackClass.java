/**
 * Class to create a Stack and store data
 * @author David Schneider
 * @version 2024-02-14
 * @param <T> which data type is used for the Array
 */
public class StackClass <T>{
    private T[] stack;
    private int counter = 0;

    /**
     * Standard Constructor for the Stack Class with no parameters
     */
    public StackClass(){
        stack = (T[])new Object[5];
    }

    /**
     * Constructor with parameter for the size of the stack
     * @param size size of the stack
     */
    public StackClass(int size){
        stack =(T[]) new Object[size];
    }

    /**
     * Method to push an item to the stack
     * @param item item to be pushed
     * @throws StackFullException
     */
    public void push(T item) throws StackFullException{
        counter ++;
        if(counter > stack.length){
            throw new StackFullException("Stack is full");
        }
        stack[counter] = item;
    }

    /**
     * Method to delete an item from the stack
     * @throws StackEmptyException
     */
    public void pop() throws StackEmptyException{
        if(counter == 0){
           throw new StackEmptyException("Stack is empty");
       }
       T[] temp = (T[]) new Object[stack.length - 1];
       for(int i = 0; i < stack.length - 1; i++){
           temp[i] = stack[i];
       }
       stack = temp;
       counter = counter -1;

    }

    /**
     * Method to get the top item from the stack
     * @return top item from the stack
     * @throws StackEmptyException
     */
    public T peek() throws StackEmptyException{
        if(counter == 0){
            throw new StackEmptyException("Stack is empty");
        }
        return stack[counter - 1];
    }

    /**
     * Method to get a list of the stack
     * @return list of the stack
     * @throws StackEmptyException
     */
    public String list() throws StackEmptyException{
        int temp;
        String re = "";
        if(counter == 0){
            throw new StackEmptyException("Stack is empty");
        }
        for(temp = counter -1; temp >= 0; temp--){
            re += stack[temp];
            if(temp != 0){
                re += "; ";
            }
        }
        return re;
    }
}
