package Exception_Handling;

import java.util.Scanner;

public class Throw {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int age = input.nextInt();

        try {
            checkedAge(age);
        }catch (Exception e){
            System.out.println("Age is not match");
        }
    }

    public static void checkedAge(int age){
        if (age<18){
            throw new ArithmeticException("Yaşınıç tutmuyor");
        }
    }
}
