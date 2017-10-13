package tag1;

import java.util.Scanner;
import textio.SysTextIO;
import textio.TextIO;

public class GameCtrl {

    private String search;
    private final Scanner sc = new Scanner(System.in);
    private String rerun = "";
    private final String[] args = {};
    private int ran;
    private boolean hound = false;
    TextIO io = new TextIO(new SysTextIO());
    Rooms r1 = new Rooms();
    Player p1 = new Player();

    public void GameCtrl() {

        p1.Player();
        r1.Rooms();
        Start(); //står i start        

    }

    public void Start() {
        int wrong = 0;
        if (wrong <= 1) {
            r1.room.get(0);
            System.out.println(r1.description(0));
            r1.roomVisited[0] = true;
        }
        String dir;
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "n":
                Passage();
            case "h":
                Help();
                Start();
                wrong++;
            case "q":
                Quit();
            default:
                wrong++;
                Start();

        }
    } //0

    public void Passage() {
        int wrong = 0;
        if (wrong == 0) {
            r1.room.get(1);
            System.out.println(r1.description(1));
            r1.roomVisited[1] = true;
        }
        String dir;
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "n":
                Storage1();
            case "s":
                Start();
            case "w":
                Corridor();
            case "e":
                Death();
            case "q":
                Quit();
            case "h":
                Help();
                wrong++;
                Passage();
            default:
                wrong++;
                Passage();
        }
    } //1

    public void Death() {
        int wrong = 0;
        if (wrong == 0) {
            r1.room.get(2);
            System.out.println(r1.description(2));
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
            wrong++;
            Death();
        }

    } //2

    public void Storage1() {
        int wrong = 0;
        if (wrong == 0) {
            r1.room.get(3);
            r1.roomVisited[3] = true;
            System.out.println(r1.description(3));
        }

        String dir;
        if (r1.roomStorage1 == false) {
            System.out.println("wanna search? y/n");
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
                Passage3();
                break;
            case "s":
                Passage();
                break;
            case "q":
                Quit();
            case "h":
                Help();
                wrong++;
                Storage1();
            default:
                wrong++;
                Storage1();
        }
    } //3

    public void Corridor() {
        boolean wrong = true;

        if (!wrong) {
            r1.room.get(8);
            r1.roomVisited[8] = true;
            System.out.println(r1.description(8));
        }

        String dir;
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "w":
                Passage2();
            case "e":
                Passage();
            case "q":
                Quit();
            case "h":
                Help();
                wrong = true;
                Corridor();
            default:
                wrong = true;
                Corridor();
        }
    } //8

    public void Passage2() {
        int wrong = 0;
        if (wrong == 0) {
            r1.room.get(9);
            System.out.println(r1.description(9));
            r1.roomVisited[9] = true;
        }

        String dir;
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "n":
                Labratory();
                break;
            case "s":
                Loo();
                break;
            case "e":
                Corridor();
                break;
            case "w":
                Kitchen();
            case "q":
                Quit();
            case "h":
                Help();
                wrong++;
                Passage2();
            default:
                wrong++;
                Passage2();
        }
    } //9

    public void Passage3() {
        int wrong = 0;
        if (wrong == 0) {
            r1.room.get(4);
            System.out.println(r1.description(4));
            r1.roomVisited[4] = true;
        }

        String dir;
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "n":
                DeadEnd();
            case "s":
                Storage1();
            case "e":
                Bedroom();
            case "w":
                Hall();
            case "q":
                Quit();
            case "h":
                Help();
                wrong++;
                Passage3();
            default:
                wrong++;
                Passage3();
        }
    } //4

    public void Hall() {
        int wrong = 0;
        if (wrong == 0) {
            r1.room.get(19);
            System.out.println(r1.description(19));
            r1.roomVisited[19] = true;
        }

        String dir;
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "s":
                GuardRoom();
            case "e":
                Passage3();
            case "w":
                Courtyard();
                break;
            case "q":
                Quit();
            case "h":
                Help();
                wrong++;
                Hall();
            default:
                wrong++;
                Hall();
        }
    } //19

    public void DeadEnd() {
        int wrong = 0;
        if (wrong == 0) {
            r1.room.get(7);
            System.out.println(r1.description(7));
            r1.roomVisited[7] = true;
        }

        if (!hound) {
            ran = (int) (3 * Math.random()) + 1;
            System.out.println(ran);
            if (ran == 3) {
                p1.Health("Hound");
            }
            hound = true;
        } else if (hound) {
            p1.Health("Hound");
        }

        String dir;
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "s":
                Passage3();
                break;
            case "q":
                Quit();
            case "h":
                Help();
                wrong++;
                DeadEnd();
            default:
                wrong++;
                DeadEnd();
        }
    } //7

    public void Bedroom() {
        int wrong = 0;
        if (wrong == 0) {
            r1.room.get(5);
            System.out.println(r1.description(5));
            r1.roomVisited[5] = true;
        }

        String dir;
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "e":
                Loo2();
                break;
            case "w":
                Passage3();
                break;
            case "q":
                Quit();
            case "h":
                Help();
                wrong++;
                Bedroom();
            default:
                wrong++;
                Bedroom();
        }
    } //5

    public void Loo() {
        int wrong = 0;
        if (wrong == 0) {
            r1.room.get(10);
            System.out.println(r1.description(10));
            r1.roomVisited[10] = true;
        }

        String dir;
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "n":
                Passage2();
                break;
            case "q":
                Quit();
            case "h":
                Help();
                wrong++;
                Loo();
            default:
                wrong++;
                Loo();
        }
    } //10

    public void Kitchen() {
        int wrong = 0;
        if (wrong == 0) {
            r1.room.get(12);
            System.out.println(r1.description(12));
            r1.roomVisited[12] = true;
        }

        String dir;
        if (r1.roomKitchen == false) {
            System.out.println("wanna search? y/n");
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
                DiningHall();
                break;
            case "e":
                Passage2();
                break;
            case "w":
                Pantry();
                break;
            case "q":
                Quit();
            case "h":
                Help();
                wrong++;
                Kitchen();
            default:
                wrong++;
                Kitchen();
        }
    } //12

    public void Labratory() {
        int wrong = 0;
        if (wrong == 0) {
            r1.room.get(11);
            System.out.println(r1.description(11));
            r1.roomVisited[11] = true;
        }

        String dir;
        if (r1.roomLabratory == false) {
            System.out.println("wanna search? y/n");
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
                Passage2();
                break;
            case "q":
                Quit();
            case "h":
                Help();
                wrong++;
                Labratory();
            default:
                wrong++;
                Labratory();
        }
    } //11

    public void Loo2() {
        int wrong = 0;
        if (wrong == 0) {
            r1.room.get(6);
            System.out.println(r1.description(6));
            r1.roomVisited[6] = true;
        }

        String dir;
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "e":
                Freiheit2();
                break;
            case "w":
                Bedroom();
                break;
            case "q":
                Quit();
            case "h":
                Help();
                wrong++;
                Loo2();
            default:
                wrong++;
                Loo2();
        }
    } //6

    public void Pantry() {
        int wrong = 0;
        if (wrong == 0) {
            r1.room.get(13);
            System.out.println(r1.description(13));
            r1.roomVisited[13] = true;
        }

        String dir;
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "n":
                HiddenCorridor();
                break;
            case "e":
                Kitchen();
                break;
            case "q":
                Quit();
            case "h":
                Help();
                wrong++;
                Pantry();
            default:
                wrong++;
                Pantry();
        }

    } //13

    public void HiddenCorridor() {
        int wrong = 0;
        if (wrong == 0) {
            r1.room.get(14);
            System.out.println(r1.description(14));
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
                RoomOfRiches();
                break;
            case "s":
                Pantry();
                break;
            case "q":
                Quit();
            case "h":
                Help();
                wrong++;
                HiddenCorridor();
            default:
                wrong++;
                HiddenCorridor();
        }
    } //14

    public void RoomOfRiches() {
        int wrong = 0;
        if (wrong == 0) {
            r1.room.get(15);
            System.out.println(r1.description(15));
            r1.roomVisited[15] = true;
        }

        String dir;
        p1.Loot("Treasure");
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "s":
                HiddenCorridor();
                break;
            case "q":
                Quit();
            case "h":
                Help();
                wrong++;
                RoomOfRiches();
            default:
                wrong++;
                RoomOfRiches();
        }

    } //15

    public void DiningHall() {
        int wrong = 0;
        if (wrong == 0) {
            r1.room.get(16);
            System.out.println(r1.description(16));
            r1.roomVisited[16] = true;
        }

        String dir;
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "n":
                Corridor2();
                break;
            case "s":
                Kitchen();
                break;
            case "q":
                Quit();
            case "h":
                Help();
                wrong++;
                DiningHall();
            default:
                wrong++;
                DiningHall();
        }

    } //16

    public void Corridor2() {
        int wrong = 0;
        if (wrong == 0) {
            r1.room.get(17);
            System.out.println(r1.description(17));
            r1.roomVisited[17] = true;
        }

        String dir;
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "s":
                DiningHall();
                break;
            case "e":
                Courtyard();
                break;
            case "q":
                Quit();
            case "h":
                Help();
                wrong++;
                Corridor2();
            default:
                wrong++;
                Corridor2();
        }

    } //17

    public void Courtyard() {
        int wrong = 0;
        if (wrong == 0) {
            r1.room.get(18);
            System.out.println(r1.description(18));
            r1.roomVisited[18] = true;
        }

        String dir;
        System.out.println("What do you want to do?");
        dir = sc.next();
        switch (dir) {
            case "n":
                Freiheit();
                break;
            case "e":
                Hall();
                break;
            case "w":
                Corridor2();
                break;
            case "q":
                Quit();
            case "h":
                Help();
                wrong++;
                Courtyard();
            default:
                wrong++;
                Courtyard();
        }
    } //18

    public void GuardRoom() {

        r1.room.get(20);
        System.out.println(r1.description(20));
        r1.roomVisited[20] = true;

        p1.Health("Guards");
        p1.Loot("Guards");
        Hall();
    } //20

    public void Freiheit() {
        win();
    } //21

    public void Freiheit2() {
        win();
    } //22

    public void win() {
        System.out.println("Congratulations you have won the game!");
        System.out.println("You ended with " + p1.getGold() + " gold, and " + p1.getHealth() + " health");
        System.out.println("Hope you enjoyed this interactive experience, please come again!");
        System.exit(0);
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

    public void Quit() {
        System.out.println("Oh are you leaving? :( ");
        System.out.println("We hope you had fun, please come again!");
        System.exit(0);
    }
}
