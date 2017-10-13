package tag1;

import java.util.*;

public class Rooms {

    //******************Rooms-Variables.start******************\\
    boolean[] roomVisited = new boolean[20]; //Tracks wether or not you have been in a room (boolean true false)
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

        descList.add("start"); //0
        descList.add("Pass"); //1
        descList.add("Dead"); //2
        descList.add("storage1"); //3
        descList.add("pass3"); //4
        descList.add("bedr"); //5
        descList.add("loo2"); //6
        descList.add("deade"); //7
        descList.add("corr"); //8
        descList.add("pass2"); //9
        descList.add("loo"); //10
        descList.add("labra"); //11
        descList.add("kitc"); //12
        descList.add("pant"); //13
        descList.add("hidd"); //14
        descList.add("roomof"); //15
        descList.add("dining"); //16
        descList.add("corr2"); //17
        descList.add("court"); //18
        descList.add("hall"); //19
        descList.add("guard"); //20      

        return descList.get(spot);
    }

    //******************Rooms-Methods.end******************\\
}
