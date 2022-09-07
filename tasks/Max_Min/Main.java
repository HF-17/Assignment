package tasks.Max_Min;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int n,max=0,min=0;
        int[] numbers = {15,12,788,1,-1,-778,2,0};
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        n = input.nextInt();

        Arrays.sort(numbers);
        // [-778, -1, 0, 1, 2, 12, 15, 788]

        for (int i=0; i<numbers.length -1; i++) {
            if (n >= numbers[i] && n < numbers[i+1]) {
                max = numbers[i+1];
                min = numbers[i];
            }
            else if (n == numbers[numbers.length-1]) {
                max = numbers[numbers.length-1];
                min = numbers[numbers.length-2];
            }
            else if (n == numbers[i]) {
                max = numbers[i+1];
                min = numbers[i-1];

            }
        }
        System.out.println("Dizi: " + Arrays.toString(numbers));
        System.out.println("Entered number: " + n);
        System.out.println("Max" + max);
        System.out.println("Min" + min);

    }
}
