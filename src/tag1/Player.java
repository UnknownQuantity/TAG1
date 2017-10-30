package tag1;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    //******************player-Varibles.start******************\\
    private int health = 100;
    private int gold = 0;
    private int armor = 0; //WIP
    private int strength = 5;
    private int baseDamage = 15;
    private int currentDamage = 15;//WIP end
    private int inventory_space = 10;
    private final static Scanner scan = new Scanner(System.in);
    private String name;
    ArrayList small_Inventory = new ArrayList(inventory_space);
    ArrayList current_Inventory = new ArrayList(small_Inventory);
    ArrayList worm_Items = new ArrayList(3);

    //******************player-Varibles.end******************\\
    //******************player-gamplay-methods.start******************\\
    public void player(String name) {
        this.name = name;
        System.out.println("Hello there " + name);
        System.out.println("At the start of you adventure your health is: " + health + "\nBeware of the dangers in the maze!\nYou're able to search every room you enter by simple typing 's'.");
    }
    
    public int health(String modi) {

        switch (modi) {
            case "Poison":
                System.out.println("The poison in the room suffercates you and you lose 25 health");
                health -= 25;
                System.out.println("Your current health is now " + health);
                break;
            case "Rotten food":
                System.out.println("You find some food in a bowl and proceeds to eat it, the food was rotten and you lose 5 health");
                health -= 5;
                System.out.println("Your current health is now " + health);
                break;
            case "Death":
                health = 0;
                break;
            case "Guards":
                System.out.println("You've been beaten up, and is thrown from the room. You lose 50 health");
                health -= 50;
                System.out.println("The guards also steal all your gold!");
                System.out.println("Your current health is now " + health);
                gold = 0;
                break;
            case "Explosion":
                System.out.println("While searching the room, you accidentaly knock over a vial and a large explosion occurs. You lose 75 health");
                health -= 75;
                System.out.println("Your current health is now " + health);
                break;
            case "Trap":
                int rs = (int) (20 * Math.random()) + 1;
                if (rs == 20) {
                    System.out.println("The trap hits you straight in the face and knocks you off your feet, you lose 20 health");
                } else if (rs > 15) {
                    System.out.println("You try to dodge the trap but is hit in the chest, you lose " + rs + " health");
                } else if (rs > 10) {
                    System.out.println("You dodge the trap but is hit in the legs, you lose " + rs + " health");
                } else if (rs < 10) {
                    System.out.println("You dodge the trap completely but is hurt as you hit the ground, you lose " + rs + " health");
                }
                health -= rs;
                System.out.println("Your current health is now " + health);
                break;
            case "Flames":
                System.out.println("You [Stood in the Fire]!, you lose 10 health");
                health -= 10;
                System.out.println("Your current health is now " + health);
                break;
            case "Hound_Sleep":
                System.out.println("The hound wakes up and jumps to attack you, it's teeth sinks into your arm and you lose 15 health");
                System.out.println("The hound loses interest and leaves you alone");
                health -= 15;
                System.out.println("Your current health is now " + health);
                break;
            case "Hound_Wake":
                System.out.println("The hound sees you immediately and once again jump to attack, you lose 15 health");
                System.out.println("The hound loses interest and leaves you alone");
                health -= 15;
                System.out.println("Your current health is now " + health);
                break;
            case "Healing_Potion":
                System.out.println("You find a Healing potion and chug it down. Restored 10 health");
                health += 10;
                System.out.println("Your current health is now " + health);
                break;
            case "Greater_Healing_Potion":
                System.out.println("You find a Healing potion and chug it down. Restored 25 health");
                health += 25;
                System.out.println("Your current health is now " + health);
                break;
            case "Monster":
                System.out.println("You meet a giant monster and is instantly killed");
                health = 0;
                break;
            case "Combat":
                System.out.println("The beast cleaves you with its weapon, ending your life");
                health = 0;
                break;
            default:
                break;
        }

        if (health < 1) {
            System.out.println("Your health has fallen below 1 and you draw your last breath");
            System.exit(0);
        }
        return health;
    }

    public void inventory_Expand(String bag) {

        if (bag.equals("small bag")) {
            inventory_space = 15;
            ArrayList medium_Inventory = new ArrayList(inventory_space);
            ArrayList tmp = new ArrayList(current_Inventory);
            tmp = current_Inventory;
            current_Inventory = medium_Inventory;
            current_Inventory = tmp;
        } else if (bag.equals("large bag")) {
            inventory_space = 20;
            ArrayList large_Inventory = new ArrayList(inventory_space);
            ArrayList tmp = new ArrayList(current_Inventory);
            tmp = current_Inventory;
            current_Inventory = large_Inventory;
            current_Inventory = tmp;
        }

    }

    public void inventoryAdd(String item) {
        current_Inventory.add(item);
        
    }

    public boolean playerCombat() {

        int hitChance = (int) (10 * Math.random()) + 1;
        boolean attack;

        attack = hitChance >= 2;

        return attack;

    }

    //******************player-gamplay-methods.end******************\\
    //******************player-getters.start******************\\
    public int getGold() {
        return gold;
    }

    public int getHealth() {
        return health;
    }

    public int getArmor() {
        return armor;
    }

    public int getStrength() {
        return strength;
    }

    public int getDamage() {
        return currentDamage;
    }

    public String getName() {
        return name;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDamage(int damage) {
        this.currentDamage = damage;
    }

    //******************player-getters.end******************\\
}
