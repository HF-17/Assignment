package tasks.EBOB_EKOK;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1,n2,i=1,ebob = 0,ekok=0,j=1;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter n1: ");
        n1 = input.nextInt();

        System.out.println("Please enter n2: ");
        n2 = input.nextInt();

        // EBOB

        while (i<=n1) {
            if (n1%i == 0 && n2%i == 0) {
                ebob = i;
            }
            i++;
        }
        System.out.println(ebob);

        // EKOK

        while (j<=(n1*n2)){

            if (j%n1 == 0 && j%n2 == 0) {
                ekok = j;
                break;
            }

            j++;

        }
        System.out.println(ekok);
    }
}
