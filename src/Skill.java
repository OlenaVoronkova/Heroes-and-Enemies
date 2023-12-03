import java.util.Scanner;
public class Skill {
    public String name;
    public int damage;
    public int manaCost;

    public Skill(String name, int damage,int manaCost){
        this.name = name;
        this.damage = damage;
        this.manaCost = manaCost;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getManaCost() {
        return manaCost;
    }
}
