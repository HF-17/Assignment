package tasks.Digit_Sum;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String num;
        int sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        num = input.nextLine();

        for (int i=0; i<num.length(); i++) {
            sum += Integer.parseInt(String.valueOf(num.charAt(i)));
        }

        System.out.println(sum);

    }
}
