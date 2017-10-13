package tag1;

import java.util.*;

public class Rooms {

    boolean[] roomVisited = new boolean[20]; //Tracks wether or not you have been in a room (boolean true false)
    boolean roomStorage1, roomBedroomm, roomLoom, roomLabratory, roomKitchen, roomRoomOfRiches = false; //Tracks the interactions in the room, if interaction is onetime use, set boolean true
    ArrayList<RoomList> room = new ArrayList<>();
    ArrayList rooms = new ArrayList();

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

    public String description() {
        String name = room.get(0).getName();
        switch (name) {
            case "Start":
                System.out.println("Insert start description in here :)");
                break;
            case "Passage":
                System.out.println("Insert Passage description in here :)");
                break;
            case "Death":
                System.out.println("Insert death description in here :)");
                break;
            case "Storage1":
                System.out.println("Insert Storage1 description in here :)");
                break;
            case "Passage3":
                System.out.println("Insert Passage3 description in here :)");
                break;
            case "Bedroom":
                System.out.println("Insert bedroom description in here :)");
                break;
            case "Loo2":
                System.out.println("Insert loo2 description in here :)");
                break;
            case "DeadEnd":
                System.out.println("Insert deadend description in here :)");
                break;
            case "Corridor":
                System.out.println("Insert Corridor description in here :)");
                break;
            case "Passage2":
                System.out.println("Insert passage2 description in here :)");
                break;
            case "Loo":
                System.out.println("Insert Loo description in here :)");
                break;
            case "Labratory":
                System.out.println("Insert labratory description here");
                break;
            case "Kitchen":
                System.out.println("Insert Kitchen description in here :)");
                break;
            case "Pantry":
                System.out.println("Insert Pantry description in here :)");
                break;
            case "HiddenCorridor":
                System.out.println("Insert HiddenCorridor description in here :)");
                break;
            case "RoomOfRiches":
                System.out.println("Insert Roomofriches description in here :)");
                break;
            case "DiningHall":
                System.out.println("Insert DiningHall description in here :)");
                break;
            case "Corridor2":
                System.out.println("Insert Corridor2 description in here :)");
                break;
            case "CourtYard":
                System.out.println("Insert CourtYard description in here :)");
                break;
            case "Hall":
                System.out.println("Insert Hall description in here :)");
                break;
            case "GuardRoom":
                System.out.println("Insert guardroom description in here :)");
                break;
            case "Freiheit":
                System.out.println("Insert Freiheit description in here :)");
                break;
            case "Freiheit2":
                System.out.println("Insert FreiHeit2 description in here :)");
                break;
        }

        return name;
    }

}
