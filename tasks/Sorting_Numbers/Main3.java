package tasks.Sorting_Numbers;

import java.util.Arrays;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter dimension of array: ");
        n = input.nextInt();
        int[] numbers = new int[n];

        for (int i=0; i<n; i++) {
            System.out.println("please enter elements of array");
            numbers[i] = input.nextInt();
        }

        for (int i=0; i<n; i++) {
            System.out.println( i+1 + ". elements of array: " + numbers[i]);
        }

        Arrays.sort(numbers);
        System.out.println("Sorting: " + Arrays.toString(numbers));
    }
}
