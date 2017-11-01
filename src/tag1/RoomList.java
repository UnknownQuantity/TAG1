package tag1;

import java.io.IOException;
import java.util.ArrayList;

class RoomList extends TAG1 {

    Utility util = new Utility();
    Rooms room;
    Items item;
    Combat com;
    public final Enemy evil;
    private final boolean hound = false;
    private boolean areIn = false;
    private String search;
    private String rerun = "";
    private final String desc = "";
    private final String[] args = {};
    ArrayList<RoomList> rooms;

    public RoomList() {
        this.rooms = new ArrayList<>();
        this.room = new Rooms();
        this.item = new Items();
        this.evil = new Enemy();
        this.com = new Combat();
    }

    //******************Room-methods.start******************\\
    public void start(char es) throws IOException {

        System.out.println("\u001B[31mStart");
        if (es == '+' && room.roomVisited[0] == false) {
            room.setDesc(room.Description(0));
            System.out.println(room.getDesc());
            room.roomVisited[0] = true;
            //       evil.monster_Start();
        }
        String dir;
        System.out.println("What do you want to do?");
        dir = game.scan.next().toLowerCase();
        switch (dir) {
            case "n":
                passage('+');
                break;
            case "h":
                util.help();
                start('-');
                break;
            case "q":
                util.quit();
                break;
            case "i":
                util.currentInventory();
                start('-');
                break;
            case "st":
                util.stats();
                start('-');
                break;
            case "eq":
                game.player.weaponEquip();
                start('-');
                break;
            case "wo":
                util.worn();
                start('-');
                break;
            default:
                System.out.println("Invalid answer!");
                start('-');
                break;

        }
    } //0

    public void passage(char es) throws IOException {

        System.out.println("\u001B[31mPassage");
        if (es == '+' && room.roomVisited[1] == false) {
            System.out.println(room.Description(1));
            room.roomVisited[1] = true;
        }
        if (room.roomPassage == false) {
            System.out.println("wanna search the room? y/n");
            search = game.scan.next().toLowerCase();
            if (search.equals("y")) {
                System.out.println("You search the room but nothing special gets your attention");
                room.roomPassage = true;
            } else if (!"n".equals(search) && !"y".equals(search)) {
                System.out.println("Invalid Answer!");
                passage('-');
            }
        }
        String dir;
        System.out.println("What do you want to do?");
        dir = game.scan.next().toLowerCase();
        switch (dir) {
            case "n":
                storage1('+');
                break;
            case "s":
                start('+');
                break;
            case "w":
                corridor('+');
                break;
            case "e":
                death('+');
                break;
            case "q":
                util.quit();
                break;
            case "h":
                util.help();
                passage('-');
                break;
            case "i":
                util.currentInventory();
                passage('-');
                break;
            case "st":
                util.stats();
                passage('-');
                break;
            case "eq":
                game.player.weaponEquip();
                passage('-');
                break;
            case "wo":
                util.worn();
                passage('-');
                break;
            default:
                System.out.println("Invalid answer!");
                passage('-');
                break;
        }
    } //1

    public void death(char es) throws IOException {

        System.out.println("\u001B[31mDeath");
        if (es == '+' && room.roomVisited[2] == false) {
            System.out.println(room.Description(2));
            room.roomVisited[2] = true;
            game.player.health("Death");
        }
        System.out.println("Do you want to try again? y/n");  //respawn
        rerun = game.scan.next();
        if ("y".equals(rerun)) {
            TAG1.main(args);
        } else if ("n".equals(rerun)) {
            util.gameEnd();
        } else {
            death('-');
        }

    } //2

