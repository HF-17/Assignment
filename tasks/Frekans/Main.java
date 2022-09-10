package tasks.Frekans;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 20, 10, 10, 20, 5, 20, 30, 30};
        int frekans = 1;

        Arrays.sort(numbers);
        // [5, 10, 10, 10, 20, 20, 20, 20, 30, 30]



        for (int i=0; i < numbers.length-1; i++) {
            for (int j=0; j < numbers.length; j++) {
                if ( i != j && numbers[i] == numbers[j]) {
                    frekans++;
                }
            }
            if (numbers[i] != numbers[i+1]) {
                System.out.println(numbers[i] + " " + frekans +" kez tekrar etti.");
            }
            if (i+1 == numbers.length-1) {
                System.out.println(numbers[i+1] + " " + frekans +" kez tekrar etti.");
            }
            frekans = 1;
        }
    }
}
