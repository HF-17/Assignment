package tasks.Sorting_Numbers;

import java.util.Arrays;

public class Main2 {
    static boolean isFind(int[] arr, int value) {

        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }

        return false;
    }


    public static void main(String[] args) {
        int[] list = {2,24,99,35,99,24,36,45,36,36,24,35,2};
        int[] duplicate = new int[list.length];
        int startedIndex = 0;

        for (int i=0; i< list.length; i++) {
            for (int j=0; j< list.length; j++) {
                if (i!=j && (list[i] == list[j]) && (list[i] % 2 == 0)) {
                    if (!isFind(duplicate,list[i])) {
                        duplicate[startedIndex++] = list[i];
                    }
                }
            }
        }
        for (int k : duplicate) {
            if (k != 0) {
                System.out.println(k);
            }
        }
    }
}
