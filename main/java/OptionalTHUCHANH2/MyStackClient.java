package OptionalTHUCHANH2;

public class MyStackClient {
    public static void main(String[] args) {
        MyStack myStack = new MyStack(4);
        myStack.push(5);
        myStack.push(4);
        myStack.push(3);
        myStack.push(2);
        System.out.println(myStack.pop());
    }
}
