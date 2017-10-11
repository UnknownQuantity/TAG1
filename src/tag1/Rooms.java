package tag1;

import java.util.*;

public class Rooms {
    
boolean roomVisited = false; //Tracks wether or not you have been in a room (boolean true false)
boolean roomInteraction = false; //Tracks the interactions in the room, if interaction is onetime use, set boolean true
    

ArrayList rooms = new ArrayList();


public void Rooms(){
    ArrayList<RoomList> room = new ArrayList <>();
    //north, east, south, west
    room.add(new RoomList(Start(),true, false, false, false));
    room.add(new RoomList("Passage",true, true, true, true));
    room.add(new RoomList("Death1",false, false, false, false));
    room.add(new RoomList("Storage1",true, false, true, false));
    room.add(new RoomList("Passage3",true, true, true, true));
    room.add(new RoomList("Bedroom",false, true, false, true));
    room.add(new RoomList("Loo2",false, true, false, true));
    room.add(new RoomList("DeadEnd",false, false, true, false));
    room.add(new RoomList("Corridor",false, true, false, true));
    room.add(new RoomList("Passage2",true, true, true, true));
    room.add(new RoomList("Loo",true, false, false, false));
    room.add(new RoomList("Labratory",false, false, true, false));
    room.add(new RoomList("Kitchen",true, true, false, true));
    room.add(new RoomList("Pantry",true, true, false, false));
    room.add(new RoomList("HiddenCorridor",true, false, true, false));
    room.add(new RoomList("RoomOfRiches",false, false, true, false));
    room.add(new RoomList("DiningHall",true, false, true, false));
    room.add(new RoomList("Corridor2",false, true, true, false));
    room.add(new RoomList("CourtYard",true, true, false, true));
    room.add(new RoomList("Hall",false, true, true, true));
    room.add(new RoomList("GuardRoom",true, false, false, false));
    room.add(new RoomList("Freiheit",false, false, false, false));
    room.add(new RoomList("Freiheit2",false, false, false, false));
    
    
} 

public String Start(){
    String desc = "";
    
    
    
    return desc;
}


}







