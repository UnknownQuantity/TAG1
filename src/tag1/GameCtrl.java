package tag1;

import java.util.ArrayList;
import java.util.Scanner;

public class GameCtrl extends RoomList {

    //******************gameCtrl-Varibles.start******************\\
    Scanner scan;
    public final Player player;
    private final RoomList list;
 //   private final Enemy enemy;

    public GameCtrl() {
        this.player = new Player();
        this.list = new RoomList();
        makeRooms();
        this.scan = new Scanner(System.in);
 //       this.enemy = new Enemy();
    }

    //******************gameCtrl-Varibles.end******************\\
    public void gameCtrl() {       
        
        System.out.println("Hello, please enter your name");
        String name = scan.next();
        player.player(name);
  //      enemy.monster_Start();
        list.start('+');

    }

    private void makeRooms() {
        ArrayList<Room> rooms = new ArrayList();
        rooms.add(new Room("****************************************************************\\n* Welcome to our adventure game.\\n* Pay close attention to the paragraphs for movement options.\\n* The controls are 4 directional. Use the following keys:\\n* Use 'n' to move north(up).\\n* Use 'e' to move east(right).\\n* Use 's' to move south(down).\\n* Use'w' to move west(left).\\n* Use 'quit' to end the game.\\n* At any time, you can type 'help' to see the commands again\\n****************************************************************\\nYou slowly open your eyes, your head hurting and throbbing.\\nYour right eye's all sticky, and it's a struggle to keep it open.\\nEverything around you is pitch black. \\nThere's only a faint light at the far end of the room.\\nIt seems to be seeping through the gap under a large door to your North.\\nYou lift your arm, as jolt of pain shoot through it.\\nAs it's woken from its slumber you feel a stinging pain.\\nYou feel yout face, something warm and sticky covering it.\\nAs you start to regain conciousnes you start to make out the room.\\n The floors are coarse stones, with hay sprinked atop it.\\nThe air is filled with a heavy smell of musk, mixed with the smell of blood.\\nYou close your eyes again and tries to remember what happened... Where are you?\\nYou vaguely remember being on a ship... Was it attacked?\\nMust've been, as far as you recall, the weather was too clear for the ship to go down...\\nThen it dawns upon you: Minotaurs, from the island of Mithas... \\nKnown for their sacrifices to their blood God... Time to get the hell out of here... \\nBut not without filling your pockets first, you are a thief afterall."));
        rooms.add(new Room(""));
        
        rooms.get(0).setNorth(rooms.get(1));
        rooms.get(1).setNorth(rooms.get(0));
    }
}
