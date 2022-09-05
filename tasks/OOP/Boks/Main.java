package tasks.OOP.Boks;

public class Main {
    public static void main(String[] args) {
        Fighter Alex = new Fighter("Alex",25,100,85,50);
        Fighter Mike = new Fighter("Mike",35,100,95,40);
        Match match = new Match(Alex,Mike,80,100);
        match.run();

    }
}
