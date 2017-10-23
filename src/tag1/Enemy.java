package tag1;
//WIP
public class Enemy {

    public int health;
    public boolean hound = false;
    
public void Monster() {
    System.out.println("You meet a giant monster and is instantly killed");
    
} 

public void Hound() {
    
    if (!hound) {
                int ran = (int) (3 * Math.random()) + 1;
                System.out.println(ran);
                if (ran == 3) {
                System.out.println("The hound wakes up and jumps to attack you, it's teeth sinks into your arm and you lose 15 health");
                System.out.println("The hound loses interest and leaves you alone");
                health -= 15;
                System.out.println("Your current health is now " + health);
                }
                hound = true;
            } else if (hound) {
                System.out.println("The hound sees you immediately and once again jump to attack, you lose 15 health");
                System.out.println("The hound loses interest and leaves you alone");
                health -= 15;
                System.out.println("Your current health is now " + health);
            }
}
}