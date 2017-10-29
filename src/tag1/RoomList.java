package tag1;

import java.util.ArrayList;

class RoomList extends TAG1 {

    Utility util = new Utility();
    Rooms room;
    Items item;
    public final Enemy evil;
    private final boolean hound = false;
    private boolean areIn = false;
    ;
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
    }

    //private int ran;
    //******************Room-methods.start******************\\
    public void start(char es) {

        room.start = true;
        room.passage = false;

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
            default:
                System.out.println("Invalid answer!");
                start('-');
                break;

        }
    } //0

    public void passage(char es) {

        room.passage = true;
        room.start = false;
        room.corridor = false;
        room.storage1 = false;

        System.out.println("\u001B[31mPassage");
        if (es == '+' && room.roomVisited[1] == false) {
            System.out.println(room.Description(1));
            room.roomVisited[1] = true;
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
            default:
                System.out.println("Invalid answer!");
                passage('-');
                break;
        }
    } //1

    public void death(char es) {

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

    public void storage1(char es) {

        room.storage1 = true;
        room.passage3 = false;
        room.passage = false;

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
            default:
                System.out.println("Invalid answer!");
                storage1('-');
                break;
        }
    } //3

    public void passage3(char es) {

        room.passage3 = true;
        room.bedroom = false;
        room.deadEnd = false;
        room.storage1 = false;
        room.hall = false;

        System.out.println("\u001B[31mPassage3");
        if (es == '+' && room.roomVisited[4] == false) {
            System.out.println(room.Description(4));
            room.roomVisited[4] = true;
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
            default:
                System.out.println("Invalid answer!");
                passage3('-');
                break;
        }
    } //4

    public void bedroom(char es) {

        room.bedroom = true;
        room.loo2 = false;
        room.passage3 = false;

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
            default:
                System.out.println("Invalid answer!");
                bedroom('-');
                break;
        }
    } //5

    public void loo2(char es) {

        room.loo2 = true;
        room.bedroom = false;

        System.out.println("\u001B[31mLoo2");
        if (es == '+' && room.roomVisited[6] == false) {
            System.out.println(room.Description(6));
            room.roomVisited[6] = true;
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
            default:
                System.out.println("Invalid answer!");
                loo2('-');
                break;
        }
    } //6

    public void deadEnd(char es) {

        room.deadEnd = true;
        room.passage3 = false;

        System.out.println("\u001B[31mDeadEnd");
        if (es == '+' && room.roomVisited[7] == false) {
            System.out.println(room.Description(7));
            room.roomVisited[7] = true;
        }
        if (areIn == false) { //kig på senere
            evil.hound();
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
            default:
                System.out.println("Invalid answer!");
                areIn = true;
                deadEnd('-');
                break;
        }
    } //7

    public void corridor(char es) {

        room.corridor = true;
        room.passage = false;
        room.passage2 = false;

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
            default:
                System.out.println("Invalid answer!");
                corridor('-');
                break;
        }
    } //8

    public void passage2(char es) {

        room.passage2 = true;
        room.laboratory = false;
        room.loo = false;
        room.kitchen = false;
        room.corridor = false;

        System.out.println("\u001B[31mPassage2");
        if (es == '+' && room.roomVisited[9] == false) {
            System.out.println(room.Description(9));
            room.roomVisited[9] = true;
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
            default:
                System.out.println("Invalid answer!");
                passage2('-');
                break;
        }
    } //9

    public void loo(char es) {

        room.loo = true;
        room.passage2 = false;

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
                    System.out.println("You now have: " + game.player.getGold() + " Gold");
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
            default:
                System.out.println("Invalid answer!");
                loo('-');
                break;
        }
    }//10

    public void laboratory(char es) {

        room.laboratory = true;
        room.passage2 = false;

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
            default:
                System.out.println("Invalid answer!");
                laboratory('-');
                break;
        }
    } //11

    public void kitchen(char es) {

        room.kitchen = true;
        room.passage2 = false;
        room.pantry = false;
        room.diningHall = false;

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
            default:
                System.out.println("Invalid answer!");
                kitchen('-');
                break;
        }
    } //12    

    public void pantry(char es) {

        room.pantry = true;
        room.hiddenCorridor = false;
        room.kitchen = false;

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
                    System.out.println("You now have: " + game.player.getGold() + " Gold");
                    room.roomPantry = true;
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
                hiddenCorridor('+');
                break;
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
            default:
                System.out.println("Invalid answer!");
                pantry('-');
                break;
        }

    } //13

    public void hiddenCorridor(char es) {

        room.hiddenCorridor = true;
        room.roomOfRiches = false;
        room.pantry = false;

        System.out.println("\u001B[31mHiddenCorridor");
        if (es == '+' && room.roomVisited[14] == false) {
            System.out.println(room.Description(14));
        }
        String dir;
        if (room.roomVisited[14] == false) {
            game.player.health("Trap");
        }

        room.roomVisited[14] = true;

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
            default:
                System.out.println("Invalid answer!");
                hiddenCorridor('-');
                break;
        }
    } //14

    public void roomOfRiches(char es) {

        room.roomOfRiches = true;
        room.hiddenCorridor = false;

        System.out.println("\u001B[31mRoomOfRiches");
        if (es == '+' && room.roomVisited[15] == false) {
            System.out.println(room.Description(15));
            room.roomVisited[15] = true;
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
            default:
                System.out.println("Invalid answer!");
                roomOfRiches('-');
                break;
        }

    } //15

    public void diningHall(char es) {

        room.diningHall = true;
        room.kitchen = false;
        room.corridor2 = false;

        System.out.println("\u001B[31mDiningHall");
        if (es == '+' && room.roomVisited[16] == false) {
            System.out.println(room.Description(16));
            room.roomVisited[16] = true;
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
            default:
                System.out.println("Invalid answer!");
                diningHall('-');
                break;
        }

    } //16

    public void corridor2(char es) {

        room.corridor2 = true;
        room.courtyard = false;
        room.diningHall = false;

        System.out.println("\u001B[31mCorridor2");
        if (es == '+' && room.roomVisited[17] == false) {
            System.out.println(room.Description(17));
            room.roomVisited[17] = true;
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
            default:
                System.out.println("Invalid answer!");
                corridor2('-');
                break;
        }

    } //17

    public void courtyard(char es) {

        room.courtyard = true;
        room.hall = false;
        room.corridor2 = false;

        System.out.println("\u001B[31mCourtyard");
        if (es == '+' && room.roomVisited[18] == false) {
            System.out.println(room.Description(18));
            room.roomVisited[18] = true;
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
            default:
                System.out.println("Invalid answer!");
                courtyard('-');
                break;
        }
    } //18

    public void hall(char es) {

        room.hall = true;
        room.courtyard = false;
        room.guardRoom = false;
        room.passage3 = false;

        System.out.println("\u001B[31mHall");
        if (es == '+' && room.roomVisited[19] == false) {
            System.out.println(room.Description(19));
            room.roomVisited[19] = true;
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
            default:
                System.out.println("Invalid answer!");
                hall('-');
                break;
        }
    } //19

    public void guardRoom(char es) {

        room.guardRoom = true;
        room.hall = false;

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

    public void freiheit(char es) {
        hs.Highscore();
        util.win();
    } //21

    public void freiheit2(char es) {
        hs.Highscore();
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
