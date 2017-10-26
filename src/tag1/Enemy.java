package tag1;
//WIP ændret 15:30
public class Enemy extends TAG1 {

    private int health;
    private boolean hound = false;
    private long lastTurn = System.currentTimeMillis();
    private int ran;
    private String westMove, eastMove, northMove, southMove;

    public void monster(RoomList room) {
        ran = (int) ((Math.random() * 4) + 1);
        switch (ran) {
            case 1:
                eastMove = "east";
                break;
            case 2:
                westMove = "west";
                break;
            case 3:
                northMove = "north";
            case 4:
                southMove = "south";
                break;
            default:
                break;
                
        }
        kill();
    }

    public void movement() {

    }

    public void monster_Start() {
        game.deadEnd('+');
        
    }
    
    public void kill() {        
        game.player.health("Monster");
    }

    public void hound() {

        if (!hound) {
            int ran = (int) (3 * Math.random()) + 1;
            System.out.println(ran);
            if (ran == 3) {
                System.out.println("The hound wakes up and jumps to attack you, it's teeth sinks into your arm and you lose 15 health");
                System.out.println("The hound loses interest and leaves you alone");
                health = game.player.getHealth();
                game.player.setHealth(health -= 15);
                System.out.println("Your current health is now " + health);
                game.setAreIn(true);
            }
            hound = true;
        } else if (hound) {
            System.out.println("The hound sees you immediately and once again jump to attack, you lose 15 health");
            System.out.println("The hound loses interest and leaves you alone");
            health = game.player.getHealth();
            game.player.setHealth(health -= 15);
            System.out.println("Your current health is now " + health);
        }

    }
}