    public void storage1(char es) throws IOException {

        System.out.println("\u001B[31mStorage1");
        if (es == '+' && room.roomVisited[3] == false) {
            room.roomVisited[3] = true;
            System.out.println(room.Description(3));
        }
        String dir;
        if (room.roomStorage1 == false) {
            System.out.println("wanna search the room? y/n");
            search = game.scan.next().toLowerCase();
            if (search.equals("y")) {
                int pick = item.coins();
                if (pick == 1) {
                    System.out.println("You now have: " + game.player.getGold() + " Gold");
                    room.roomStorage1 = true;
                }
            } else if (!"n".equals(search) && !"y".equals(search)) {
                System.out.println("Invalid Answer!");
                storage1('-');
            }
        }
        System.out.println("What do you want to do?");
        dir = game.scan.next().toLowerCase();
        switch (dir) {
            case "n":
                passage3('+');
                break;
            case "s":
                passage('+');
                break;
            case "q":
                util.quit();
                break;
            case "h":
                util.help();
                storage1('-');
                break;
            case "i":
                util.currentInventory();
                storage1('-');
                break;
            case "st":
                util.stats();
                storage1('-');
                break;
            case "eq":
                game.player.weaponEquip();
                storage1('-');
                break;
            case "wo":
                util.worn();
                storage1('-');
                break;
            default:
                System.out.println("Invalid answer!");
                storage1('-');
                break;
        }
    } //3

    public void passage3(char es) throws IOException {

        System.out.println("\u001B[31mPassage3");
        if (es == '+' && room.roomVisited[4] == false) {
            System.out.println(room.Description(4));
            room.roomVisited[4] = true;
        }
        if (room.roomPassage3 == false) {
            System.out.println("wanna search the room? y/n");
            search = game.scan.next().toLowerCase();
            if (search.equals("y")) {
                System.out.println("You search the room but nothing special gets your attention");
                room.roomPassage3 = true;
            } else if (!"n".equals(search) && !"y".equals(search)) {
                System.out.println("Invalid Answer!");
                passage3('-');
            }
        }
        String dir;
        System.out.println("What do you want to do?");
        dir = game.scan.next().toLowerCase();
        switch (dir) {
            case "n":
                deadEnd('+');
                break;
            case "s":
                storage1('+');
                break;
            case "e":
                bedroom('+');
                break;
            case "w":
                hall('+');
                break;
            case "q":
                util.quit();
                break;
            case "h":
                util.help();
                passage3('-');
                break;
            case "i":
                util.currentInventory();
                passage3('-');
                break;
            case "st":
                util.stats();
                passage3('-');
                break;
            default:
                System.out.println("Invalid answer!");
                passage3('-');
                break;
        }
    } //4

    public void bedroom(char es) throws IOException {

        int derp = 0;
        System.out.println("\u001B[31mBedroom");
        if (es == '+' && room.roomVisited[5] == false) {
            System.out.println(room.Description(5));
            room.roomVisited[5] = true;
        }
        if (room.roomBedroom == false) {
            System.out.println("wanna search the room? y/n");
            search = game.scan.next().toLowerCase();
            if (search.equals("y")) {
                int pick = item.coin();
                if (pick == 1) {
                    System.out.println("You now have: " + game.player.getGold() + " Gold");
                    room.roomBedroom = true;
                } else if (!"n".equals(search) && !"y".equals(search)) {
                    System.out.println("Invalid Answer!");
                    storage1('-');
                }
            }
        }
        String dir;
        System.out.println("What do you want to do?");
        dir = game.scan.next().toLowerCase();
        switch (dir) {
            case "e":
                loo2('+');
                break;
            case "w":
                passage3('+');
                break;
            case "q":
                util.quit();
            case "h":
                util.help();
                bedroom('-');
                break;
            case "i":
                util.currentInventory();
                bedroom('-');
                break;
            case "st":
                util.stats();
                bedroom('-');
                break;
            case "eq":
                game.player.weaponEquip();
                bedroom('-');
                break;
            case "wo":
                util.worn();
                bedroom('-');
                break;
            default:
                System.out.println("Invalid answer!");
                bedroom('-');
                break;
        }
    } //5

