package tasks.program_finding_number;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,control=0;
        double sum=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        n = input.nextInt();

        for (int i=0; i<n; i++) {
            if (i%3==0 && i%4==0) {
                sum += i;
                control++;
            }
        }
        System.out.printf("Average: %.2f", sum/control);
    }
}
