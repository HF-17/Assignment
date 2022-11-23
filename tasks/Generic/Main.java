package tasks.Generic;

import Genericc.GenericMethods;

public class Main {
    public static void main(String[] args) {
        /*Integer a=12;
        String str = "Halil";
        Nullable<String> n = new Nullable<>(str);
        n.run();*/

        /*Integer a = 12;
        String s = "Halil";
        Double d = 3.14;
        String s2 = "Fidan";

        Test<Integer,String,Double> t = new Test<>(a,s,d);
        t.setObj2(s2);
        t.showInfo();*/

        String[] str = {"Java", "Python", "JS"};
        Integer[] ints = {1,32,27};
        Character[] chars = {'j','a','v','a'};

        GenericMethods.printArray(chars);

    }
}