    public void loo2(char es) throws IOException {

        System.out.println("\u001B[31mLoo2");
        if (es == '+' && room.roomVisited[6] == false) {
            System.out.println(room.Description(6));
            room.roomVisited[6] = true;
            com.mightyCombat();
            game.evil.loot();
        }
        if (room.roomLoo2 == false) {
            System.out.println("wanna search the room? y/n");
            search = game.scan.next().toLowerCase();
            if (search.equals("y")) {
                System.out.println("You search the room but nothing special gets your attention");
                room.roomLoo2 = true;
            } else if (!"n".equals(search) && !"y".equals(search)) {
                System.out.println("Invalid Answer!");
                loo2('-');
            }
        }
        String dir;
        System.out.println("What do you want to do?");
        dir = game.scan.next().toLowerCase();
        switch (dir) {
            case "e":
                freiheit2('+');
                break;
            case "w":
                bedroom('+');
                break;
            case "q":
                util.quit();
                break;
            case "h":
                util.help();
                loo2('-');
                break;
            case "i":
                util.currentInventory();
                loo2('-');
                break;
            case "st":
                util.stats();
                loo2('-');
                break;
            case "eq":
                game.player.weaponEquip();
                loo2('-');
                break;
            case "wo":
                util.worn();
                loo2('-');
                break;
            default:
                System.out.println("Invalid answer!");
                loo2('-');
                break;
        }
    } //6

    public void deadEnd(char es) throws IOException {

        System.out.println("\u001B[31mDeadEnd");
        if (es == '+' && room.roomVisited[7] == false) {
            System.out.println(room.Description(7));
            room.roomVisited[7] = true;
        }
        if (areIn == false) { //kig på senere
            evil.hound();
        }
        if (room.roomDeadEnd == false) {
            System.out.println("wanna search the room? y/n");
            search = game.scan.next().toLowerCase();
            if (search.equals("y")) {
                System.out.println("You search the room but nothing special gets your attention");
                room.roomDeadEnd = true;
            } else if (!"n".equals(search) && !"y".equals(search)) {
                System.out.println("Invalid Answer!");
                deadEnd('-');
            }
        }
        String dir;
        System.out.println("What do you want to do?");
        dir = game.scan.next().toLowerCase();
        switch (dir) {
            case "s":
                areIn = false;
                passage3('+');
                break;
            case "q":
                util.quit();
                break;
            case "h":
                util.help();
                deadEnd('-');
                break;
            case "i":
                util.currentInventory();
                deadEnd('-');
                break;
            case "st":
                util.stats();
                deadEnd('-');
                break;
            case "eq":
                game.player.weaponEquip();
                deadEnd('-');
                break;
            case "wo":
                util.worn();
                deadEnd('-');
                break;
            default:
                System.out.println("Invalid answer!");
                areIn = true;
                deadEnd('-');
                break;
        }
    } //7

    public void corridor(char es) throws IOException {

        System.out.println("\u001B[31mCorridor");
        if (es == '+' && room.roomVisited[8] == false) {
            room.roomVisited[8] = true;
            System.out.println(room.Description(8));
        }
        if (room.roomCorridor == false) {
            System.out.println("wanna search the room? y/n");
            search = game.scan.next().toLowerCase();
            if (search.equals("y")) {
                int pick = item.minor_Potion();
                if (pick == 1) {
                    room.roomCorridor = true;
                } else if (!"n".equals(search) && !"y".equals(search)) {
                    System.out.println("Invalid Answer!");
                    corridor('-');
                }
            }
        }
        String dir;
        System.out.println("What do you want to do?");
        dir = game.scan.next().toLowerCase();
        switch (dir) {
            case "w":
                passage2('+');
                break;
            case "e":
                passage('+');
                break;
            case "q":
                util.quit();
                break;
            case "h":
                util.help();
                corridor('-');
                break;
            case "i":
                util.currentInventory();
                corridor('-');
                break;
            case "st":
                util.stats();
                corridor('-');
                break;
            case "eq":
                game.player.weaponEquip();
                corridor('-');
                break;
            case "wo":
                util.worn();
                corridor('-');
                break;
            default:
                System.out.println("Invalid answer!");
                corridor('-');
                break;
        }
    } //8

