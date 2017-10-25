package tag1;

public class Items extends TAG1 implements Item {
    
    private String choice;
    private int health;
    private int gold;
    private int armor;
    private int damage;
    
    public void minor_Potion() {
        pickUpItem("a Minor Potion");
    }
    
    public void greater_Potion() {
        pickUpItem("a Greater Potion");
    }
    
    public void coin() {        
        pickUpGold("a Coin");        
        gold = game.player.getGold();
        game.player.setGold(gold += 1);
    }
    
    public void coins() {        
        pickUpGold("Five Coins");        
        gold = game.player.getGold();
        game.player.setGold(gold += 5);
    }
    
    public void treasure() {        
        pickUpGold("a Treasure");
        System.out.println("The treasure holds 100 coins");
        gold = game.player.getGold();
        game.player.setGold(gold += 100);
    }
    
    public void cloth_Armor() {
        pickUpItem("Cloth Armor");
        //armor + 10
    }
    
    public void leather_Armor() {
        pickUpItem("leather Armor");
        //armor + 25
    }
    
    public void plate_Armor() {
        pickUpItem("Plate Armor");
        //armor 0+50
    }
    
    public void sword() {
        pickUpItem("Sword");
        //damage + 15
    }
    
    public void club() {
        pickUpItem("Club");
        //damage + 10
    }
    
    public void axe() {
        pickUpItem("Axe");
        //damage + 20
    }
    
    public void fire_Bomb() {
        pickUpItem("fire bomb");
        //damage +30
    }
    
    public void magical_Orb() {
        pickUpItem("magical orb");
        //damage +50
    }
    
    public void torch() {
        pickUpItem("torch");
        //damage +15
    }
    
    public void small_Bag() {
        pickUpItem("small bag");
        game.player.inventory_Expand("small bag");
    }
    
    public void large_bag() {
        pickUpItem("large bag");
        game.player.inventory_Expand("large bag");
    }
    
    @Override
    public void pickUpGold(String item) {
        System.out.println("You've found: " + item);
        System.out.println("Do you want to pick it up?");
        choice = game.scan.next();
        if (choice.equals('y')) {
            System.out.println("You've picked up " + item);
        }
    }
    
    @Override
    public void pickUpItem(String item) {
        System.out.println("You've found: " + item);
        System.out.println("Do you want to pick it up?");
        choice = game.scan.next();
        if (choice.equals('y')) {
            System.out.println("You've picked up " + item);
            game.player.inventoryAdd(item);
        }
    }
    
    public void pickUpPotion(String item) {
        System.out.println("You've found: " + item);
        System.out.println("Do you want to pick it up?");
        choice = game.scan.next();
        if (choice.equals('y')) {
            System.out.println("You've picked up " + item);
            health = game.player.getHealth();
            if (item.equals("a Minor Potion")) {
                game.player.setHealth(health += 25);
            } else if (item.equals("a Greater Potion")) {
                game.player.setHealth(health += 50);
            }
        }
    }    
}
