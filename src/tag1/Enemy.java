package tag1;

public class Enemy extends TAG1 {

    private int hitChance;
    private int weakMHealth = 30;
    private int weakMDamage = 5;
    private int strongMHealth = 50;
    private int strongMDamage = 15;
    private int mightyMHealth = 100;
    private int mightyMDamage = 25;
    private final int houndDamage = 15;
    private final int guardDamage = 50;

    private boolean hound = false;

    public void hound() {

        if (!hound) {
            int ran = (int) (3 * Math.random()) + 1;
            System.out.println(ran);
            if (ran == 3) {
                System.out.println("The hound wakes up and jumps to attack you, it's teeth sinks into your arm and you lose 15 health");
                System.out.println("The hound loses interest and leaves you alone");
                game.player.setHealth(game.player.getHealth() - houndDamage);
                System.out.println("Your current health is now " + game.player.getHealth());
                game.setAreIn(true);
            }
            hound = true;
        } else if (hound) {
            System.out.println("The hound sees you immediately and once again jump to attack, you lose 15 health");
            System.out.println("The hound loses interest and leaves you alone");
            game.player.setHealth(game.player.getHealth() - houndDamage);
            System.out.println("Your current health is now " + game.player.getHealth());
        }
        
        if(game.player.getHealth() < 1) {
            System.out.println("Your Health has fallen below 1 and draw your last breath");
            System.exit(0);
        }

    }

    public void guards() {
        System.out.println("You've been beaten up, and is thrown from the room. You lose 50 health");
        game.player.setHealth(game.player.getHealth() - guardDamage);
        System.out.println("The guards also steal all your gold!");
        System.out.println("Your current health is now " + game.player.getHealth());
        game.player.setGold(0);
        if(game.player.getHealth() < 1) {
            System.out.println("Your Health has fallen below 1 and draw your last breath");
            System.exit(0);
        }
    }

    public boolean weakMinotaurAttack() {

        hitChance = (int) (10 * Math.random()) + 1;

        return hitChance >= 7;
    }

    public boolean strongMinotaurAttack() {

        hitChance = (int) (10 * Math.random()) + 1;

        return hitChance >= 4;

    }

    public boolean mightyMinotaurAttack() {

        hitChance = (int) (10 * Math.random()) + 1;

        return hitChance >= 2;
    }

    public int loot() {

        System.out.println("Do you want to loot the corpse?");
        String choice = game.scan.next().toLowerCase();
        if (choice.equals("y")) {
            int drop = (int) (10 * Math.random()) + 1;
            System.out.println(drop);
            switch (drop) {
                case 1:
                    System.out.println("You've found a Sword!");
                    game.player.inventoryAdd("Sword");
                    break;
                case 3:
                    System.out.println("You've found a Club!");
                    game.player.inventoryAdd("club");
                    break;
                case 5:
                    System.out.println("You've found a Minor Potion!");
                    game.item.loot_Minor_Potion();
                    break;
                case 7:
                    System.out.println("You've found a Greater Potion!");
                    game.item.loot_Greater_Potion();
                    break;
                case 9:
                    System.out.println("You've found five Coins!");
                    game.item.loot_Coins();
                    break;
                default:
                    System.out.println("The corpse was empty");
                    break;
            }
            return drop;
        } else if (choice.equals("n")) {
            System.out.println("You leave the corpse alone and it turns to ash!");
        } else {
            System.out.println("invalid answer!");
            loot();
        }
        return 0;
    }

    public int getStrongMHealth() {
        return strongMHealth;
    }

    public void setStrongMHealth(int strongMHealth) {
        this.strongMHealth = strongMHealth;
    }

    public int getStrongMDamage() {
        return strongMDamage;
    }

    public void setStrongMDamage(int strongMDamage) {
        this.strongMDamage = strongMDamage;
    }

    public int getMightyMHealth() {
        return mightyMHealth;
    }

    public void setMightyMHealth(int mightyMHealth) {
        this.mightyMHealth = mightyMHealth;
    }

    public int getMightyMDamage() {
        return mightyMDamage;
    }

    public void setMightyMDamage(int mightyMDamage) {
        this.mightyMDamage = mightyMDamage;
    }

    public int getWeakMHealth() {
        return weakMHealth;
    }

    public void setWeakMHealth(int weakMHealth) {
        this.weakMHealth = weakMHealth;
    }

    public int getWeakMDamage() {
        return weakMDamage;
    }

    public void setWeakMDamage(int weakMDamage) {
        this.weakMDamage = weakMDamage;
    }
}
