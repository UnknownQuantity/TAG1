package tag1;

public class Room {

    private String desc;
    private boolean visited, looted = false;
    private Room north, south, east, west;

    public Room(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public Room getNorth() {
        return north;
    }

    public void setNorth(Room north) {
        this.north = north;
    }

    public Room getSouth() {
        return south;
    }

    public void setSouth(Room south) {
        this.south = south;
    }

    public Room getEast() {
        return east;
    }

    public void setEast(Room east) {
        this.east = east;
    }

    public Room getWest() {
        return west;
    }

    public void setWest(Room west) {
        this.west = west;
    }

//    public void enterRoom(Player p){
//        if(north == null)
//            if((south == null))
//    }
}
