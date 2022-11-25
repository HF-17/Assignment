package DS.TreeSet;

import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();

        ts.add(10);
        ts.add(20);
        ts.add(30);
        //ts.add(null);  we can not add null
        ts.remove(20);

        System.out.println(ts);
        System.out.println(ts.size());
        System.out.println(ts.isEmpty());
        System.out.println(ts.contains(10));
    }
}
