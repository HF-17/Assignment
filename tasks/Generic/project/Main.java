package tasks.Generic.project;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>();

        list.add(40);
        list.add(70);
        list.add(250);
        list.add(50);
        list.add(25);
        list.add(20);

        System.out.println(list.size());
        System.out.println(list.getCapacity());

        System.out.println(list.get(2));

        list.remove(2);
        list.add(12);
        list.add(55);
        list.set(1,100);

        System.out.println(list.get(2));
        System.out.println(list.get(1));
        System.out.println(list.size());
        System.out.println(list.getCapacity());
        System.out.println(list);
        System.out.println(list.indexOf(100));
        System.out.println(list.lastIndexOf(50));
        System.out.println(list.isEmty());
        System.out.println(Arrays.toString(list.toArray()));
        System.out.println(list.sublist(0,4));
    }
}
