package tasks.Manav;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double p,a,t,b,au,sum = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("How many kilograms is a pear?");
        p = input.nextInt();
        sum += p*2.14;
        System.out.println("How many kilograms is a apple?");
        a = input.nextInt();
        sum += a*3.67;
        System.out.println("How many kilograms is a tomato?");
        t = input.nextInt();
        sum += t*1.11;
        System.out.println("How many kilograms is a banana?");
        b = input.nextInt();
        sum += b*0.95;
        System.out.println("How many kilograms is a aubergine?");
        au = input.nextInt();
        sum += au*5.00;

        System.out.printf("Total: %.2f", sum);
        System.out.println("$");






    }
}
