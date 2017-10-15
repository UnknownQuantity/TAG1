package tag1;

import java.util.*;

public class Rooms {

    //******************Rooms-Variables.start******************\\
    boolean[] roomVisited = new boolean[21]; //Tracks wether or not you have been in a room (boolean true false)
    boolean roomStorage1, roomBedroomm, roomLoom, roomLabratory, roomKitchen, roomRoomOfRiches = false; //Tracks the interactions in the room, if interaction is onetime use, set boolean true
    ArrayList<RoomList> room = new ArrayList<>();

    //******************Rooms-Variables.end******************\\
    //******************Rooms-Methods.start******************\\
    public void Rooms() {
        //north, east, south, west, loot, danger...
        room.add(new RoomList("Start", true, false, false, false, false, false)); //0
        room.add(new RoomList("Passage", true, true, true, true, false, false)); //1
        room.add(new RoomList("Death", false, false, false, false, false, true)); //2
        room.add(new RoomList("Storage1", true, false, true, false, true, false)); //3
        room.add(new RoomList("Passage3", true, true, true, true, false, false)); //4
        room.add(new RoomList("Bedroom", false, true, false, true, true, false)); //5
        room.add(new RoomList("Loo2", false, true, false, true, false, true)); //6
        room.add(new RoomList("DeadEnd", false, false, true, false, false, false)); //7
        room.add(new RoomList("Corridor", false, true, false, true, false, false)); //8
        room.add(new RoomList("Passage2", true, true, true, true, false, false)); //9
        room.add(new RoomList("Loo", true, false, false, false, true, false)); //10
        room.add(new RoomList("Labratory", false, false, true, false, true, true)); //11
        room.add(new RoomList("Kitchen", true, true, false, true, true, true)); //12
        room.add(new RoomList("Pantry", true, true, false, false, false, false)); //13
        room.add(new RoomList("HiddenCorridor", true, false, true, false, false, true)); //14 - mathrandom 1 ud af 10 for at tage skade
        room.add(new RoomList("RoomOfRiches", false, false, true, false, true, false)); //15
        room.add(new RoomList("DiningHall", true, false, true, false, false, true)); //16 - If search room, danger activate
        room.add(new RoomList("Corridor2", false, true, true, false, false, false)); //17
        room.add(new RoomList("CourtYard", true, true, false, true, false, false)); //18
        room.add(new RoomList("Hall", false, true, true, true, false, true)); //19 - mathrandom i to 50 for a guard to walk out and beat ya
        room.add(new RoomList("GuardRoom", true, false, false, false, false, true)); //20
        room.add(new RoomList("Freiheit", false, false, false, false, false, false)); //21
        room.add(new RoomList("Freiheit2", false, false, false, false, false, false)); //22

    }

