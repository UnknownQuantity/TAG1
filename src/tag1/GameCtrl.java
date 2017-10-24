package tag1;

import java.util.Scanner;

public class GameCtrl {

    //******************gameCtrl-Varibles.start******************\\
    private final Scanner sc = new Scanner(System.in);
    Player player = new Player();
    RoomList list = new RoomList();    

    //******************gameCtrl-Varibles.end******************\\
    
       public void gameCtrl() {
        
        System.out.println("Hello, please enter your name");
        String name = sc.next();  
        player.player(name);        
        list.start('+');

    }
}