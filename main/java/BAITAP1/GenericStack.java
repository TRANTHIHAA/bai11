package BAITAP1;

import java.util.LinkedList;
import java.util.Stack;

public class GenericStack {
    private static void stackOfIntegers(){
        Integer[] integers = new Integer[]{1,2,3,4,5};
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        for (int i = 0; i < 5; i++) {
            integers[i] =  stack.pop();

        }
        for (Integer integer :integers) {
            System.out.print(integer+" ");
        }


    }

    private static void stackOfString() {
        Stack<Character> wStack = new Stack<>();
        String mWord = "toi ten la ha";

        for (int i = 0; i < mWord.length(); i++) {
            wStack.push(mWord.charAt(i));
        }

        for (int i = 0; i < mWord.length(); i++) {
            char ch = wStack.pop();
            System.out.print(ch);
        }

    }

    public static void main(String[] args) {
        stackOfIntegers();
        stackOfString();
    }
}
