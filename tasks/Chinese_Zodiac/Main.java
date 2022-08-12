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
                System.out.println("Your Chinese zodiac is COCKEREL" );break;
            case 2:
                System.out.println("Your Chinese zodiac is DOG" );break;
            case 3:
                System.out.println("Your Chinese zodiac is PIG" );break;
            case 4:
                System.out.println("Your Chinese zodiac is MOUSE" );break;
            case 5:
                System.out.println("Your Chinese zodiac is OX" );break;
            case 6:
                System.out.println("Your Chinese zodiac is TIGER" );break;
            case 7:
                System.out.println("Your Chinese zodiac is RABBIT" );break;
            case 8:
                System.out.println("Your Chinese zodiac is DRAGON" );break;
            case 9:
                System.out.println("Your Chinese zodiac is SNAKE" );break;
            case 10:
                System.out.println("Your Chinese zodiac is HORSE" );break;
            case 11:
                System.out.println("Your Chinese zodiac is SHEEP" );break;

        }

    }
}
