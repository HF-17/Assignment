package tasks.ATM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String user_name,password;
        int balance=1500,price,right=3,select;

        Scanner input = new Scanner(System.in);


        while (right > 0){
            System.out.println("Please enter username: ");
            user_name = input.nextLine();
            System.out.println("Please enter your password: ");
            password = input.nextLine();

            if (user_name.equals("Halil Fidan") && password.equals("13579")){
                System.out.println("Hello Welcome your account");

                do{

                    System.out.println("1-deposit money\n" + "2-Withdraw Money\n" + "3-Bakiye Sorgula\n" + "4-Exit\n");
                    select = input.nextInt();

                    switch (select){
                        case 1:
                            System.out.println("Please deposit amount of money: ");
                            price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.println("Please withdraw amount of money: ");
                            price = input.nextInt();
                            if (price > balance) {
                                System.out.println("insufficient balance"); break;
                            }else {
                                balance -= price; break;
                            }
                        case 3:
                            System.out.println("Total: " + balance); break;
                        default:
                            System.out.println("See you soon :)");
                    }

                }while (select != 4);
                break;

            }else {
                right--;
                System.out.println("Your username or password is wrong!!!");
                System.out.println("Please try again");
                if (right == 0) {
                    System.out.println("Your account is blocked");
                }else {
                    System.out.println("You can try " + right + " times");
                }
            }
        }
    }
}
