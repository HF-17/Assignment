package DS.Queue.PriorityQueue;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Intro {
    public static void main(String[] args) {

        Queue<Double> q1 = new PriorityQueue<>(Collections.reverseOrder());

        q1.offer(3.0);
        q1.offer(2.5);
        q1.offer(4.0);
        q1.offer(1.5);
        q1.offer(2.0);

        while (!q1.isEmpty()){
            System.out.println(q1.poll());
        }


    }
}
