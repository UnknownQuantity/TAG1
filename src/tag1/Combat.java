package tag1;

public class Combat extends Enemy {

    int strongMHealth = 50;
    int strongMDamage = 15;
    int mightyMDamage = 25;
    int mightyMHealth = 100;

    public void weakCombat() {

        int pDamage = game.player.getDamage();
        int pHealth = game.player.getHealth();
        int weakMHealth = game.evil.getWeakMHealth();
        int weakMDamage = game.evil.getWeakMDamage();
        boolean attackPhase = true;
        boolean alive = true;

        System.out.println("You encounter a weak minotaur, it roars when it see you and charges to attack!");
        while (alive == true) {

            if (attackPhase == true) {
                boolean attack = game.player.playerCombat();
                if (attack == true) {
                    System.out.println("You swing at the monster and hits it!");
                    weakMHealth -= pDamage;
                    System.out.println("The monsters current health: " + weakMHealth);
                    attackPhase = false;
                } else {
                    System.out.println("You swing at the monster but misses!");
                    attackPhase = false;
                }

                if (weakMHealth <= 0 || pHealth <= 0) {
                    alive = false;
                }
            } else if (attackPhase == false) {
                boolean attack = game.evil.weakMinotaurAttack();
                if (attack == true) {
                    System.out.println("the monster attack you and hits!");
                    pHealth -= weakMDamage;
                    System.out.println("Your current health: " + pHealth);
                    attackPhase = true;
                } else {
                    System.out.println("The monster attack you but misses!");
                    attackPhase = true;
                }             

                if (weakMHealth <= 0) {
                    game.evil.loot();
                    alive = false;
                }
                
                if (weakMHealth <= 0 || pHealth <= 0) {
                    alive = false;
                }

            }
        }
    }

}