    public void passage2(char es) throws IOException {

        System.out.println("\u001B[31mPassage2");
        if (es == '+' && room.roomVisited[9] == false) {
            System.out.println(room.Description(9));
            room.roomVisited[9] = true;
        }
        if (room.roomPassage2 == false) {
            System.out.println("wanna search the room? y/n");
            search = game.scan.next().toLowerCase();
            if (search.equals("y")) {
                System.out.println("You search the room but nothing special gets your attention");
                room.roomPassage2 = true;
            } else if (!"n".equals(search) && !"y".equals(search)) {
                System.out.println("Invalid Answer!");
                passage2('-');
            }
        }
        String dir;
        System.out.println("What do you want to do?");
        dir = game.scan.next().toLowerCase();
        switch (dir) {
            case "n":
                laboratory('+');
                break;
            case "s":
                loo('+');
                break;
            case "e":
                corridor('+');
                break;
            case "w":
                kitchen('+');
                break;
            case "q":
                util.quit();
                break;
            case "h":
                util.help();
                passage2('-');
                break;
            case "i":
                util.currentInventory();
                passage2('-');
                break;
            case "st":
                util.stats();
                passage2('-');
                break;
            case "eq":
                game.player.weaponEquip();
                passage2('-');
                break;
            case "wo":
                util.worn();
                passage2('-');
                break;
            default:
                System.out.println("Invalid answer!");
                passage2('-');
                break;
        }
    } //9

    public void loo(char es) throws IOException {

        System.out.println("\u001B[31mLoo");
        if (es == '+' && room.roomVisited[10] == false) {
            System.out.println(room.Description(10));
            room.roomVisited[10] = true;
        }
        if (room.roomLoo == false) {
            System.out.println("wanna search the room? y/n");
            search = game.scan.next().toLowerCase();
            if (search.equals("y")) {
                int pick = item.club();
                if (pick == 1) {
                    room.roomLoo = true;
                }
            } else if (!"n".equals(search) && !"y".equals(search)) {
                System.out.println("Invalid Answer!");
                loo('-');
            }
        }

        String dir;
        System.out.println("What do you want to do?");
        dir = game.scan.next().toLowerCase();
        switch (dir) {
            case "n":
                passage2('+');
                break;
            case "q":
                util.quit();
                break;
            case "h":
                util.help();
                loo('-');
                break;
            case "i":
                util.currentInventory();
                loo('-');
                break;
            case "st":
                util.stats();
                loo('-');
                break;
            case "eq":
                game.player.weaponEquip();
                loo('-');
                break;
            case "wo":
                util.worn();
                loo('-');
                break;
            default:
                System.out.println("Invalid answer!");
                loo('-');
                break;
        }
    }//10

    public void laboratory(char es) throws IOException {

        System.out.println("\u001B[31mLaboratory");
        if (es == '+' && room.roomVisited[11] == false) {
            System.out.println(room.Description(11));
            room.roomVisited[11] = true;
        }
        String dir;
        if (room.roomLabratory == false) {
            System.out.println("wanna search the room? y/n");
            search = game.scan.next().toLowerCase();
            if (search.equals("y")) {
                game.player.health("Explosion");
                room.roomLabratory = true;
            } else if (!"n".equals(search) && !"y".equals(search)) {
                System.out.println("Invalid Answer!");
                storage1('-');
            }
        } else {
            game.player.health("Flames");
        }
        System.out.println("What do you want to do?");
        dir = game.scan.next().toLowerCase();
        switch (dir) {
            case "s":
                passage2('+');
                break;
            case "q":
                util.quit();
                break;
            case "h":
                util.help();
                laboratory('-');
                break;
            case "i":
                util.currentInventory();
                laboratory('-');
                break;
            case "st":
                util.stats();
                laboratory('-');
                break;
            case "eq":
                game.player.weaponEquip();
                laboratory('-');
                break;
            case "wo":
                util.worn();
                laboratory('-');
                break;
            default:
                System.out.println("Invalid answer!");
                laboratory('-');
                break;
        }
    } //11

