package tasks.Perfect_Nuber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,sum=0,result;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        n = input.nextInt();

        for (int i=2; i<n; i++) {
            if (n % i == 0) {
                sum += (i + (n/i));
            }
        }
        result = (sum /= 2)+1;

        if (result == n && !(n <= 1)) {
            System.out.println(n + " is a Perfect Number.");
        }else {
            System.out.println(n + " is NOT a Perfect Number.");
        }
    }
}
