package tasks.Body_Max_Index_Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kg, m, index;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your kilograms: ");
        kg = input.nextDouble();
        System.out.println("Please enter your meters: ");
        m = input.nextDouble();

        index = kg/(m*m);

        System.out.printf("Your body mass index is: %.2f", index);

    }
}
