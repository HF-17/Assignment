package tasks.Hypotenuse_Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a,b;
        double c,u,area;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter first side of triangle: ");
        a = input.nextInt();
        System.out.println("Please enter second side of triangle: ");
        b = input.nextInt();

        c = Math.hypot(a,b); // Math.sqrt((a*a) + (b*b));
        u = (a + b + c)/2;
        area = (a*b)/2.0;
        System.out.println("Hypotenuse is: " + c);
        System.out.println("Area is: " + area);
        System.out.println("Perimeter is: " + 2*u);





    }
}