    public void kitchen(char es) throws IOException {

        System.out.println("\u001B[31mKitchen");
        if (es == '+' && room.roomVisited[12] == false) {
            System.out.println(room.Description(12));
            room.roomVisited[12] = true;
        }
        String dir;
        if (room.roomKitchen == false) {
            System.out.println("wanna search the room? y/n");
            search = game.scan.next().toLowerCase();
            if (search.equals("y")) {
                game.player.health("Rotten food");
                room.roomKitchen = true;
            } else if (!"n".equals(search) && !"y".equals(search)) {
                System.out.println("Invalid Answer!");
                kitchen('-');
            }
        }
        System.out.println("What do you want to do?");
        dir = game.scan.next().toLowerCase();
        switch (dir) {
            case "n":
                diningHall('+');
                break;
            case "e":
                passage2('+');
                break;
            case "w":
                pantry('+');
                break;
            case "q":
                util.quit();
                break;
            case "h":
                util.help();
                kitchen('-');
                break;
            case "i":
                util.currentInventory();
                kitchen('-');
                break;
            case "st":
                util.stats();
                kitchen('-');
                break;
            case "eq":
                game.player.weaponEquip();
                kitchen('-');
                break;
            case "wo":
                util.worn();
                kitchen('-');
                break;
            default:
                System.out.println("Invalid answer!");
                kitchen('-');
                break;
        }
    } //12    

    public void pantry(char es) throws IOException {

        System.out.println("\u001B[31mPantry");
        if (es == '+' && room.roomVisited[13] == false) {
            System.out.println(room.Description(13));
            room.roomVisited[13] = true;
        }
        if (room.roomPantry == false) {
            System.out.println("wanna search the room? y/n");
            search = game.scan.next().toLowerCase();
            if (search.equals("y")) {
                int pick = item.sword();
                if (pick == 1) {
                    room.roomPantry = true;
                    System.out.println("Once you pick up the sword a hidden corridor is revealed to the north!");
                }
            } else if (!"n".equals(search) && !"y".equals(search)) {
                System.out.println("Invalid Answer!");
                pantry('-');
            }
        }
        String dir;
        System.out.println("What do you want to do?");
        dir = game.scan.next().toLowerCase();
        switch (dir) {
            case "n":
                if(room.roomPantry == true)
                hiddenCorridor('+');
                else {
                    System.out.println("nothing seems to be there");
                    pantry('-');
                break; }
            case "e":
                kitchen('+');
                break;
            case "q":
                util.quit();
                break;
            case "h":
                util.help();
                pantry('-');
                break;
            case "i":
                util.currentInventory();
                pantry('-');
                break;
            case "st":
                util.stats();
                pantry('-');
                break;
            case "eq":
                game.player.weaponEquip();
                pantry('-');
                break;
            case "wo":
                util.worn();
                pantry('-');
                break;
            default:
                System.out.println("Invalid answer!");
                pantry('-');
                break;
        }

    } //13

    public void hiddenCorridor(char es) throws IOException {

        System.out.println("\u001B[31mHiddenCorridor");
        if (es == '+' && room.roomVisited[14] == false) {
            System.out.println(room.Description(14));
        }
        String dir;
        if (room.roomVisited[14] == false) {
            game.player.health("Trap");
        }

        room.roomVisited[14] = true;

        if (room.roomHiddenCorridor == false) {
            System.out.println("wanna search the room? y/n");
            search = game.scan.next().toLowerCase();
            if (search.equals("y")) {
                System.out.println("You search the room but nothing special gets your attention");
                room.roomHiddenCorridor = true;
            } else if (!"n".equals(search) && !"y".equals(search)) {
                System.out.println("Invalid Answer!");
                hiddenCorridor('-');
            }
        }
        System.out.println("What do you want to do?");
        dir = game.scan.next().toLowerCase();
        switch (dir) {
            case "n":
                roomOfRiches('+');
                break;
            case "s":
                pantry('+');
                break;
            case "q":
                util.quit();
                break;
            case "h":
                util.help();
                hiddenCorridor('-');
                break;
            case "i":
                util.currentInventory();
                hiddenCorridor('-');
                break;
            case "st":
                util.stats();
                hiddenCorridor('-');
                break;
            case "eq":
                game.player.weaponEquip();
                hiddenCorridor('-');
                break;
            case "wo":
                util.worn();
                hiddenCorridor('-');
                break;
            default:
                System.out.println("Invalid answer!");
                hiddenCorridor('-');
                break;
        }
    } //14

