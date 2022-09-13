package tasks.MineSweeper.Main;

import java.util.Random;
import java.util.Scanner;

public class MineSweeper {

    Scanner input = new Scanner(System.in);
    Random random = new Random();

    int rowNumber, colNumber;
    String[][] matrix;
    String[][] matrix2;


    int mine;
    int choice_row;
    int choice_col;
    boolean isWrong;
    int atempt;
    int num;


    MineSweeper(int rowNumber, int colNumber) {

        this.colNumber = colNumber;
        this.rowNumber = rowNumber;

        this.matrix = new String[rowNumber][colNumber];
        this.matrix2 = new String[rowNumber][colNumber];


    }

    void table() {

        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                matrix[i][j] = "-";
            }
        }

    }

    void table2() {

        for (int i = 0; i < this.rowNumber; i++) {
            for (int j = 0; j < this.colNumber; j++) {
                matrix2[i][j] = "-";
            }
        }

        for (int i=0; i<this.rowNumber; i++) {
            for (int j=0; j<this.colNumber; j++) {
                System.out.print(matrix2[i][j] + "  ");
            }
            System.out.println();
        }

    }

    void randomIndex() {

        int control = 0;
        this.mine = (this.rowNumber * this.colNumber) / 4;
        while (control < this.mine) {

            int i = random.nextInt(3), j = random.nextInt(3);
            this.matrix[i][j] = "*";

            control++;
        }

    }

    void print() {
        for (int i=0; i<this.rowNumber; i++) {
            for (int j=0; j<this.colNumber; j++) {
                System.out.print(matrix2[i][j] + "  ");
            }
            System.out.println();
        }
    }

    void selection() {
        this.isWrong = false;
        this.atempt = 0;


        while (!isWrong) {

            System.out.println("Enter a row: ");
            this.choice_row = input.nextInt();
            System.out.println("Enter a col: ");
            this.choice_col = input.nextInt();

            if (!(choice_row >= 0 && choice_row < this.rowNumber) || !(choice_col >= 0 && choice_col < this.colNumber)) {
                System.out.println("Your inputs are wrong");
            } else {
                if (this.matrix[choice_row][choice_col].equals("-")) {

                    if ((this.choice_col < this.colNumber-1) && this.matrix[choice_row][choice_col+1].equals("*")) {
                        num++;
                       this.matrix2[choice_row][choice_col] = String.valueOf(num);

                    }
                    if ((this.choice_row < this.rowNumber-1) && this.matrix[choice_row+1][choice_col].equals("*")) {
                        num++;
                        this.matrix2[choice_row][choice_col] = String.valueOf(num);

                    }
                    if ((this.choice_row != 0) && this.matrix[choice_row-1][choice_col].equals("*")) {
                        num++;
                        this.matrix2[choice_row][choice_col] = String.valueOf(num);

                    }
                    if ((this.choice_col != 0) && this.matrix[choice_row][choice_col-1].equals("*")) {
                        num++;
                        this.matrix2[choice_row][choice_col] = String.valueOf(num);

                    }
                    if ((this.choice_row < this.rowNumber-1) && (this.choice_col < this.colNumber-1) && this.matrix[choice_row+1][choice_col+1].equals("*")) {
                        num++;
                        this.matrix2[choice_row][choice_col] = String.valueOf(num);

                    }
                    if ((this.choice_row < this.rowNumber-1) && (this.choice_col != 0) && this.matrix[choice_row+1][choice_col-1].equals("*")) {
                        num++;
                        this.matrix2[choice_row][choice_col] = String.valueOf(num);

                    }
                    if ((this.choice_row != 0) && (this.choice_col < this.colNumber-1) && this.matrix[choice_row-1][choice_col+1].equals("*")) {
                        num++;
                        this.matrix2[choice_row][choice_col] = String.valueOf(num);

                    }
                    if ((this.choice_row != 0) && (this.choice_col != 0) && this.matrix[choice_row-1][choice_col-1].equals("*")) {
                        num++;
                        this.matrix2[choice_row][choice_col] = String.valueOf(num);

                    }

                    if (num == 0) {
                        this.matrix2[choice_row][choice_col] = String.valueOf(num);
                    }

                    print();
                    num=0;


                    atempt++;
                    System.out.println(atempt);
                    if (atempt == (this.rowNumber * this.colNumber) - this.mine) {
                        System.out.println("You Won");
                        isWrong = true;
                    }

                }else {
                    System.out.println("Game Over");
                    isWrong = true;
                }
            }
        }
    }
    
    void run() {

        System.out.println("Composition of Mines");

        table();
        randomIndex();


        for (int i=0; i<this.rowNumber; i++) {
            for (int j=0; j<this.colNumber; j++) {
                System.out.print(matrix[i][j] + "  ");
            }
            System.out.println();
        }

        System.out.println("Start: ");

        table2();

        selection();

    }
}
