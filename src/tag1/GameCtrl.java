package tag1;

import java.io.IOException;
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
//        makeRooms();
        this.scan = new Scanner(System.in);
        //       this.enemy = new Enemy();
    }

    //******************gameCtrl-Varibles.end******************\\
    public void gameCtrl() throws IOException {

        System.out.println("Hello, please enter your name");
        String name = scan.next();
        player.player(name);
        //      enemy.monster_Start();
        list.start('+');
    }

//    private void makeRooms() {
//        
//        ArrayList<Room> rooms = new ArrayList();
//        rooms.add(new Room("****************************************************************\\n* Welcome to our adventure game.\\n* Pay close attention to the paragraphs for movement options.\\n* The controls are 4 directional. Use the following keys:\\n* Use 'n' to move north(up).\\n* Use 'e' to move east(right).\\n* Use 's' to move south(down).\\n* Use'w' to move west(left).\\n* Use 'quit' to end the game.\\n* At any time, you can type 'help' to see the commands again\\n****************************************************************\\nYou slowly open your eyes, your head hurting and throbbing.\\nYour right eye's all sticky, and it's a struggle to keep it open.\\nEverything around you is pitch black. \\nThere's only a faint light at the far end of the room.\\nIt seems to be seeping through the gap under a large door to your North.\\nYou lift your arm, as jolt of pain shoot through it.\\nAs it's woken from its slumber you feel a stinging pain.\\nYou feel yout face, something warm and sticky covering it.\\nAs you start to regain conciousnes you start to make out the room.\\n The floors are coarse stones, with hay sprinked atop it.\\nThe air is filled with a heavy smell of musk, mixed with the smell of blood.\\nYou close your eyes again and tries to remember what happened... Where are you?\\nYou vaguely remember being on a ship... Was it attacked?\\nMust've been, as far as you recall, the weather was too clear for the ship to go down...\\nThen it dawns upon you: Minotaurs, from the island of Mithas... \\nKnown for their sacrifices to their blood God... Time to get the hell out of here... \\nBut not without filling your pockets first, you are a thief afterall."));
//        rooms.add(new Room("You enter a torchlit room\nThe room itself is bare, all it contains is doors in every direction."));
//        rooms.add(new Room("You step into the room and immidiately fall down.\nImpaled on wooden stakes, your adventure ends, choking on your own blood."));
//        rooms.add(new Room("You enter what appears to be a storage room.\nTo the north there is smaller door, to your south, a big wooden door. \n The room itself contains a mix of all sorts of things\nLarge wooden crates, giant pots, shelfs filled with small chests and and crates\n... But no weapons...\n"));
//        rooms.add(new Room("You find yourself in a passage surrounded by doors\nNow where haven't you been..."));
//        rooms.add(new Room("You walk straight into a red curtain, and before you know it, stand in the middle of a bedroom\nTo the west there is a small entrance covered by yet a red curtain.\nTo the east, a large door covered by a curtain\nThe bed itself is giant. Definately minotaur sized."));
//        rooms.add(new Room("You find yourself in a bathroom.\nThere is a horrible smell... Yuck.. Someone didn't flush.\nTo the east is the unflushed toilet\nTo the west is the red curtain bathroom entrance."));
//        rooms.add(new Room("First thing you notice is heavy breathing... Infront of you, you see a giant dog.\nSecond thing you notice is that the room has no other exits than where you cam from."));
//        rooms.add(new Room("You walk down a long corridor, barely able to see the door at the other end\nThe musky smell is perculiarly strong here...But there is something else too...\nTo your east is a door, and so is there to your west."));
//        rooms.add(new Room("You find youself in a passage surrounded by doors\nTo the east, a large wooden door\nTo the south, a red curtain covering a doorway, with a foul stench emitting from it\nTo the north a large wooden door, with thick white smoke at its base.\nTo the east, a large wooden door."));
//        rooms.add(new Room("You are in a bathroom. It smells like minotaur buttocks in here.\nIt's a dead end."));
//        rooms.add(new Room("You step into a laboratory, weird vials everywhere filled with colourful fluids\nThe walls stuffed with cannisters containing unspeakable things inside."));
//        rooms.add(new Room("You enter what seems to be an oversized kitchen, overflowing with pots and pans\nThere's doors on every wall but on the southern, as there is a giant overflowing bin there."));
//        rooms.add(new Room("The pantry. Where there is supposed to be food, but alas, here is nothing but dust."));
//        rooms.add(new Room("You enter the corridor, having to get on your knees to get through it\nThe sharp floor cutting and tearing your pants and knees apart, blood guzzing everywhere.\nTo the north you can see the outline of a poorly hidden stone door, to the south, the pantry."));
//        rooms.add(new Room("Gold. Gold everywhere.\nYou are in a tiny little room, with gold coins from floor to ceiling.\nNever have you seen this much gold, in your entire life of thievery.\nTime to fill the pockets.\nShame it's not connecting anywhere new."));
//        rooms.add(new Room("The dining hall.\nThere is no doubt.\nLong table after long table with benches as far as the eye can see, the ceiling so far up, the torches on the walls can only dream of ever reaching so high.\nStanding in the middle of the magnificent hall, you can barely see the two entrances.\nOne to the south, one to the north."));
//        rooms.add(new Room("You're in a small corridor with a hard bend.\nOne way leading south, the other east."));
//        rooms.add(new Room("Suddenly you find yourself outside in the courtyard\nIt's pitch black out, and the only light comes from the clear moon.\nTo the east there is a giant wooden double-door.\nTo the west a slightly smaller double door.\nAnd to the north, stairs leading up the wall."));
//        rooms.add(new Room("You step into a giant hall.\nClearly this is where actual guests are greeted, before moved deeper into the gigantic complex of wiggling corridors and passages.\nTo the west, a giant set of wooden double-doors\nTo the east a single black door\nTo the south, a heavily armored door with steelplates all over it."));
//        rooms.add(new Room("You find yourself in the guardroom.\nA dozen bullheads turn towards you the second you step in.\nThen they get up..."));
//        
//        rooms.get(0).setNorth(rooms.get(1)); 
//        
//        rooms.get(1).setSouth(rooms.get(0));
//        rooms.get(1).setEast(rooms.get(2));
//        rooms.get(1).setWest(rooms.get(8));
//        rooms.get(1).setNorth(rooms.get(3));
//        
//        rooms.get(3).setSouth(rooms.get(1));
//        rooms.get(3).setNorth(rooms.get(4));
//        
//        rooms.get(4).setSouth(rooms.get(3));
//        rooms.get(4).setEast(rooms.get(5));
//        rooms.get(4).setWest(rooms.get(19));
//        rooms.get(4).setNorth(rooms.get(7));
//        
//        rooms.get(5).setEast(rooms.get(6));
//        rooms.get(5).setWest(rooms.get(4));  
//        
//        rooms.get(6).setEast(rooms.get(22));
//        rooms.get(6).setWest(rooms.get(5));  
//        
//        rooms.get(7).setSouth(rooms.get(4));
//        
//        rooms.get(8).setEast(rooms.get(1));
//        rooms.get(8).setWest(rooms.get(9));
//        
//        rooms.get(9).setSouth(rooms.get(10));
//        rooms.get(9).setEast(rooms.get(8));
//        rooms.get(9).setWest(rooms.get(12));
//        rooms.get(9).setNorth(rooms.get(11));
//        
//        rooms.get(10).setNorth(rooms.get(9)); 
//        
//        rooms.get(11).setSouth(rooms.get(9)); 
//        
//        rooms.get(12).setEast(rooms.get(9));
//        rooms.get(12).setWest(rooms.get(13));
//        rooms.get(12).setNorth(rooms.get(16));   
//        
//        rooms.get(13).setEast(rooms.get(12));
//        rooms.get(13).setNorth(rooms.get(14));   
//        
//        rooms.get(14).setSouth(rooms.get(13));
//        rooms.get(14).setNorth(rooms.get(15)); 
//        
//        rooms.get(15).setSouth(rooms.get(14)); 
//        
//        rooms.get(16).setSouth(rooms.get(12));
//        rooms.get(16).setNorth(rooms.get(17));   
//        
//        rooms.get(17).setSouth(rooms.get(16));
//        rooms.get(17).setEast(rooms.get(18));  
//        
//        rooms.get(18).setEast(rooms.get(19));
//        rooms.get(18).setWest(rooms.get(17));
//        rooms.get(18).setNorth(rooms.get(21)); 
//        
//        rooms.get(19).setSouth(rooms.get(20));
//        rooms.get(19).setEast(rooms.get(4));
//        rooms.get(19).setWest(rooms.get(18));  
//        
//        rooms.get(20).setNorth(rooms.get(19));
//    }
}

//0 = start
//1 = passage
//2 = death
//3 = storage1
//4 = passage3
//5 = bedroom
//6 = loo2
//7 = deadEnd
//8 = corridor
//9 = passage2
//10 = loo
//11 = laboratory
//12 = kitchen
//13 = pantry
//14 = hiddenCorridor
//15 = roomOfRiches
//16 = diningHall
//17 = corridor2
//18 = courtyard
//19 = hall
//20 = guardroom
//21 = freiheit
//22 = freiheit2
