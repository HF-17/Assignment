package tasks.Fibonacci;

import java.util.Scanner;

public class Main {

    static int fib(int n) {

        if (n == 1 || n == 2) {
            return 1;
        }

        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
      /*  int n1=0,n2=1,count,n3;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter n: ");
        count = input.nextInt();

        System.out.print(n1 + " " + n2);

        for (int i=2; i<count; i++) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        } */

        System.out.println(fib(8));

    }
}
