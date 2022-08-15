package tasks.Prime_Number;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int temp=3,flag=0,m;

        System.out.println("2");

        while (temp<100) {

            m = temp/2 + 1;

            for (int i=2; i<=m; i++) {
                if (temp % i == 0) {
                    flag = 1;
                    break;
                }
            }
            if (flag == 0) {
                System.out.println(temp);
            }
            flag=0;

            temp++;
        }
    }
}
