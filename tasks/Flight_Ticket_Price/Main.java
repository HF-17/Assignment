package tasks.Flight_Ticket_Price;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int km,type,age,value=0;
        double normal_price,age_discount,age_discount_rate = 1,total = 0,discount_price;

        Scanner input = new Scanner(System.in);


        System.out.println("How many kilometers will you go: ");
        km = input.nextInt();
        System.out.println("Please enter your age: ");
        age = input.nextInt();

        if (age < 12) {
            age_discount_rate = 0.50;
        }else if (age < 24) {
            age_discount_rate = 0.10;
        } else {
            age_discount_rate = 0;
        }
        if (age > 65) {
            age_discount_rate = 0.30;
        }

        System.out.println("Please enter your type of flight: 1(One Direction) / 2(Round Trip)");
        type = input.nextInt();


        normal_price = km * 0.10;
        age_discount = normal_price * age_discount_rate;
        discount_price = normal_price - age_discount;

        if (type == 2) {
            total = (discount_price * 80.0/100.0) * 2;
        } else if (type == 1) {
            total = discount_price;
        }

        if (age <= 0 || km<=0 || (!(type == 1 || type == 2))){
            System.out.println("EROR");
            value++;
        }

        if (value == 0){
            System.out.println("Total" + total + "$");
        }
    }
}
