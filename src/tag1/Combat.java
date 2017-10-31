package tag1;

public class Combat extends Enemy {

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
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    attackPhase = false;
                } else {
                    System.out.println("You swing at the monster but misses!");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    attackPhase = false;
                }

                if (weakMHealth <= 0) {
                    alive = false;
                }

                if (pHealth <= 0) {
                    game.player.health("Combat");
                }

            } else if (attackPhase == false) {
                boolean attack = game.evil.weakMinotaurAttack();
                if (attack == true) {
                    System.out.println("the monster attack you and hits!");
                    game.player.setHealth(pHealth -= weakMDamage);
                    System.out.println("Your current health: " + pHealth);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    attackPhase = true;
                } else {
                    System.out.println("The monster attack you but misses!");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    attackPhase = true;
                }

                if (weakMHealth <= 0) {
                    alive = false;
                }

                if (pHealth <= 0) {
                    game.player.health("Combat");
                }

            }
        }
    }

    public void strongCombat() {

        int pDamage = game.player.getDamage();
        int pHealth = game.player.getHealth();
        int strongMHealth = game.evil.getStrongMHealth();
        int strongMDamage = game.evil.getStrongMDamage();
        boolean attackPhase = true;
        boolean alive = true;

        System.out.println("You encounter a strong minotaur, it roars when it see you and charges to attack!");
        while (alive == true) {

            if (attackPhase == true) {
                boolean attack = game.player.playerCombat();
                if (attack == true) {
                    System.out.println("You swing at the monster and hits it!");
                    strongMHealth -= pDamage;
                    System.out.println("The monsters current health: " + strongMHealth);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    attackPhase = false;
                } else {
                    System.out.println("You swing at the monster but misses!");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    attackPhase = false;
                }

                if (strongMHealth <= 0) {
                    alive = false;
                }

                if (pHealth <= 0) {
                    game.player.health("Combat");
                }

            } else if (attackPhase == false) {
                boolean attack = game.evil.strongMinotaurAttack();
                if (attack == true) {
                    System.out.println("the monster attack you and hits!");
                    pHealth -= strongMDamage;
                    System.out.println("Your current health: " + pHealth);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    attackPhase = true;
                } else {
                    System.out.println("The monster attack you but misses!");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    attackPhase = true;
                }

                if (strongMHealth <= 0) {
                    alive = false;
                }

                if (pHealth <= 0) {
                    game.player.health("Combat");
                }

            }
        }
    }

    public void mightyCombat() {

        int pDamage = game.player.getDamage();
        int pHealth = game.player.getHealth();
        int mightyMHealth = game.evil.getMightyMHealth();
        int mightyMDamage = game.evil.getMightyMDamage();
        boolean attackPhase = true;
        boolean alive = true;

        System.out.println("You encounter a mighty minotaur, it roars when it see you and charges to attack!");
        while (alive == true) {

            if (attackPhase == true) {
                boolean attack = game.player.playerCombat();
                if (attack == true) {
                    System.out.println("You swing at the monster and hits it!");
                    mightyMHealth -= pDamage;
                    System.out.println("The monsters current health: " + mightyMHealth);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    attackPhase = false;
                } else {
                    System.out.println("You swing at the monster but misses!");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    attackPhase = false;
                }

                if (mightyMHealth <= 0) {
                    alive = false;
                }

                if (pHealth <= 0) {
                    game.player.health("Combat");
                }

            } else if (attackPhase == false) {
                boolean attack = game.evil.mightyMinotaurAttack();
                if (attack == true) {
                    System.out.println("the monster attack you and hits!");
                    pHealth -= mightyMDamage;
                    System.out.println("Your current health: " + pHealth);
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    attackPhase = true;

                } else {
                    System.out.println("The monster attack you but misses!");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                    attackPhase = true;
                }

                if (mightyMHealth <= 0) {
                    alive = false;
                }

                if (pHealth <= 0) {
                    game.player.health("Combat");
                }

            }
        }
    }
}
