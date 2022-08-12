package tasks.Chinese_Zodiac;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int year,zodiac;


        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your birth year: ");
        year = input.nextInt();

        zodiac = year%12;

        switch (zodiac){
            case 0:
                System.out.println("Your Chinese zodiac is MONKEY" );break;
            case 1:
                System.out.println("Your Chinese zodiac is MONKEY" );break;
            case 2:
                System.out.println("Your Chinese zodiac is MONKEY" );break;
            case 3:
                System.out.println("Your Chinese zodiac is MONKEY" );break;
            case 4:
                System.out.println("Your Chinese zodiac is MONKEY" );break;
            case 5:
                System.out.println("Your Chinese zodiac is MONKEY" );break;
            case 6:
                System.out.println("Your Chinese zodiac is MONKEY" );break;
            case 7:
                System.out.println("Your Chinese zodiac is MONKEY" );break;
            case 8:
                System.out.println("Your Chinese zodiac is MONKEY" );break;
            case 9:
                System.out.println("Your Chinese zodiac is MONKEY" );break;
            case 10:
                System.out.println("Your Chinese zodiac is MONKEY" );break;
            case 11:
                System.out.println("Your Chinese zodiac is MONKEY" );break;

        }

    }
}
