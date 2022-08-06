package tasks.KDV;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double bill,kdv,aKdv,rKdv=0.18;
        String kdv_rate;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your bill: ");
        bill = input.nextDouble();

        rKdv = (bill>0 && bill<1000) ? 0.18 : 0.08;
        kdv_rate = (bill>0 && bill<1000) ? "%18" : "%8";

        aKdv = bill * rKdv;
        kdv = bill + aKdv;

        System.out.println("Bill(not with KDV): " + bill);
        System.out.println("Rate of KDV: " + kdv_rate);
        System.out.println("Bill with KDV: " + kdv);
        System.out.println("Bill of KDV: " + aKdv);





    }
}
