package tasks.Harmonic_Serie;



public class Main2 {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5};
        double sum = 0, average = 0.0;

        for (int i=1; i<=numbers.length; i++) {
            sum += 1.0/i;
        }

        average = numbers.length / sum;

        System.out.println(average);



    }
}