    public void roomOfRiches(char es) throws IOException {

        System.out.println("\u001B[31mRoomOfRiches");
        if (es == '+' && room.roomVisited[15] == false) {
            System.out.println(room.Description(15));
            room.roomVisited[15] = true;
            com.strongCombat();
            game.evil.loot();
        }

        String dir;
        item.treasure();
        System.out.println("What do you want to do?");
        dir = game.scan.next().toLowerCase();
        switch (dir) {
            case "s":
                hiddenCorridor('+');
                break;
            case "q":
                util.quit();
                break;
            case "h":
                util.help();
                roomOfRiches('-');
                break;
            case "i":
                util.currentInventory();
                roomOfRiches('-');
                break;
            case "st":
                util.stats();
                roomOfRiches('-');
                break;
            case "eq":
                game.player.weaponEquip();
                roomOfRiches('-');
                break;
            case "wo":
                util.worn();
                roomOfRiches('-');
                break;
            default:
                System.out.println("Invalid answer!");
                roomOfRiches('-');
                break;
        }

    } //15

    public void diningHall(char es) throws IOException {

        System.out.println("\u001B[31mDiningHall");
        if (es == '+' && room.roomVisited[16] == false) {
            System.out.println(room.Description(16));
            room.roomVisited[16] = true;
            com.weakCombat();
            game.evil.loot();
        }
        if (room.roomDiningHall == false) {
            System.out.println("wanna search the room? y/n");
            search = game.scan.next().toLowerCase();
            if (search.equals("y")) {
                System.out.println("You search the room but nothing special gets your attention");
                room.roomDiningHall = true;
            } else if (!"n".equals(search) && !"y".equals(search)) {
                System.out.println("Invalid Answer!");
                diningHall('-');
            }
        }

        String dir;
        System.out.println("What do you want to do?");
        dir = game.scan.next().toLowerCase();
        switch (dir) {
            case "n":
                corridor2('+');
                break;
            case "s":
                kitchen('+');
                break;
            case "q":
                util.quit();
                break;
            case "h":
                util.help();
                diningHall('-');
                break;
            case "i":
                util.currentInventory();
                diningHall('-');
                break;
            case "st":
                util.stats();
                diningHall('-');
                break;
            case "eq":
                game.player.weaponEquip();
                diningHall('-');
                break;
            case "wo":
                util.worn();
                diningHall('-');
                break;
            default:
                System.out.println("Invalid answer!");
                diningHall('-');
                break;
        }

    } //16

    public void corridor2(char es) throws IOException {

        System.out.println("\u001B[31mCorridor2");
        if (es == '+' && room.roomVisited[17] == false) {
            System.out.println(room.Description(17));
            room.roomVisited[17] = true;
        }
        if (room.roomCorridor2 == false) {
            System.out.println("wanna search the room? y/n");
            search = game.scan.next().toLowerCase();
            if (search.equals("y")) {
                int pick = item.greater_Potion();
                if (pick == 1) {
                    room.roomCorridor2 = true;
                } else if (!"n".equals(search) && !"y".equals(search)) {
                    System.out.println("Invalid Answer!");
                    corridor2('-');
                }
            }
            String dir;
            System.out.println("What do you want to do?");
            dir = game.scan.next().toLowerCase();
            switch (dir) {
                case "s":
                    diningHall('+');
                    break;
                case "e":
                    courtyard('+');
                    break;
                case "q":
                    util.quit();
                    break;
                case "h":
                    util.help();
                    corridor2('-');
                    break;
                case "i":
                    util.currentInventory();
                    corridor2('-');
                    break;
                case "st":
                    util.stats();
                    corridor2('-');
                    break;
                case "eq":
                    game.player.weaponEquip();
                    corridor2('-');
                    break;
                case "wo":
                    util.worn();
                    corridor2('-');
                    break;
                default:
                    System.out.println("Invalid answer!");
                    corridor2('-');
                    break;
            }

        }
    }//17

