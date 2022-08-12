package tasks.Leap_Year;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a year: ");
        year = input.nextInt();

        if ( (year % 4 == 0 && year % 100 != 0) || year % 400 == 0 ){
            System.out.println(year + " is a LEAP YEAR");
        }else {
            System.out.println(year + " is NOT a LEAP YEAR");
        }
    }
}
