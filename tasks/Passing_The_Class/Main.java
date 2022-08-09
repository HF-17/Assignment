package tasks.Passing_The_Class;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double mat,phy,che,tr,mc,avg=0;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your mathematics grade: ");
        mat = input.nextDouble();
        System.out.println("Please enter your physics grade: ");
        phy = input.nextDouble();
        System.out.println("Please enter your chemistry grade: ");
        che = input.nextDouble();
        System.out.println("Please enter your Turkish grade: ");
        tr = input.nextDouble();
        System.out.println("Please enter your music grade: ");
        mc = input.nextDouble();

        if (mat < 0 || mat > 100){
            System.out.println("You access invalid value");
            mat = 0;
        }
        if (phy < 0 || phy > 100){
            System.out.println("You access invalid value");
            phy = 0;
        }
        if (che < 0 || che > 100){
            System.out.println("You access invalid value");
            che = 0;
        }
        if (tr < 0 || tr > 100){
            System.out.println("You access invalid value");
            tr = 0;
        }
        if (mc < 0 || mc > 100){
            System.out.println("You access invalid value");
            mc = 0;
        }

        avg = mat + phy + che + tr + mc;
        System.out.println("Average is: " + avg/5);
        if (avg/5 < 55){
            System.out.println("You can NOT PASS THE CLASS!");
        }else {
            System.out.println("You can PASS THE CLASS");
        }


    }
}
