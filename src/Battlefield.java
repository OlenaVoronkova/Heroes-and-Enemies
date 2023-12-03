import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.List;

public class Battlefield {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Hero legolas = new Hero("Legolas", "elf", 10, 20, 15, 100, 200);
        Hero gimli = new Hero("Gimli", "dwarf", 20, 10, 15, 200, 150);
        Hero aragorn = new Hero("Aragorn", "man", 10, 15, 20, 100, 200);

        String legolasName = legolas.getName();
        String gimliName = gimli.getName();
        String aragornName = aragorn.getName();

        System.out.println("Finally, you're on the battlefield, my precious. Now, choose the fitting hero, my precious.");
        System.out.println(legolasName);
        System.out.println(gimliName);
        System.out.println(aragornName);
        String heroName = scanner.nextLine();

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


        ArrayList<String> skillsList = new ArrayList<>();

        skillsList.add("PowerShot");
        skillsList.add("Blizzard");
        skillsList.add("ShadowVeil");
        skillsList.add("ArcaneSurge");
        skillsList.add("CelestialFury");
        skillsList.add("BlazingTempest");
        skillsList.add("FrostNova");
        skillsList.add("ThunderStrike");
        skillsList.add("NaturesEmbrace");


        List<String> selectedSkills = selectRandomSkills(skillsList, 1);

        System.out.println("Selected skill:");
        for (String skill : selectedSkills) {
            System.out.println(skill);
            System.out.println("Your hero is " + heroName + " and your skill is " + skill + ".'");

        }

        Enemy gollum = new Enemy("Gollum", "unknown", 100, 100, "КУСЬ", 30);
        Enemy saruman = new Enemy("Saruman", "wizard", 100, 100, "КУСЬ", 30);
        Enemy shelob = new Enemy("Shelob", "spider", 100, 100, "КУСЬ", 30);

        ArrayList<String> enemyList = new ArrayList<>();

        enemyList.add("Gollum");
        enemyList.add("Saruman");
        enemyList.add("Shelob");

        List<String> selectedEnemy = selectRandomEnemy(enemyList, 1);
        System.out.println("Selected enemy:");
        for (String enemy : selectedEnemy) {
            System.out.println(enemy);
            System.out.println("Your enemy is " + enemy + ". Good luck!");

        }

    }

    public static List<String> selectRandomSkills(List<String> skillsList, int count) {
        List<String> selectedSkills = new ArrayList<>();
        Random rand = new Random();

        while (selectedSkills.size() < count) {
            int randomIndex = rand.nextInt(skillsList.size());
            String skill = skillsList.get(randomIndex);
            if (!selectedSkills.contains(skill)) {
                selectedSkills.add(skill);
            }
        }

        return selectedSkills;
    }

    public static List<String> selectRandomEnemy(List<String> enemysList, int count) {
        List<String> selectedEnemy = new ArrayList<>();
        Random rand = new Random();

        while (selectedEnemy.size() < count) {
            int randomIndex = rand.nextInt(enemysList.size());
            String enemy = enemysList.get(randomIndex);
            if (!selectedEnemy.contains(enemy)) {
                selectedEnemy.add(enemy);
            }
        }

        return selectedEnemy;
    }
}