package tag1;

class RoomList {

private final boolean north, east, south, west, loot, danger;
private final String name;

public RoomList(String name, boolean north, boolean east, boolean south, boolean west, boolean loot, boolean danger){
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

    public boolean isLoot() {
        return loot;
    }

    public boolean isDanger() {
        return danger;
    }

    public boolean isNorth() {
        return north;
    }

    public boolean isEast() {
        return east;
    }

    public boolean isSouth() {
        return south;
    }

    public boolean isWest() {
        return west;
    }
    
}
