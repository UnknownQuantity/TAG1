package tag1;
//weird 9:05
import java.util.Scanner;

public class GameCtrl extends RoomList {

    //******************gameCtrl-Varibles.start******************\\
    Scanner scan;
    public final Player player;
    private final RoomList list;   
   //private RoomList monnStart = new RoomList();

    public GameCtrl() {
        this.player = new Player();
        this.list = new RoomList();
        this.scan = new Scanner(System.in);
        //this.monnStart.deadEnd('+');
    }

    //******************gameCtrl-Varibles.end******************\\
    public void gameCtrl() {       
        
        System.out.println("Hello, please enter your name");
        String name = scan.next();
        player.player(name);
        list.start('+');

    }
}
