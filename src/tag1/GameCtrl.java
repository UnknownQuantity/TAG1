package tag1;

import java.io.IOException;
import java.util.Scanner;

public class GameCtrl extends RoomList {

    //******************gameCtrl-Varibles.start******************\\
    Scanner scan;
    public final Player player;
    private final RoomList list;

    public GameCtrl() {
        this.player = new Player();
        this.list = new RoomList();
        this.scan = new Scanner(System.in);
    }

    //******************gameCtrl-Varibles.end******************\\
    public void gameCtrl() throws IOException {

        System.out.println("Hello, please enter your name");
        String name = scan.next();
        player.player(name);
        list.start('+');
    }
}