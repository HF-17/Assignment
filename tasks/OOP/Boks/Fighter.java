package tasks.OOP.Boks;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;

    Fighter(String name, int damage, int health, int weight, double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        this.dodge = dodge;
    }

    int hit(Fighter foe) {
        System.out.println("----------------------");
        System.out.println(this.name + "=>" + foe.name + this.damage + "vurdu");

        if (foe.dodge()) {
            System.out.println("Hasar savruldu");
            return foe.health;
        }

        if (foe.health - this.damage < 0) {
            return 0;
        }

        return foe.health - this.damage;
    }

    boolean dodge() {
        double randomNumber = Math.random()*100;
        return randomNumber <= this.dodge;
    }
}
