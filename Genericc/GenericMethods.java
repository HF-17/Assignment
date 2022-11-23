package Genericc;

public class GenericMethods {

    public static <T> void printArray(T[] arr) {
        for (T i: arr) {
            System.out.println(i);
        }
    }
}
