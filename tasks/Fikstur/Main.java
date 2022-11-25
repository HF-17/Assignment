package tasks.Fikstur;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<String> teams = new ArrayList<>();
        Random random = new Random();
        Scanner scan = new Scanner(System.in);
        System.out.println("Hello Welcome to Fixture Creator");

        System.out.println("Please enter number of team: ");
        int size = scan.nextInt();

        System.out.println("Please enter teams in fixture:");
        for (int i=0; i<size; i++){
            teams.add(scan.next());
        }
        if (size % 2 == 1){
            teams.add("Bay");
            size++;
        }

        int index = random.nextInt(size);
        String fix_team = teams.get(index);
        teams.remove(fix_team);
        for (int i=1; i<=(size-1); i++){
            System.out.println("ROUND " + i);
            System.out.println("1. Match: " + fix_team + "-" + teams.get(0));
            for (int j=1, k=2; j<=(size-2)/2;j++,k++){
                System.out.println(k + ". Match: " + teams.get(j) + "-" + teams.get(size-j-1));
            }
            teams.add(0,teams.get(size-2));

        }
        for (int i=1,m=size; i<=(size-1); i++,m++){
            System.out.println("ROUND " + m);
            System.out.println("1. Match: " + teams.get(0) + "-" + fix_team);
            for (int j=1, k=2; j<=(size-2)/2;j++,k++){
                System.out.println(k + ". Match: " + teams.get(size-j-1) + "-" + teams.get(j));
            }
            teams.add(0,teams.get(size-2));
        }





    }
}
