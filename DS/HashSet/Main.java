package DS.HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        HashSet<Integer> hSet = new HashSet<>();

        hSet.add(10);
        hSet.add(20);
        hSet.add(30);
        hSet.add(40);
        hSet.add(null);

        hSet.remove(40);
       // hSet.clear();

        System.out.println(hSet);
        System.out.println(hSet.isEmpty());
        System.out.println(hSet.size());
        System.out.println(hSet.contains(null));

        Iterator<Integer> itr = hSet.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }


    }
}
