package tasks.GuessTheNumber;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100);

        Scanner input = new Scanner(System.in);

        int selected;
        int right = 0;
        int[] wrong = new int[5];
        boolean isWin = false;
        boolean isWrong = false;
        System.out.println(number);

        while (right < 5) {

            System.out.println("Please enter a number: ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99){
                System.out.println("Please enter a number between 0-100");
                if (isWrong) {
                    right++;
                    System.out.println("You have only chance: " + (5-right));
                }else {
                    isWrong = true;
                    System.out.println("You will lose a right point after this");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("You Win");
                isWin = true;
                break;
            }else {
                if (selected < number) {
                    System.out.println(selected + " less than number");
                }else {
                    System.out.println(selected + " higher than number");
                }
                wrong[right++] = selected;
                System.out.println("You have only chance: " + (5-right));
            }
        }

        if (!isWin) {
            System.out.println("Game Over");
            if (!isWrong) {
                System.out.println("Your Wrong Answer: " + Arrays.toString(wrong));
            }
        }

    }
}
