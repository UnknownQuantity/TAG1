package tag1;

import java.util.Scanner;

public class Items implements Item {
    
    private String choice;
    private int health;
    private int gold;
    private int armor;
    private int damage;
    Scanner sc = new Scanner(System.in);
    
    
    public int Minor_Potion() {        
        return health += 25;
    }
    
    public int Greater_Potion() {        
        return health += 50;
    }
    
    private int Coin() {
            System.out.println("You've found one gold coin!");
        return gold += 1;
    }
    
    private int Coins() {
        System.out.println("You've found five gold coins!");
        return gold += 5;
    }
    
    private int Treasure() {
        System.out.println("You've found the treasure! It contains 100 gold");
        return gold += 100;
    }
    
    private int Chest_Armor() {
    int rs = (int) (3 * Math.random()) + 1;
    switch (rs) {
        case 1:
            System.out.println("You find a cloth chest armor");
            armor += 10;
            break;
        case 2:
            System.out.println("You find a leather chest armor");
            armor += 25;
            break;
        case 3:
            System.out.println("You find a plate chest armor");
            armor += 50;
            break;
        default:
            break;
    }     
        return armor;
    }

    private int Main_Weapon() {
        int rs = (int) (3 * Math.random()) + 1;
        switch (rs) {
        case 1:
            System.out.println("You find a sword");
            armor += 15;
            break;
        case 2:
            System.out.println("You find a wooden club");
            armor += 10;
            break;
        case 3:
            System.out.println("You find an axe");
            armor += 20;
            break;
        default:
            break;
    }        
        return damage;
    }
 
    private int Off_Hand() {
        int rs = (int) (3 * Math.random()) + 1;
        switch (rs) {
        case 1:
            System.out.println("You find a fire bomb");
            damage += 30;
            break;
        case 2:
            System.out.println("You find a magical orb");
            damage += 50;
            break;
        case 3:
            System.out.println("You find a torch");
            damage += 15;
            break;
        default:
            break;
    }        
        return damage;
    }
    
    private void Bag() {
        int rs = (int) (2 * Math.random()) + 1;
        switch (rs) {
            case 1:
                System.out.println("You've found a small bag");
                break;
            case 2:
                System.out.println("You've found a large bag");
                break;
            default:
                break;
        }
    }
    
    @Override
    public String pickUp() {
    
        System.out.println("Do you want to pick up the item?");
        choice = sc.next();
        
        if (choice.equals('y')) {
            System.out.println("You've picked up the item");
            
        }
        return choice;
    }
}