    public String description(int spot) {

        ArrayList<String> descList = new ArrayList<>();
        //0, start with introduction and how to
        descList.add("****************************************************************\n* Welcome to our adventure game.\n* Pay close attention to the paragraphs for movement options.\n* The controls are 4 directional. Use the following keys:\n* Use 'n' to move north(up).\n* Use 'e' to move east(right).\n* Use 's' to move south(down).\n* Use'w' to move west(left).\n* Use 'quit' to end the game.\n* At any time, you can type 'help' to see the commands again\n****************************************************************\nYou slowly open your eyes, your head hurting and throbbing.\nYour right eye's all sticky, and it's a struggle to keep it open.\nEverything around you is pitch black. \nThere's only a faint light at the far end of the room.\nIt seems to be seeping through the gap under a large door to your North.\nYou lift your arm, as jolt of pain shoot through it.\nAs it's woken from its slumber you feel a stinging pain.\nYou feel yout face, something warm and sticky covering it.\nAs you start to regain conciousnes you start to make out the room.\n The floors are coarse stones, with hay sprinked atop it.\nThe air is filled with a heavy smell of musk, mixed with the smell of blood.\nYou close your eyes again and tries to remember what happened... Where are you?\nYou vaguely remember being on a ship... Was it attacked?\nMust've been, as far as you recall, the weather was too clear for the ship to go down...\nThen it dawns upon you: Minotaurs, from the island of Mithas... \nKnown for their sacrifices to their blood God... Time to get the hell out of here... \nBut not without filling your pockets first, you are a thief afterall."); //0
        //1 Passage
        descList.add("You enter a torchlit room\nThe room itself is bare, all it contains is doors in every direction."); //1
        //2 deathroom. You die. :c
        descList.add("You step into the room and immidiately fall down.\nImpaled on wooden stakes, your adventure ends, choking on your own blood."); //2
        //3 Storage1
        descList.add("You enter what appears to be a storage room.\nTo the north there is smaller door, to your south, a big wooden door. \n The room itself contains a mix of all sorts of things\nLarge wooden crates, giant pots, shelfs filled with small chests and and crates\n... But no weapons...\n"); //3
        //4 Passage3
        descList.add("You find yourself in a passage surrounded by doors\nNow where haven't you been..."); //4
        //5 Bedroom. Oulalalaa~~
        descList.add("You walk straight into a red curtain, and before you know it, stand in the middle of a bedroom\nTo the west there is a small entrance covered by yet a red curtain.\nTo the east, a large door covered by a curtain\nThe bed itself is giant. Definately minotaur sized."); //5
        //6 Loo2. Freiheit macht frei... If you gross enough. 
        descList.add("You find yourself in a bathroom.\nThere is a horrible smell... Yuck.. Someone didn't flush.\nTo the east is the unflushed toilet\nTo the west is the red curtain bathroom entrance."); //6
        //7 DeadEnd, beware of doggo
        descList.add("First thing you notice is heavy breathing... Infront of you, you see a giant dog.\nSecond thing you notice is that the room has no other exits than where you cam from."); //7
        //8 Corridor.
        descList.add("You walk down a long corridor, barely able to see the door at the other end\nThe musky smell is perculiarly strong here...But there is something else too...\nTo your east is a door, and so is there to your west."); //8
        //9 Passage2
        descList.add("You find youself in a passage surrounded by doors\nTo the east, a large wooden door\nTo the south, a red curtain covering a doorway, with a foul stench emitting from it\nTo the north a large wooden door, with thick white smoke at its base.\nTo the east, a large wooden door."); //9
        //10 Loo. Yuck.
        descList.add("You are in a bathroom. It smells like minotaur buttocks in here.\nIt's a dead end."); //10
        //11 Labratory. Yes. I misspelled it... Also, watch for inflamables.
        descList.add("You step into a laboratory, weird vials everywhere filled with colourful fluids\nThe walls stuffed with cannisters containing unspeakable things inside."); //11
        //12 Kitchen. Don't eat the food.
        descList.add("You enter what seems to be an oversized kitchen, overflowing with pots and pans\nThere's doors on every wall but on the southern, as there is a giant overflowing bin there."); //12
        //13 Pantry. Might wanna search this place.
        descList.add("The pantry. Where there is supposed to be food, but alas, here is nothing but dust."); //13
        //14 HiddenCorridor. Beware of traps.
        descList.add("You enter the corridor, having to get on your knees to get through it\nThe sharp floor cutting and tearing your pants and knees apart, blood guzzing everywhere.\nTo the north you can see the outline of a poorly hidden stone door, to the south, the pantry."); //14
        //15 RoomOfR(B)iches Gold. Gold everywhere! \o/
        descList.add("Gold. Gold everywhere.\nYou are in a tiny little room, with gold coins from floor to ceiling.\nNever have you seen this much gold, in your entire life of thievery.\nTime to fill the pockets.\nShame it's not connecting anywhere new."); //15
        //16 Dininghall
        descList.add("The dining hall.\nThere is no doubt.\nLong table after long table with benches as far as the eye can see, the ceiling so far up, the torches on the walls can only dream of ever reaching so high.\nStanding in the middle of the magnificent hall, you can barely see the two entrances.\nOne to the south, one to the north."); //16
        //17 Corridor2
        descList.add("You're in a small corridor with a hard bend.\nOne way leading south, the other east."); //17
        //18 Courtyard Freiheit macht frei!
        descList.add("Suddenly you find yourself outside in the courtyard\nIt's pitch black out, and the only light comes from the clear moon.\nTo the east there is a giant wooden double-door.\nTo the west a slightly smaller double door.\nAnd to the north, stairs leading up the wall."); //18
        //19 Hall
        descList.add("You step into a giant hall.\nClearly this is where actual guests are greeted, before moved deeper into the gigantic complex of wiggling corridors and passages.\nTo the west, a giant set of wooden double-doors\nTo the east a single black door\nTo the south, a heavily armored door with steelplates all over it."); //19
        //20 Beware of SS. They steal jewgold.
        descList.add("You find yourself in the guardroom.\nA dozen bullheads turn towards you the second you step in.\nThen they get up..."); //20      

        return descList.get(spot);
    }

    //******************Rooms-Methods.end******************\\
}
