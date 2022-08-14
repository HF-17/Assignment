package tasks.Harmonic_Serie;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num,seri=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        num = input.nextDouble();

        for (int i=1; i<=num; i++) {
            seri += 1.0/i;
        }

        System.out.printf("%.2f",seri);
    }
}
