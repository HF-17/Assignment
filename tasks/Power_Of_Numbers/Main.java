package tasks.Power_Of_Numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        n = input.nextInt();

        for (int i=1; i<n; i*=4) {
            System.out.println(i);
        }
        System.out.println("---------------------------");
        for (int i=1; i<n; i*=5) {
            System.out.println(i);
        }
    }
}
