package tasks.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double num1,num2,result = 0;

        char operator;

        Scanner input  =  new Scanner(System.in);

        System.out.println("Please enter first number: ");
        num1 = input.nextDouble();
        System.out.println("Please enter second number:  ");
        num2 = input.nextDouble();
        System.out.println("Please choose operator: ");
        operator = input.next().charAt(0);

        switch (operator){
            case '+': result = num1 + num2;break;
            case '-': result = num1 - num2;break;
            case '/': result = num1 / num2;break;
            case '*': result = num1 * num2;break;
        }
        System.out.printf("%.2f " + operator + " %.2f " + "=" + " %.2f",num1,num2,result);
    }
}
