package DS.LinkedList;

import java.util.LinkedList;

public class Intro {
    public static void main(String[] args) {

        LinkedList<String> ls = new LinkedList<>();

        ls.push("A");
        ls.push("B");
        ls.push("C");
        ls.push("D");
        ls.push("F");
        ls.pop();

        ls.offer("A");
        ls.offer("B");
        ls.offer("C");
        ls.offer("D");
        ls.offer("F");
       // ls.poll();

        ls.add(4,"E");
        ls.remove(4);

        System.out.println(ls.peekFirst());
        System.out.println(ls.peekLast());

        ls.addFirst("0");
        ls.addLast("G");

        ls.removeFirst();
        ls.removeLast();


        System.out.println(ls);
    }
}
