package tasks.Suggesting_Events_Based_on_Air_Temperature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int cel;

        Scanner input = new Scanner(System.in);
        System.out.println("What is the current temperature: ");
        cel = input.nextInt();

        if (cel < 5){
            System.out.println("You can do ski");
        } else if (cel<=15) {
            System.out.println("You can go to cinema");
        } else if (cel<=25) {
            System.out.println("You can have a picnic");
        }else {
            System.out.println("You can go to swim");
        }
    }
}
