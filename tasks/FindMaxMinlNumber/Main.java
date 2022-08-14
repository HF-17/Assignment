package tasks.FindMaxMinlNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n, num1,num2,max=0,min=1000000000;

        Scanner input = new Scanner(System.in);

        System.out.println("How much numbers do you want to  enter?");
        n = input.nextInt();

        for (int i=1; i<=n; i++) {
            System.out.println("Enter " + i + ". number: ");
            num1 = input.nextInt();
            if (num1 > max) {
                max = num1;
            }
            if (num1 < min) {
                min = num1;
            }
        }
        System.out.println(max);
        System.out.println(min);

    }
}
