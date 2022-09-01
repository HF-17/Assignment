package tasks.Calculator;

import java.util.Scanner;

public class Main2 {

    static void addition() {
        Scanner input = new Scanner(System.in);
        System.out.println("How much do you want to add numbers");
        int n = input.nextInt();
        int num,result=0;
        for (int i=1; i<=n; i++) {
            System.out.println("Please enter number " + i + ": ");
            num = input.nextInt();
            result += num;
        }

        System.out.println(result);
    }

    static void subtraction() {
        Scanner input = new Scanner(System.in);
        System.out.println("How much do you want to subtract numbers");
        int n = input.nextInt();
        int num,result=0;
        for (int i=1; i<=n; i++) {
            System.out.println("Please enter number " + i + ": ");
            num = input.nextInt();
            if (i==1) {
                result += num;
                continue;
            }
            result -= num;
        }

        System.out.println(result);
    }

    static void multiplication() {
        Scanner input = new Scanner(System.in);
        System.out.println("How much do you want to subtract numbers");
        int n = input.nextInt();
        int num,result=1;
        for (int i=1; i<=n; i++) {
            System.out.println("Please enter number " + i + ": ");
            num = input.nextInt();
            result *= num;
        }

        System.out.println(result);
    }

    static void divide() {
        Scanner input = new Scanner(System.in);
        System.out.println("How much do you want to subtract numbers");
        int n = input.nextInt();
        int num,result=1;
        for (int i=1; i<=n; i++) {
            System.out.println("Please enter number " + i + ": ");
            num = input.nextInt();
            result /= num;
        }

        System.out.println(result);
    }

    static void power() {
        Scanner input = new Scanner(System.in);
        int t=input.nextInt(),u= input.nextInt(), result=1;
        for (int i=0; i<u; i++) {
            result *= t;
        }
        System.out.println(result);
    }

    static void factorial() {
        Scanner input = new Scanner(System.in);
        int num,result=1;
        System.out.println("Please enter number");
        num = input.nextInt();
        for (int i=1; i<=num; i++) {
            result *= i;
        }
        System.out.println(result);
    }

    static void mod() {
        Scanner input = new Scanner(System.in);
        int result,num1=1,num2=1;
        for (int i=1; i<=2; i++) {
            System.out.println("Please enter number " + i + ": ");
            num1 = input.nextInt();
            num2 = input.nextInt();
        }
        result = num1 % num2;
        System.out.println(result);
    }

    static void rectangle() {
        Scanner input = new Scanner(System.in);
        int n,m,area,perimeter;
        System.out.println("Please enter short side of rectangle: ");
        n= input.nextInt();
        System.out.println("Please enter long side of rectangle: ");
        m= input.nextInt();
        area = n*m;
        perimeter = 2*(n+m);

        System.out.println("Area: " + area);
        System.out.println("Perimeter " + perimeter);
    }




    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        do {
            System.out.println("\n");
            System.out.println("""
                1-Addition
                2-Subtraction
                3-Multiplication
                4-Divide
                5-Power
                6-Factorial
                7-Mod
                8-Area and perimeter of rectangle
                0-Exit
                """);

            System.out.println("Please choose a function");
            select = input.nextInt();

            switch (select) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    divide();
                    break;
                case 5:
                    power();
                    break;
                case 6:
                    factorial();
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangle();
                    break;
                default:
                    if (select == 0) {
                        break;
                    }
                    System.out.println("Please enter a valid number!!!");
            }
        }while (select != 0);


    }
}
