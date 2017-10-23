package tag1;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {

    //******************Player-Varibles.start******************\\
    private int health = 100;    
    private int gold = 0;
    private int armor = 0; //WIP
    private int strength = 5;
    private int damage = 15;
    private int inventory_space = 10;
    private String bag = "start bag"; //WIP end
    private String name;
    private final static Scanner sc = new Scanner(System.in);
    Items it = new Items();
    Rooms r1 = new Rooms();

    //******************Player-Varibles.end******************\\
    //******************Player-gamplay-methods.start******************\\
    public void Player() {

        System.out.println("Hello, please enter your name");
        name = sc.next();
        System.out.println("Hello there " + name);

        System.out.println("At the start of you adventure your health is: " + health + "\nBeware of the dangers in the maze!\nYou're able to search every room you enter by simple typing 's'.");
    }

    public String Movement() {
        r1.room.get(0);
        String choice = "";

        System.out.println("Which way do you want to go? n, e, w, s");
        if ("".equals(choice)) {
            choice = sc.next();
            return choice;
        }
        return choice;
    }

    public int Health(String modi) {

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
                System.out.println("Your current health is now " + health);
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
            default:
                break;
        }

        if (health < 1) {
            System.out.println("Your health has fallen below 1 and you draw your last breath");
            System.exit(0); //ret fejl
        }
        return health;
    }

    public int Loot(String find) {

        switch (find) {
            case "Treasure":
                System.out.println("You've found the treasure! It contains 100 gold");
                gold += 100;
                break;
            case "Coin":
                System.out.println("You've found one gold coin!");
                gold += 1;
                break;
            case "Coins":
                System.out.println("You've found five gold coins!");
                gold += 5;
                break;
            case "Guards":
                System.out.println("The guards steal all your gold!");
                gold = 0;
                break;
            case "Healing_Potion":
                break;
            case "Greater_Healing_Potion":
                break;
            default:
                break;
        }

        return gold;
    }
    
    public void Inventory() {
        
            ArrayList inventory_1 = new ArrayList(inventory_space);
        
        if (bag.equals("small bag")) {
            inventory_space = 15;
            ArrayList inventory_2 = new ArrayList(inventory_space);
        }
        else if (bag.equals("large bag")) {
            inventory_space = 20;
            ArrayList inventory_2 = new ArrayList(inventory_space);
                }
    }

    //******************Player-gamplay-methods.end******************\\
    //******************Player-getters.start******************\\
    public int getGold() {
        return gold;
    }

    public int getHealth() {
        return health;
    }

    //******************Player-getters.end******************\\
}
