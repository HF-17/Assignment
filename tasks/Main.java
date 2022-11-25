package tasks;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x,y;
        int n = scan.nextInt();
        int d = scan.nextInt();

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();


        for(int i=0; i<n; i++){
            for(int j=0; j<d; j++){
                arr.get(i).add(scan.nextInt());
            }
        }

        int q = scan.nextInt();

        for(int i=0; i<q; i++){
            x = scan.nextInt();
            y = scan.nextInt();
            System.out.println(arr.get(x).get(y));
        }

    }

    }

