package tasks.Taximeter_Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double km,bill;
        int openingFee = 10;
        String price;

        Scanner input = new Scanner(System.in);

        System.out.println("How many kilometers will you go: ");
        km = input.nextDouble();


        if ((km*2.20) < 20) {
            bill = 20;
        }else {
            bill =  openingFee + (km*2.20);
        }
        price = bill + "$";

        System.out.println("Your bill is: " + price);
    }
}
