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
        stack[counter++] = item;
    }

    /**
     * Method to delete an item from the stack
     * @throws StackEmptyException
     */
    public void pop() throws StackEmptyException{
        stack[counter--] = null;
    }

    /**
     * Method to get the top item from the stack
     * @return top item from the stack
     * @throws StackEmptyException
     */
    public T peek() throws StackEmptyException{
        return stack[counter];
    }

    /**
     * Method to get a list of the stack
     * @return list of the stack
     * @throws StackEmptyException
     */
    public String list() throws StackEmptyException{
        int temp;
        String re = "";
        for(temp = counter; temp > 0; temp--){
            re += stack[temp];
            if(temp != 1){
                re += "; ";
            }
        }
        return re;
    }
}
