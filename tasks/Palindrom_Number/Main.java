package tasks.Palindrom_Number;

public class Main {
    static boolean isBoolean(int number){
        int temp = number, reverse_number = 0, last_number;
        while (temp != 0) {
            last_number = temp % 10;
            reverse_number = (reverse_number * 10) + last_number;
            temp /= 10;
        }

        if (reverse_number == number) {
            return true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isBoolean(2476));
    }
}
