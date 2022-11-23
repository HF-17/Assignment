package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class try_catch {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Please enter number1: ");
            int x = input.nextInt();

            System.out.println("Please enter number1: ");
            int y = input.nextInt();

            int z = y/x;

            System.out.println("result is " + z);
        }catch (ArithmeticException e){
            System.out.println("You cant divided a number with ZERO");
        }catch (InputMismatchException e){
            System.out.println("You should write integer");
        }catch (Exception e){
            System.out.println("Something went wrong");
        }finally {
            System.out.println("Program is over!!!");
        }


    }
}
