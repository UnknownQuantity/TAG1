package tag1;
//WIP
public class Enemy extends RoomList{
    
    private int health; 
    private boolean hound = false;
    
public void monster() {
    System.out.println("You meet a giant monster and is instantly killed");
    health = player.getHealth();
    player.setHealth(health = 0);
} 

public void hound() {
    
    if (!hound) {
                int ran = (int) (3 * Math.random()) + 1;
                System.out.println(ran);
                if (ran == 3) {
                System.out.println("The hound wakes up and jumps to attack you, it's teeth sinks into your arm and you lose 15 health");
                System.out.println("The hound loses interest and leaves you alone");
                health = player.getHealth();
                player.setHealth(health -=15);
                System.out.println("Your current health is now " + health);
                setAreIn(true);
                }
                hound = true;
            } else if (hound) {
                System.out.println("The hound sees you immediately and once again jump to attack, you lose 15 health");
                System.out.println("The hound loses interest and leaves you alone");
                health = player.getHealth();
                player.setHealth(health -=15);
                System.out.println("Your current health is now " + health);
            }
}
}