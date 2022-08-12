package tasks.Exponential_Number;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int t,u,result=1;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter t: ");
        t = input.nextInt();
        System.out.println("Please enter u: ");
        u = input.nextInt();

        for (int i=0; i<u; i++) {
            result *= t;
        }
        System.out.println(result);
    }
}

