package tag1;

// not yet implemented
public class Enemy extends TAG1 {

    private int playerHealth, monsterHealth, damage, hitChance;
    private boolean hound, attack = false;
    private long lastTurn = System.currentTimeMillis();

    public void hound() {

        if (!hound) {
            int ran = (int) (3 * Math.random()) + 1;
            System.out.println(ran);
            if (ran == 3) {
                System.out.println("The hound wakes up and jumps to attack you, it's teeth sinks into your arm and you lose 15 health");
                System.out.println("The hound loses interest and leaves you alone");
                playerHealth = game.player.getHealth();
                game.player.setHealth(playerHealth -= 15);
                System.out.println("Your current health is now " + playerHealth);
                game.setAreIn(true);
            }
            hound = true;
        } else if (hound) {
            System.out.println("The hound sees you immediately and once again jump to attack, you lose 15 health");
            System.out.println("The hound loses interest and leaves you alone");
            playerHealth = game.player.getHealth();
            game.player.setHealth(playerHealth -= 15);
            System.out.println("Your current health is now " + playerHealth);
        }

    }

    public void weakMinotaur() {

        monsterHealth = 30;
        damage = 5;
        hitChance = (int) (10 * Math.random()) + 1;

        if (hitChance >= 6) {
            attack = true;
        } else {
            attack = false;
        }
    }

    public void strongMinotaur() {

        monsterHealth = 50;
        damage = 15;
        hitChance = (int) (10 * Math.random()) + 1;

        if (hitChance >= 4) {
            attack = true;
        } else {
            attack = false;
        }
    }

    public void mightyMinotaur() {

        monsterHealth = 100;
        damage = 25;
        hitChance = (int) (10 * Math.random()) + 1;

        if (hitChance >= 2) {
            attack = true;
        } else {
            attack = false;
        }
    }

    public int loot() {

        int drop = (int) (10 * Math.random()) + 1;

        //1 = sword
        //3 = club
        //5 = micor potion
        //7 = greater potion
        //9 = coins
        //lige tal = intet drop
        return drop;
    }
}
