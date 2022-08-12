package tasks.program_finding_number;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {

        int num=0;
        double sum=0;

        Scanner input = new Scanner(System.in);

        while (!(num % 2 == 1)) {
            System.out.println("Please enter a number: ");
            num = input.nextInt();

            if (num % 4 == 0 || num == 2) {
                sum += num;
            }
        }
        System.out.printf("Total: %.1f", sum);

    }
}
