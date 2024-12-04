
import Materia.Stacks.Stack;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        runStack();
        
    }
    public static void runStack(){
        Stack stack = new Stack();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(20);
        System.out.println("Cima ---->"+stack.peek());
        System.out.println("Retirar---->"+stack.pop());
        System.out.println("Cima ---->"+stack.peek());
        System.out.println("Retirar ---->"+stack.pop());
        System.out.println("Cima ---->"+stack.peek());

    }
}
