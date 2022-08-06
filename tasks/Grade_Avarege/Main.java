package tasks.Grade_Avarege;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

       double mat,fzk,kmy,tr,trh,mzk;
       double avg = 0;

        Scanner input = new Scanner(System.in);

        System.out.println("What is your mathematics grade: ");
        mat = input.nextDouble();
        avg += mat;
        System.out.println("What is your physics grade: ");
        fzk = input.nextDouble();
        avg += fzk;
        System.out.println("What is your chemistry grade: ");
        kmy = input.nextDouble();
        avg += kmy;
        System.out.println("What is your turkish grade: ");
        tr = input.nextDouble();
        avg += tr;
        System.out.println("What is your history grade: ");
        trh = input.nextDouble();
        avg += trh;
        System.out.println("What is your music grade: ");
        mzk = input.nextDouble();
        avg += mzk;


        System.out.println("Your average is: " + avg/6);
        String str = avg>60 ? "You are PASS THE CLASS" : "You are NOT PASS THE CLASS";
        System.out.println(str);

    }
}
