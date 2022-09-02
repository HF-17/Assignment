package tasks.Exponential_Number;

import java.util.Scanner;

public class Main2 {

    static int expo(int t, int u) {
        int result=1;

        if (u == 0) {
            return 1;
        }
        return t * expo(t,u-1);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int u, t;

        System.out.println("Tabandaki sayiyi giriniz: ");
        t = input.nextInt();
        System.out.println("Usteki sayiyi giriniz: ");
        u = input.nextInt();


        System.out.println(expo(t,u));
    }
}