    public void courtyard(char es) throws IOException {

        System.out.println("\u001B[31mCourtyard");
        if (es == '+' && room.roomVisited[18] == false) {
            System.out.println(room.Description(18));
            room.roomVisited[18] = true;
            com.mightyCombat();
            game.evil.loot();
        }
        if (room.roomCourtyard == false) {
            System.out.println("wanna search the room? y/n");
            search = game.scan.next().toLowerCase();
            if (search.equals("y")) {
                System.out.println("You search the room but nothing special gets your attention");
                room.roomCourtyard = true;
            } else if (!"n".equals(search) && !"y".equals(search)) {
                System.out.println("Invalid Answer!");
                courtyard('-');
            }
        }
        String dir;
        System.out.println("What do you want to do?");
        dir = game.scan.next().toLowerCase();
        switch (dir) {
            case "n":
                freiheit('+');
                break;
            case "e":
                hall('+');
                break;
            case "w":
                corridor2('+');
                break;
            case "q":
                util.quit();
                break;
            case "h":
                util.help();
                courtyard('-');
                break;
            case "i":
                util.currentInventory();
                courtyard('-');
                break;
            case "st":
                util.stats();
                courtyard('-');
                break;
            case "eq":
                game.player.weaponEquip();
                courtyard('-');
                break;
            case "wo":
                util.worn();
                courtyard('-');
                break;
            default:
                System.out.println("Invalid answer!");
                courtyard('-');
                break;
        }
    } //18

    public void hall(char es) throws IOException {

        System.out.println("\u001B[31mHall");
        if (es == '+' && room.roomVisited[19] == false) {
            System.out.println(room.Description(19));
            room.roomVisited[19] = true;
            com.strongCombat();
            game.evil.loot();
        }
        if (room.roomHall == false) {
            System.out.println("wanna search the room? y/n");
            search = game.scan.next().toLowerCase();
            if (search.equals("y")) {
                System.out.println("You search the room but nothing special gets your attention");
                room.roomHall = true;
            } else if (!"n".equals(search) && !"y".equals(search)) {
                System.out.println("Invalid Answer!");
                hall('-');
            }
        }
        String dir;
        System.out.println("What do you want to do?");
        dir = game.scan.next().toLowerCase();
        switch (dir) {
            case "s":
                guardRoom('+');
            case "e":
                passage3('+');
            case "w":
                courtyard('+');
                break;
            case "q":
                util.quit();
                break;
            case "h":
                util.help();
                hall('-');
                break;
            case "i":
                util.currentInventory();
                hall('-');
                break;
            case "st":
                util.stats();
                hall('-');
                break;
            case "eq":
                game.player.weaponEquip();
                hall('-');
                break;
            case "wo":
                util.worn();
                hall('-');
                break;
            default:
                System.out.println("Invalid answer!");
                hall('-');
                break;
        }
    } //19

    public void guardRoom(char es) throws IOException {

        System.out.println("\u001B[31mGuardRoom");
        if (es == '+' && room.roomVisited[20] == false) {
            System.out.println(room.Description(20));
            room.roomVisited[20] = true;
        }
        game.player.health("Guards");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }

        hall('+');
    } //20

    public void freiheit(char es) throws IOException {
        hs.highscore();
        util.win();
    } //21

    public void freiheit2(char es) throws IOException {
        hs.highscore();
        util.win();
    } //22

    //******************Room-methods.end******************\\
    public boolean isAreIn() {
        return areIn;
    }

    public void setAreIn(boolean areIn) {
        this.areIn = areIn;
    }

}
