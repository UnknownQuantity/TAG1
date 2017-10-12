package tag1;

import java.util.Random;
import java.util.Scanner;

public class Player {

    private int health = 100;
    private int gold = 0;
    private String name;
    private final static Scanner sc = new Scanner(System.in);
    private boolean search = false;

    public void Player() {

        System.out.println("Hello, please enter your name");
        name = sc.next();
        System.out.println("Hello there " + name);

        System.out.println("At the start of you adventure your health is: " + health + "\nBeware of the dangers in the maze!");
    }

    public String Movement() {

        String choice = "";
        System.out.println("Which way do you want to go?");
        sc.next();

        switch (choice) {
            case "North":
                break;
            case "South":
                break;
            case "West":
                break;
            case "East":
                break;
            default:
                break;
        }

        return choice;
    }

    public int Health() {

        String danger = "";

        switch (danger) {
            case "Poison":
                System.out.println("The poison in the room suffercates you");
                health -= 25;
                break;
            case "Rotten food":
                health -= 5;
                break;
            case "Death":
                health = 0;
                break;
            case "Guards":
                health -= 50;
                break;
            case "Explosion":
                health -= 75;
                break;
            case "Trap":
                int rs = (int) (20 * Math.random()) + 1;
                if (rs == 20) {
                    System.out.println("The trap hits you straith in the face and knocks you off your feet");
                } else if (rs > 15) {
                    System.out.println("You try to dodge the trap but is hit in the chest");
                } else if (rs > 10) {
                    System.out.println("You dodge the trap but is hit in the legs");
                } else if (rs < 10) {
                    System.out.println("You dodge the trap completely but is hurt as you hit the ground");
                }
                health -= rs;
                break;
            default:
                break;
        }

        if (health < 1) {
            System.out.println("Your health has fallen below 1 and you draw your last breath");
            //game.end();
        }

        System.out.println(health);
        return health;
    }

    public int Gold() {

        String find = "";

        switch (find) {
            case "Treasure":
                gold += 100;
                break;
            case "Coin":
                gold += 1;
                break;
            case "Coins":
                gold += 5;
                break;
            case "Guards":
                gold = 0;
                break;
            default:
                break;
        }

        return gold;
    }

}
