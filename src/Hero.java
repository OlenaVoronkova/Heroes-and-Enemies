public class Hero {
    public String name;
    public String race;
    public int strenght;
    public int agility;
    public int intelligence;
    public int healthPoints;
    public int mana;



    public Hero(String name, String race, int strenght, int agility, int intelligence, int healthPoints, int mana){
       this.name = name;
       this.race = race;
       this.strenght = strenght;
       this.agility = agility;
       this.intelligence = intelligence;
       this.healthPoints = healthPoints;
       this.mana = mana;
    }
    public String getName(){
        return name;
    }
    public String getRace(){
        return race;
    }
    public int getStrenght(){
        return strenght;
    }

    public int getAgility() {
        return agility;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public int getMana() {
        return mana;
    }


}
