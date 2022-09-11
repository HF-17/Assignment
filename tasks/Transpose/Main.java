package tasks.Transpose;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] orginal = new int[2][3];
        int[][] transpose = new int[3][2];

        for (int i=0; i<2; i++) {
            for (int j=0; j<3; j++) {
                System.out.println("Please enter one of the elements of matrix");
                orginal[i][j] = input.nextInt();
            }
        }

        for (int i=0; i<3; i++) {
            for (int j=0; j<2; j++) {
                transpose[i][j] = orginal[j][i];
            }
        }

        System.out.println("Original: ");
        for (int i=0; i<2; i++) {
            for (int j=0; j<3; j++) {
                System.out.print(orginal[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("Transpose: ");
        for (int i=0; i<3; i++) {
            for (int j=0; j<2; j++) {
                System.out.print(transpose[i][j] + "\t");
            }
            System.out.println();
        }



    }
}
