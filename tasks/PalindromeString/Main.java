package tasks.PalindromeString;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str,reverse="";

        System.out.println("Please enter a word: ");
        str = input.nextLine();

        for (int i=str.length()-1; i>=0; i--) {
            reverse =reverse.concat(String.valueOf(str.charAt(i)));
        }

        if (reverse.equals(str)) {
            System.out.println(str + " is a Palindrome Word");
        }else {
            System.out.println(str + " is NOT a Palindrome Word");
        }
    }
}
