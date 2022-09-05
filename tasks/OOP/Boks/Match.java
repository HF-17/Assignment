package tasks.OOP.Boks;

import java.util.Random;

public class Match {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    Match(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    void run() {

            if (isCheck()) {
                while (f1.health > 0 && f2.health > 0) {
                    System.out.println("======== YENİ ROUND ===========");
                    if (start()) {
                        f2.health = f1.hit(f2);
                        if (isWin()) {
                            break;
                        }
                        f1.health = f2.hit(f1);
                        if (isWin()) {
                            break;
                        }
                        printScore();
                    }else {
                        f1.health = f2.hit(f1);
                        if (isWin()) {
                            break;
                        }
                        f2.health = f1.hit(f2);
                        if (isWin()) {
                            break;
                        }
                        printScore();
                    }
                }
            } else {
                System.out.println("Dövüscülerin sikletleri uyusmuyor");
            }
    }

    boolean isCheck() {
        return (this.f1.weight >= minWeight && this.f1.weight <= maxWeight) && (this.f2.weight >= minWeight && this.f2.weight <= maxWeight);
    }

    boolean start() {
        Random rd = new Random();
        return rd.nextBoolean();
    }

    boolean isWin(){
        if (f1.health == 0) {
            System.out.println(f2.name + "WIN");
            return true;
        }
        if (f2.health == 0) {
            System.out.println(f1.name + "WIN");
            return true;
        }
        return false;
    }

    void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }


}
