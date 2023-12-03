import java.util.Scanner;
public class Enemy {
    public String name;
    public String race;
    public int hP;
    public int mana;
    public String skill;
    public int damage;

    public Enemy(String name, String race, int HP, int mana, String skill, int damage ){
        this.name  = name;
        this.race = race;
        this.hP = HP;
        this.mana = mana;
        this.skill = skill;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public String getRace() {
        return race;
    }

    public int getHP() {
        return hP;
    }

    public int getMana() {
        return mana;
    }
}
