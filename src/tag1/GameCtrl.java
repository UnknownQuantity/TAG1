package tag1;

import java.util.Scanner;
import textio.SysTextIO;
import textio.TextIO;

public class GameCtrl {

    //******************GameCtrl-Varibles.start******************\\
    private final Scanner sc = new Scanner(System.in);
    private String search;
    private String rerun = "";
    private final String[] args = {};
    private int ran;
    private boolean hound = false;
    private boolean areIn = false;
    TextIO io = new TextIO(new SysTextIO());
    Rooms r1 = new Rooms();
    Player p1 = new Player();
    Items it = new Items();

    //******************GameCtrl-Varibles.end******************\\
    //******************Room-methods.start******************\\
    public void Start(char es) {

        System.out.println("Start");
        if (es == '+' && r1.roomVisited[0] == false) {
//            r1.room.get(0);
            System.out.println(r1.Description(0));
            r1.roomVisited[0] = true;
        }
        String dir;
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "n":
                Passage('+');
            case "h":
                Help();
                Start('-');
            case "q":
                Quit();
            default:
                System.out.println("Invalid answer!");
                Start('-');

        }
    } //0

    public void Passage(char es) {

        System.out.println("Passage");
        if (es == '+' && r1.roomVisited[1] == false) {
            System.out.println(r1.Description(1));
            r1.roomVisited[1] = true;
        }
        String dir;
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "n":
                Storage1('+');
            case "s":
                Start('+');
            case "w":
                Corridor('+');
            case "e":
                Death('+');
            case "q":
                Quit();
            case "h":
                Help();
                Passage('-');
            default:
                System.out.println("Invalid answer!");
                Passage('-');
        }
    } //1

    public void Death(char es) {

        System.out.println("Death");
        if (es == '+' && r1.roomVisited[2] == false) {
            System.out.println(r1.Description(2));
            r1.roomVisited[2] = true;
            p1.Health("Death");
        }
        System.out.println("Do you want to try again? y/n");  //respawn
        rerun = sc.next();
        if ("y".equals(rerun)) {
            TAG1.main(args);
        } else if ("n".equals(rerun)) {
            GameEnd();
        } else {
            Death('-');
        }

    } //2

    public void Storage1(char es) {

        System.out.println("Storage1");
        if (es == '+' && r1.roomVisited[3] == false) {
            r1.roomVisited[3] = true;
            System.out.println(r1.Description(3));
        }
        String dir;
        if (r1.roomStorage1 == false) {
            System.out.println("wanna search the room? y/n");
            search = sc.next();
            if (search.equals("y")) {
                p1.Loot("Coins");
                System.out.println("You now have: " + p1.getGold() + " Gold");
                r1.roomStorage1 = true;
            }
        }
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "n":
                Passage3('+');
                break;
            case "s":
                Passage('+');
                break;
            case "q":
                Quit();
            case "h":
                Help();
                Storage1('-');
            default:
                System.out.println("Invalid answer!");
                Storage1('-');
        }
    } //3

    public void Passage3(char es) {

        System.out.println("Passage3");
        if (es == '+' && r1.roomVisited[4] == false) {
            System.out.println(r1.Description(4));
            r1.roomVisited[4] = true;
        }
        String dir;
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "n":
                DeadEnd('+');
            case "s":
                Storage1('+');
            case "e":
                Bedroom('+');
            case "w":
                Hall('+');
            case "q":
                Quit();
            case "h":
                Help();
                Passage3('-');
            default:
                System.out.println("Invalid answer!");
                Passage3('-');
        }
    } //4

    public void Bedroom(char es) {

        System.out.println("Bedroom");
        if (es == '+' && r1.roomVisited[5] == false) {
            System.out.println(r1.Description(5));
            r1.roomVisited[5] = true;
        }
        String dir;
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "e":
                Loo2('+');
                break;
            case "w":
                Passage3('+');
                break;
            case "q":
                Quit();
            case "h":
                Help();
                Bedroom('-');
            default:
                System.out.println("Invalid answer!");
                Bedroom('-');
        }
    } //5

    public void Loo2(char es) {

        System.out.println("Loo2");
        if (es == '+' && r1.roomVisited[6] == false) {
            System.out.println(r1.Description(6));
            r1.roomVisited[6] = true;
        }
        String dir;
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "e":
                Freiheit2('+');
                break;
            case "w":
                Bedroom('+');
                break;
            case "q":
                Quit();
            case "h":
                Help();
                Loo2('-');
            default:
                System.out.println("Invalid answer!");
                Loo2('-');
        }
    } //6

    public void DeadEnd(char es) {

        System.out.println("DeadEnd");
        if (es == '+' && r1.roomVisited[7] == false) {
            System.out.println(r1.Description(7));
            r1.roomVisited[7] = true;
        }
        if (areIn == false) {
            if (!hound) {
                ran = (int) (3 * Math.random()) + 1;
                System.out.println(ran);
                if (ran == 3) {
                    p1.Health("Hound_Sleep");
                }
                hound = true;
            } else if (hound) {
                p1.Health("Hound_Wake");
            }
        }
        String dir;
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "s":
                areIn = false;
                Passage3('+');
                break;
            case "q":
                Quit();
            case "h":
                Help();
                DeadEnd('-');
            default:
                System.out.println("Invalid answer!");
                areIn = true;
                DeadEnd('-');
        }
    } //7

    public void Corridor(char es) {

        System.out.println("Corridor");
        if (es == '+' && r1.roomVisited[8] == false) {
            r1.roomVisited[8] = true;
            System.out.println(r1.Description(8));
        }
        String dir;
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "w":
                Passage2('+');
            case "e":
                Passage('+');
            case "q":
                Quit();
            case "h":
                Help();
                Corridor('-');
            default:
                System.out.println("Invalid answer!");
                Corridor('-');
        }
    } //8

    public void Passage2(char es) {

        System.out.println("Passage2");
        if (es == '+' && r1.roomVisited[9] == false) {
            System.out.println(r1.Description(9));
            r1.roomVisited[9] = true;
        }
        String dir;
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "n":
                Labratory('+');
                break;
            case "s":
                Loo('+');
                break;
            case "e":
                Corridor('+');
                break;
            case "w":
                Kitchen('+');
            case "q":
                Quit();
            case "h":
                Help();
                Passage2('-');
            default:
                System.out.println("Invalid answer!");
                Passage2('-');
        }
    } //9

    public void Loo(char es) {

        System.out.println("Loo");
        if (es == '+' && r1.roomVisited[10] == false) {
            System.out.println(r1.Description(10));
            r1.roomVisited[10] = true;
        }
        String dir;
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "n":
                Passage2('+');
                break;
            case "q":
                Quit();
            case "h":
                Help();
                Loo('-');
            default:
                System.out.println("Invalid answer!");
                Loo('-');
        }
    } //10

    public void Labratory(char es) {

        System.out.println("Labratory");
        if (es == '+' && r1.roomVisited[11] == false) {
            System.out.println(r1.Description(11));
            r1.roomVisited[11] = true;
        }
        String dir;
        if (r1.roomLabratory == false) {
            System.out.println("wanna search the room? y/n");
            search = sc.next();
            if (search.equals("y")) {
                p1.Health("Explosion");
                r1.roomLabratory = true;
            }
        } else {
            p1.Health("Flames");
        }
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "s":
                Passage2('+');
                break;
            case "q":
                Quit();
            case "h":
                Help();
                Labratory('-');
            default:
                System.out.println("Invalid answer!");
                Labratory('-');
        }
    } //11

    public void Kitchen(char es) {

        System.out.println("Kitchen");
        if (es == '+' && r1.roomVisited[12] == false) {
            System.out.println(r1.Description(12));
            r1.roomVisited[12] = true;
        }
        String dir;
        if (r1.roomKitchen == false) {
            System.out.println("wanna search the room? y/n");
            search = sc.next();
            if (search.equals("y")) {
                p1.Health("Rotten food");
                r1.roomKitchen = true;
            }
        }
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "n":
                DiningHall('+');
                break;
            case "e":
                Passage2('+');
                break;
            case "w":
                Pantry('+');
                break;
            case "q":
                Quit();
            case "h":
                Help();
                Kitchen('-');
            default:
                System.out.println("Invalid answer!");
                Kitchen('-');
        }
    } //12    

    public void Pantry(char es) {

        System.out.println("Pantry");
        if (es == '+' && r1.roomVisited[13] == false) {
            System.out.println(r1.Description(13));
            r1.roomVisited[13] = true;
        }
        String dir;
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "n":
                HiddenCorridor('+');
                break;
            case "e":
                Kitchen('+');
                break;
            case "q":
                Quit();
            case "h":
                Help();
                Pantry('-');
            default:
                System.out.println("Invalid answer!");
                Pantry('-');
        }

    } //13

    public void HiddenCorridor(char es) {

        System.out.println("HiddenCorridor");
        if (es == '+' && r1.roomVisited[14] == false) {
            System.out.println(r1.Description(14));
        }
        String dir;
        if (r1.roomVisited[14] == false) {
            p1.Health("Trap");
        }

        r1.roomVisited[14] = true;

        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "n":
                RoomOfRiches('+');
                break;
            case "s":
                Pantry('+');
                break;
            case "q":
                Quit();
            case "h":
                Help();
                HiddenCorridor('-');
            default:
                System.out.println("Invalid answer!");
                HiddenCorridor('-');
        }
    } //14

    public void RoomOfRiches(char es) {

        System.out.println("RoomOfRiches");
        if (es == '+' && r1.roomVisited[15] == false) {
            System.out.println(r1.Description(15));
            r1.roomVisited[15] = true;
        }
        String dir;
        p1.Loot("Treasure");
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "s":
                HiddenCorridor('+');
                break;
            case "q":
                Quit();
            case "h":
                Help();
                RoomOfRiches('-');
            default:
                System.out.println("Invalid answer!");
                RoomOfRiches('-');
        }

    } //15

    public void DiningHall(char es) {

        System.out.println("DiningHall");
        if (es == '+' && r1.roomVisited[16] == false) {
            System.out.println(r1.Description(16));
            r1.roomVisited[16] = true;
        }
        String dir;
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "n":
                Corridor2('+');
                break;
            case "s":
                Kitchen('+');
                break;
            case "q":
                Quit();
            case "h":
                Help();
                DiningHall('-');
            default:
                System.out.println("Invalid answer!");
                DiningHall('-');
        }

    } //16

    public void Corridor2(char es) {

        System.out.println("Corridor2");
        if (es == '+' && r1.roomVisited[17] == false) {
            System.out.println(r1.Description(17));
            r1.roomVisited[17] = true;
        }
        String dir;
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "s":
                DiningHall('+');
                break;
            case "e":
                Courtyard('+');
                break;
            case "q":
                Quit();
            case "h":
                Help();
                Corridor2('-');
            default:
                System.out.println("Invalid answer!");
                Corridor2('-');
        }

    } //17

    public void Courtyard(char es) {

        System.out.println("Courtyard");
        if (es == '+' && r1.roomVisited[18] == false) {
            System.out.println(r1.Description(18));
            r1.roomVisited[18] = true;
        }
        String dir;
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "n":
                Freiheit('+');
                break;
            case "e":
                Hall('+');
                break;
            case "w":
                Corridor2('+');
                break;
            case "q":
                Quit();
            case "h":
                Help();
                Courtyard('-');
            default:
                System.out.println("Invalid answer!");
                Courtyard('-');
        }
    } //18

    public void Hall(char es) {

        System.out.println("Hall");
        if (es == '+' && r1.roomVisited[19] == false) {
            System.out.println(r1.Description(19));
            r1.roomVisited[19] = true;
        }
        String dir;
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "s":
                GuardRoom('+');
            case "e":
                Passage3('+');
            case "w":
                Courtyard('+');
                break;
            case "q":
                Quit();
            case "h":
                Help();
                Hall('-');
            default:
                System.out.println("Invalid answer!");
                Hall('-');
        }
    } //19

    public void GuardRoom(char es) {

        System.out.println("GuardRoom");
        if (es == '+' && r1.roomVisited[20] == false) {
            System.out.println(r1.Description(20));
            r1.roomVisited[20] = true;
        }
        p1.Health("Guards");
        p1.Loot("Guards");
        Hall('+');
    } //20

    public void Freiheit(char es) {
        Win();
    } //21

    public void Freiheit2(char es) {
        Win();
    } //22

    //******************Room-methods.end******************\\
    //******************Non-room-methods.start******************\\
    public void GameCtrl() {

        p1.Player();
        Start('+'); //står i start        

    }
    
    public void Search() {
        
    }

    public void GameEnd() {
//        for (int i = 0; i < r1.roomVisited.length; i++) {
//            System.out.println(r1.roomVisited[i]);
//        }
        System.out.println("Your game has ended, please come again!");
        System.exit(0);
    }

    public void Help() {
        System.out.println("********HELP********");
        System.out.println("When asked to perform an action the following codes is allowed");
        System.out.println("for help type: h");
        System.out.println("to go north type: n");
        System.out.println("to go south type: s");
        System.out.println("to go east type: e");
        System.out.println("to go west type: w");
        System.out.println("to quit type: q");
        System.out.println("********HELP********");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
    
    public void Win() {
        System.out.println("Congratulations you have won the game!");
        System.out.println("You ended with " + p1.getGold() + " gold, and " + p1.getHealth() + " health");
        System.out.println("Hope you enjoyed this interactive experience, please come again!");
        System.exit(0);
    }

    public void Quit() {
        System.out.println("Oh are you leaving? :( ");
        System.out.println("We hope you had fun, please come again!");
        System.exit(0);
    }

    //******************Non-room-methods.end******************\\
}
