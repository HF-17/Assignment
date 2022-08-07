package tasks.Circle_Area_Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int r;
        double dilim_area,perimeter,area,a,pi = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the radius(r): ");
        r = input.nextInt();
        System.out.println("Enter the angle in circle");
        a = input.nextDouble();
        area = pi*r*r;
        perimeter = 2*pi*r;
        dilim_area = (pi * (r*r) * a) / 360;
        System.out.println("area: " + area);
        System.out.println("perimeter: " + perimeter);
        System.out.println("area in " + a + ": " + dilim_area);


    }
}
