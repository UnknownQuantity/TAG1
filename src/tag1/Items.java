package tag1;

public class Items extends TAG1 implements Item {

    private String choice;
    private int health;
    private int gold;
    private int coin;
    private int potion;
    private int item;

    public int minor_Potion() {
        int pick = 0;
        potion = pickUpPotion("a Minor Potion", '+');
        if (potion == 1 && game.player.getHealth() <= 75) {
            health = game.player.getHealth();
            game.player.setHealth(health + 25);
            pick = 1;
        }
        else if (potion == 1 && game.player.getHealth() > 75) {
            health = game.player.getHealth();
        game.player.setHealth(health = 100);
        }
        return pick;
    }
    
    public void loot_Minor_Potion() {
        
        if(game.player.getHealth() <= 75) {
            health = game.player.getHealth();
            game.player.setHealth(health + 25);
        }
        else if (game.player.getHealth() > 75) {
            health = game.player.getHealth();
        game.player.setHealth(health = 100);
        }
    }
    
    public void loot_Greater_Potion() {
        
        if(game.player.getHealth() <= 50) {
            health = game.player.getHealth();
            game.player.setHealth(health + 25);
        }
        else if (game.player.getHealth() > 50) {
            health = game.player.getHealth();
        game.player.setHealth(health = 100);
        }
    }

    public int greater_Potion() {
        int pick = 0;
        potion = pickUpPotion("a Greater Potion", '+');
        if (potion == 1 && game.player.getHealth() <= 50) {
            health = game.player.getHealth();
            game.player.setHealth(health + 50);
            pick = 1;
        }
        else if (potion == 1 && game.player.getHealth() >= 50) {
            health = game.player.getHealth();
        game.player.setHealth(health = 100);
        }
        return pick;
    }

    public int coin() {
        int pick = 0;
        coin = pickUpGold("a Coin", '+');
        if (coin == 1) {
            gold = game.player.getGold();
            game.player.setGold(gold += 1);
            pick = 1;
        }
        return pick;
    }

    public int coins() {
        int pick = 0;
        coin = pickUpGold("Five Coins", '+');
        if (coin == 1) {
            gold = game.player.getGold();
            game.player.setGold(gold += 5);
            pick = 1;
        }
        
        return pick;
    }
    
    public void loot_Coin() {
        gold = game.player.getGold();
        game.player.setGold(gold += 1);        
    }
    
    public void loot_Coins() {
        gold = game.player.getGold();
        game.player.setGold(gold += 5);
        
    }
    
    public int treasure() {
        int pick = 0;
        coin = pickUpGold("a Treasure", '+');
        if (coin == 1) {
            System.out.println("The treasure holds 100 coins");
            gold = game.player.getGold();
            game.player.setGold(gold += 100);
            pick = 1;
        }
        return pick;
    }

    public int sword() {
        int pick = 0;
        item = pickUpItem("sword", '+');
        if (item == 1) {
            pick = 1;
        }
        return pick;
        //damage + 15
    }

    public int club() {
        int pick = 0;
        item = pickUpItem("club", '+');
        if (item == 1) {
            pick = 1;
        }
        return pick;
    }
    
    @Override
    public int pickUpGold(String item, char es) {
        
        int pick = 0;
        if (es == '+') {
            System.out.println("You've found: " + item);
        }
        if (es == '+' || es == '-') {
            System.out.println("Do you want to pick it up?");
            choice = game.scan.next();
            switch (choice) {
                case "y":
                    System.out.println("You've picked up " + item);
                     pick = 1;
                     break;
                case "n":
                    System.out.println("You leave " + item + " on the groud");
                    pick = 0;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    pickUpGold(item, '-');
                    break;
            }
        }
        return pick;
    }

    @Override
    public int pickUpItem(String item, char es) {
        
        int pick = 0;
        if (es == '+') {
            System.out.println("You've found: " + item);
        }
        if (es == '+' || es == '-') {
            System.out.println("Do you want to pick up the item?");
            choice = game.scan.next();
            switch (choice) {
                case "y":
                    System.out.println("You've picked up " + item);
                    game.player.inventoryAdd(item);
                    pick = 1;
                    break;
                case "n":
                    System.out.println("You leave " + item + " on the groud");
                    pick = 0;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    pickUpItem(item, '-');
                    break;
            }
        }
        return pick;
    }

    @Override
    public int pickUpPotion(String item, char es) {
        
        int pick = 0;
        if (es == '+') {
            System.out.println("You've found: " + item);
        }
        if (es == '+' || es == '-') {
            System.out.println("Do you want to pick it up?");
            choice = game.scan.next();
            switch (choice) {
                case "y":
                    System.out.println("You've picked up " + item);
                    pick = 1;
                    break;
                case "n":
                    System.out.println("You leave " + item + " on the gound");
                    pick = 0;
                    break;
                default:
                    System.out.println("Invalid choice!");
                    pickUpItem(item, '-');
                    break;
            }
        }
        return pick;
    }
}
