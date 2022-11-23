package DS.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class Intro {
    public static void main(String[] args) {
        Queue<String> q1 = new LinkedList<>();

        q1.offer("Karen"); // equals to add()
        q1.offer("Chad");
        q1.offer("Steve");
        q1.offer("Harold");

        System.out.println(q1.isEmpty());

        System.out.println(q1.peek()); // equals to element()

        System.out.println(q1.contains("Chad"));

        q1.poll(); //First In First Out

        System.out.println(q1);

    }
}
