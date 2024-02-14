public class Main {
    public static void main(String[] args) {
        var stack = new StackClass<Integer>(5);
        try {
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);
            System.out.println(stack.list());
            stack.pop();
            System.out.println(stack.list());
            System.out.println(stack.peek());
        } catch (StackFullException | StackEmptyException e) {
            e.printStackTrace();
        }
        var stack1 = new StackClass<String>();
        try{
            stack1.push("test");
            stack1.push("test1");
            stack1.push("test2");
            System.out.println(stack1.list());
            stack1.pop();
            System.out.println(stack1.list());
            System.out.println(stack1.peek());
        }
        catch(StackFullException | StackEmptyException e){
            e.printStackTrace();
        }
    }
}
