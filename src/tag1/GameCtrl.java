package tag1;

import java.util.Scanner;

public class GameCtrl extends RoomList {

    //******************gameCtrl-Varibles.start******************\\
    Scanner scan;
    public final Player player;
    private final RoomList list;
    private final Enemy evil;    
   //private RoomList monnStart = new RoomList();

    public GameCtrl() {
        this.player = new Player();
        this.list = new RoomList();
        this.scan = new Scanner(System.in);
        this.evil = new Enemy();
        //this.monnStart.deadEnd('+');
    }

    //******************gameCtrl-Varibles.end******************\\
    public void gameCtrl() {       
        
        System.out.println("Hello, please enter your name");
        String name = scan.next();
        player.player(name);
        evil.monster_Start();
        list.start('+');

    }
}
