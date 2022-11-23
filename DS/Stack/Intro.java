package DS.Stack;

import java.util.Stack;

public class Intro {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        stack.push("12");
        stack.add("Java");
        stack.add("C++");
        stack.add("Python");

       // System.out.println(stack);

        //System.out.println(stack.isEmpty());

        //stack.pop();

        //System.out.println(stack.peek());
        System.out.println(stack.search("Java")); // 1
        //System.out.println(stack.search("home")); // -1




    }
}
