package Genericc;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        MyGenericClass<Integer,Integer> myInt = new MyGenericClass<>(2,5);
        MyGenericClass<Double,Double> myDouble = new MyGenericClass<>(3.14,7.77);
        //MyGenericClass<Character,Character> myChar = new MyGenericClass<>('H','A'); Last two objects give error because we extend number class in generic file.
        //MyGenericClass<String,String> myStr = new MyGenericClass<>("Halil","Fidan");This event named BOUNDED TYPES.
    // ikililerde ikinci parametre döner;
        System.out.println(myInt.getValue());
        System.out.println(myDouble.getValue());
        //System.out.println(myChar.getValue());
        //System.out.println(myStr.getValue());


    }




}
