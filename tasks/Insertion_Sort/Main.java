package tasks.Insertion_Sort;

import java.util.Arrays;

public class Main {

    void sorting(int[] arr) {
        int n = arr.length;
        for (int i=1; i<n; i++) {

           int  key = arr[i]; //16
           int j=i-1; //1

           while (j>=0 && key < arr[j]) {
               arr[j+1] = arr[j];
               j--;
           }

           arr[j+1] = key;
        }
    }



    public static void main(String[] args) {
        int[] arr = {27,22,16,2,18,6};
        Main is = new Main();
        is.sorting(arr);
        System.out.println(Arrays.toString(arr));
    }
}
