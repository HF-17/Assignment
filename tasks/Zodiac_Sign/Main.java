package tasks.Zodiac_Sign;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int month,day;

        Scanner input = new Scanner(System.in);

        System.out.println("When is your birth month: ");
        month = input.nextInt();

        System.out.println("When is your birth day: ");
        day = input.nextInt();

        switch (month) {
            case 1:
                if (day < 22) {
                    System.out.println("Your zodiac is Capricorn");break;
                }else{
                    System.out.println("Your zodiac is Aquarius");break;
                }
            case 2:
                if (day <= 19) {
                    System.out.println("Your zodiac is Aquarius");break;
                }else{
                    System.out.println("Your zodiac is Pisces");break;
                }
            case 3:
                if (day < 21) {
                    System.out.println("Your zodiac is Pisces");break;
                }else{
                    System.out.println("Your zodiac is Aries");break;
                }
            case 4:
                if (day < 21) {
                    System.out.println("Your zodiac is Aries");break;
                }else{
                    System.out.println("Your zodiac is Taurus");break;
                }
            case 5:
                if (day < 22) {
                    System.out.println("Your zodiac is Taurus");break;
                }else{
                    System.out.println("Your zodiac is Gemini");break;
                }
            case 6:
                if (day < 23) {
                    System.out.println("Your zodiac is Gemini");break;
                }else{
                    System.out.println("Your zodiac is Cancer");break;
                }
            case 7:
                if (day < 23) {
                    System.out.println("Your zodiac is Cancer");break;
                }else{
                    System.out.println("Your zodiac is Leo");break;
                }
            case 8:
                if (day < 23) {
                    System.out.println("Your zodiac is Leo");break;
                }else{
                    System.out.println("Your zodiac is Virgo");break;
                }
            case 9:
                if (day < 23) {
                    System.out.println("Your zodiac is Virgo");break;
                }else{
                    System.out.println("Your zodiac is Scorpio");break;
                }
            case 10:
                if (day < 23) {
                    System.out.println("Your zodiac is Scorpio");break;
                }else{
                    System.out.println("Your zodiac is Sagittarius");break;
                }
            case 11:
                if (day < 22) {
                    System.out.println("Your zodiac is Sagittarius");break;
                }else{
                    System.out.println("Your zodiac is Capricorn");break;
                }
        }
    }
}
