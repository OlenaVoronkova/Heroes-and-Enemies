import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.List;

public class Battlefield {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Hero legolas = new Hero("Legolas", "elf", 10, 20, 15, 100, 200, 50);
        Hero gimli = new Hero("Gimli", "dwarf", 20, 10, 15, 200, 150, 30);
        Hero aragorn = new Hero("Aragorn", "man", 10, 15, 20, 100, 200, 40);

        String legolasName = legolas.getName();
        String gimliName = gimli.getName();
        String aragornName = aragorn.getName();

        System.out.println("Finally, you're on the battlefield, my precious. Now, I choose the fitting hero for you, my precious.");

        ArrayList<Hero> heroList = new ArrayList<>();

        heroList.add(new Hero("Legolas", "elf", 10, 20, 15, 100, 200, 50));
        heroList.add(new Hero("Gimli", "dwarf", 20, 10, 15, 200, 150, 30));
        heroList.add(new Hero("Aragorn", "man", 10, 15, 20, 100, 200, 40));

        List<Hero> selectedHero = selectRandomHero(heroList, 1);

        System.out.println("Selected hero:");
        for (Hero hero : selectedHero) {
            System.out.println(hero.name);

        }

        Skill powerShot = new Skill("PowerShot", 10, 20);
        Skill blizzard = new Skill("Blizzard", 30, 40);
        Skill shadowVeil = new Skill("Shadow Veil", 5, 15);
        Skill arcaneSurge = new Skill("Arcane Surge", 15, 25);
        Skill celestialFury = new Skill("Celestial Fury", 20, 30);
        Skill blazingTempest = new Skill("Blazing Tempest", 25, 35);
        Skill frostNova = new Skill("Frost Nova", 35, 45);
        Skill thunderStrike = new Skill("ThunderStrike", 40, 50);
        Skill naturesEmbrace = new Skill("Nature's Embrace", 45, 55);

        String powerShotName = powerShot.getName();
        String blizzardName = blizzard.getName();
        String shadowVeilName = shadowVeil.getName();
        String arcaneSurgeName = arcaneSurge.getName();
        String celestialFuryName = celestialFury.getName();
        String blazingTempestName = blazingTempest.getName();
        String frostNovaName = frostNova.getName();
        String thunderStrikeName = thunderStrike.getName();
        String naturesEmbraceName = naturesEmbrace.getName();


        System.out.println("Now, by chance, you'll be getting 1 skill, my precious.");


        ArrayList<Skill> skillsList = new ArrayList<>();

        skillsList.add(new Skill("PowerShot", 10, 20));
        skillsList.add(new Skill("Blizzard", 30, 40));
        skillsList.add(new Skill("Shadow Veil", 5, 15));
        skillsList.add(new Skill("Arcane Surge", 15, 25));
        skillsList.add(new Skill("Celestial Fury", 20, 30));
        skillsList.add(new Skill("Blazing Tempest", 25, 35));
        skillsList.add(new Skill("Frost Nova", 35, 45));
        skillsList.add(new Skill("ThunderStrike", 40, 50));
        skillsList.add(new Skill("Nature's Embrace", 45, 55));


        List<Skill> selectedSkills = selectRandomSkills(skillsList, 1);


        for (Skill skill : selectedSkills) {
            System.out.println("Your  skill is " + skill.name + ".");

        }

        Enemy gollum = new Enemy("Gollum", "unknown", 100, 100, "КУСЬ", 30);
        Enemy saruman = new Enemy("Saruman", "wizard", 100, 100, "КУСЬ", 30);
        Enemy shelob = new Enemy("Shelob", "spider", 100, 100, "КУСЬ", 30);

        ArrayList<Enemy> enemyList = new ArrayList<>();

        enemyList.add(new Enemy("Gollum", "unknown", 100, 100, "КУСЬ", 30));
        enemyList.add(new Enemy("Saruman", "wizard", 100, 100, "КУСЬ", 30));
        enemyList.add(new Enemy("Shelob", "spider", 100, 100, "КУСЬ", 30));

        List<Enemy> selectedEnemy = selectRandomEnemy(enemyList, 1);
        System.out.println("Selected enemy:");
        for (Enemy enemy : selectedEnemy) {
            System.out.println(enemy.name);
            System.out.println("Your enemy is " + enemy.name + ". Good luck!");


            while (aragorn.getHealthPoints() > 0 && shelob.getHP() > 0) {
                for ( Hero hero : selectedHero) {
                    for (Skill skill : selectedSkills) {
                        int heroDamage = aragorn.getDamage();
                        System.out.println("Your hero is " + hero.name + " his skill is " + skill.name + ", his damage is " + heroDamage + " .");
                    }
                }

           for (Enemy enemyName : selectedEnemy) {
               String enemySkill = shelob.skill;
               int shelobDamage = shelob.getDamage();
               System.out.println("Your enemy is " + enemy.name + " her/his skill is " + enemySkill + " and her/his damage is " + shelobDamage + " . Good luck!");

               int newHeroHPValue = aragorn.getHealthPoints() - shelobDamage;
               int newEnemyHPValue = shelob.getHP() - aragorn.damage;
               aragorn.setHealthPoints(newHeroHPValue);
               shelob.setHP(newEnemyHPValue);


               System.out.println("There is a new value of Aragorn hp: " + newHeroHPValue + " .");
               System.out.println("There is a new value of Shelob hp: " + newEnemyHPValue + " .");
           }
        }


    }

}

    public static List<Skill> selectRandomSkills(List<Skill> skillsList, int count) {
        List<Skill> selectedSkills = new ArrayList<>();
        Random rand = new Random();

        while (selectedSkills.size() < count) {
            int randomIndex = rand.nextInt(skillsList.size());
            Skill skill = skillsList.get(randomIndex);
            if (!selectedSkills.contains(skill)) {
                selectedSkills.add(skill);
            }
        }

        return selectedSkills;
    }

    public static List<Enemy> selectRandomEnemy(List<Enemy> enemysList, int count) {
        List<Enemy> selectedEnemy = new ArrayList<>();
        Random rand = new Random();

        while (selectedEnemy.size() < count) {
            int randomIndex = rand.nextInt(enemysList.size());
            Enemy enemy = enemysList.get(randomIndex);
            if (!selectedEnemy.contains(enemy)) {
                selectedEnemy.add(enemy);
            }
        }

        return selectedEnemy;
    }
    public static List<Hero> selectRandomHero(List<Hero> heroList, int count) {
        List<Hero> selectedHero = new ArrayList<>();
        Random rand = new Random();

        while (selectedHero.size() < count) {
            int randomIndex = rand.nextInt(heroList.size());
            Hero hero = heroList.get(randomIndex);
            if (!selectedHero.contains(hero)) {
                selectedHero.add(hero);
            }
        }

        return selectedHero;
    }
}
