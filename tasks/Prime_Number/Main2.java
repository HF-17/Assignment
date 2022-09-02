package tasks.Prime_Number;

import java.util.Scanner;

public class Main2 {

    static String function(int n, int m) {

        if (n % m == 0 && n != m) {
            return "not prime";
        }
        if (n % m == 0) {
            return "prime";
        }
        if (n <= 1) {
            return "not prime";
        }

        return function(n,m+1);
    }
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        n = input.nextInt();
        System.out.println(function(n,2));
    }
}
