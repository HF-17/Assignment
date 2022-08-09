package tasks.User_Login;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String userName, passwordd, password = "hf3q1907", new_password;
        char answer;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your username: ");
        userName = input.nextLine();
        System.out.println("Please enter your password: ");
        passwordd = input.nextLine();

        if (userName.equals("Halil_Fidan") && passwordd.equals("hf3q1907")) {
            System.out.println("You log in Website");
        } else if (!passwordd.equals("hf3q1907")) {
            System.out.println("Your password is wrong!");
            System.out.println("Do you want change your password?(Y/N)");
            answer = input.next().charAt(0);
            if (answer == 'Y'){
                System.out.println("Please enter your new password: ");
                new_password = input.next();
                if (new_password.equals(password)) {
                    System.out.println("Could not create password, please enter another password.");
                }else{
                    System.out.println("Password is created :)");
                }
            }else {
                System.out.println("You don't want to change password");
            }
        }
    }
}
