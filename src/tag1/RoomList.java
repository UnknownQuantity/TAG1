package tag1;


class RoomList {
//...
private boolean north, east, south, west, loot, danger;
private String name;
public RoomList(String name,boolean north, boolean east, boolean south, boolean west, boolean loot, boolean danger){
    this.north = north;
    this.east = east;
    this.south = south;
    this.west = west;
    this.name = name;
    this.loot = loot;
    this.danger = danger;
}

    public String getName() {
        return name;
    }
    
}
