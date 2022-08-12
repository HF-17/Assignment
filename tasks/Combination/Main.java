package tasks.Combination;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n,r;
        int fac1=1,fac2=1,fac3=1,result;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter n: ");
        n = input.nextInt();

        System.out.println("Please enter r: ");
        r = input.nextInt();

        for (int i=1; i<=n; i++) {
            fac1 *= i;
        }
        for (int i=1; i<=r; i++) {
            fac2 *= i;
        }
        for (int i=1; i<=(n-r); i++) {
            fac3 *= i;
        }
        result = fac1 / (fac2 * fac3);
        System.out.println(result);
    }
}
