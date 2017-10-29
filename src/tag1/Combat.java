package tag1;

public class Combat extends Enemy {

    int pHealth;
    int mHealth;
    int pDamage;
    int mDamage;

    public Combat() {

        boolean attackPhase = true;
        boolean alive = true;

        while (alive = true) {

            if (attackPhase = true) {
                game.player.playerCombat();
                attackPhase = false;
            } else if (attackPhase = false) {
                game.evil.weakMinotaur();
                attackPhase = true;
            }
        }
    }

    public void combat() {

    }

}
