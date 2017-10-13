package tag1;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import textio.SysTextIO;
import textio.TextIO;

public class GameCtrl {

    private String search;
    private final Scanner sc = new Scanner(System.in);
    private String move = "";
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
        move = p1.Movement();
        Passage(); //står i passage
        move = p1.Movement();
        if (move.equals("n")) {
            Storage1();
        } else if (move.equals("s")) {
            Start();
        } else if (move.equals("w")) {
            Corridor();
        } else if (move.equals("e")) {
            Death();
        }

    }

    public void Start() {
        r1.room.get(0);
        System.out.println(r1.description(0));
        r1.roomVisited[0] = true;
    } //0

    public void Passage() {
        r1.room.get(1);
        System.out.println(r1.description(1));
        r1.roomVisited[1] = true;
        // p1.Health("Poison");
        String dir;
        System.out.println("Which way do you wanna go? n, s, w, e");
        dir = sc.next();
        switch (dir) {
            case "n":
                Storage1();
                break;
            case "s":
                Start();
                break;
            case "w":
                Corridor();
                break;
            case "e":
                Death();
            default:
                System.out.println("NOPE");
                break;
        }
    } //1

    public void Death() {
        r1.room.get(2);
        System.out.println(r1.description(2));
        r1.roomVisited[2] = true;
        p1.Health("Death");
        System.out.println("Do you want to try again? y/n");  //respawn
        rerun = sc.next();
        if ("y".equals(rerun)) {
            TAG1.main(args);
        } else if ("n".equals(rerun)) {
            GameEnd();
        }
    } //2

    public void Storage1() {
        r1.room.get(3);
        r1.roomVisited[3] = true;
        System.out.println(r1.description(3));
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
        System.out.println("Which way do you wanna go? n, s");
        dir = sc.next();
        switch (dir) {
            case "n":
                Passage3();
                break;
            case "s":
                Passage();
                break;
            default:
                System.out.println("NOPE");
                break;
        }
    } //3

    public void Corridor() {
        r1.room.get(8);
        r1.roomVisited[8] = true;
        System.out.println(r1.description(8));
        String dir;
        System.out.println("Which way do you wanna go? w, e");
        dir = sc.next();
        switch (dir) {
            case "w":
                Passage2();
                break;
            case "e":
                Passage();
                break;
            default:
                System.out.println("NOPE");
                break;
        }
    } //8

    public void Passage2() {
        r1.room.get(9);
        System.out.println(r1.description(9));
        r1.roomVisited[9] = true;
        String dir;
        System.out.println("Which way do you wanna go? n, s, e, w");
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
            default:
                System.out.println("NOPE");
                break;
        }
    } //9

    public void Passage3() {
        r1.room.get(4);
        System.out.println(r1.description(4));
        r1.roomVisited[4] = true;
        String dir;
        System.out.println("Which way do you wanna go? n, s, e, w");
        dir = sc.next();
        switch (dir) {
            case "n":
                DeadEnd();
                break;
            case "s":
                Storage1();
                break;
            case "e":
                Bedroom();
                break;
            case "w":
                Hall();
                break;
            default:
                System.out.println("NOPE");
                break;
        }
    } //4

    public void Hall() {
        r1.room.get(19);
        System.out.println(r1.description(19));
        r1.roomVisited[19] = true;
        String dir;
        System.out.println("Which way do you wanna go? s, e, w");
        dir = sc.next();
        switch (dir) {
            case "s":
                GuardRoom();
                break;
            case "e":
                Passage3();
                break;
            case "w":
                Courtyard();
                break;
            default:
                System.out.println("NOPE");
                break;
        }
    } //19

    public void DeadEnd() {
        r1.room.get(7);
        System.out.println(r1.description(7));
        if (!hound) {
            ran = (int) (3 * Math.random()) + 1;
            System.out.println(ran);
            if (ran == 3) {
                p1.Health("Hound");
            }
            hound = true;
        }
        else if (hound)
            p1.Health("Hound");
        r1.roomVisited[7] = true;
        String dir;
        System.out.println("Which way do you wanna go? s");
        dir = sc.next();
        switch (dir) {
            case "s":
                Passage3();
                break;
            default:
                System.out.println("NOPE");
                break;
        }
    } //7

    public void Bedroom() {
        r1.room.get(5);
        System.out.println(r1.description(5));
        r1.roomVisited[5] = true;
        String dir;
        System.out.println("Which way do you wanna go? e, w");
        dir = sc.next();
        switch (dir) {
            case "e":
                Loo2();
                break;
            case "w":
                Passage3();
                break;
            default:
                System.out.println("NOPE");
                break;
        }
    } //5

    public void Loo() {
        r1.room.get(10);
        System.out.println(r1.description(10));
        r1.roomVisited[10] = true;
        String dir;
        System.out.println("Which way do you wanna go? n");
        dir = sc.next();
        switch (dir) {
            case "n":
                Passage2();
                break;
            default:
                System.out.println("NOPE");
                break;
        }
    } //10

    public void Kitchen() {
        r1.room.get(12);
        System.out.println(r1.description(12));
        r1.roomVisited[12] = true;
        String dir;
        if (r1.roomKitchen == false) {
            System.out.println("wanna search? y/n");
            search = sc.next();
            if (search.equals("y")) {
                p1.Health("Rotten food");
                r1.roomKitchen = true;
            }
        }
        System.out.println("Which way do you wanna go? n, e, w");
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
            default:
                System.out.println("NOPE");
                break;
        }
    } //12

    public void Labratory() {
        r1.room.get(11);
        System.out.println(r1.description(11));
        r1.roomVisited[11] = true;
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
        System.out.println("Which way do you wanna go? s");
        dir = sc.next();
        switch (dir) {
            case "s":
                Passage2();
                break;
            default:
                System.out.println("NOPE");
                break;
        }
    } //11

    public void Loo2() {
        r1.room.get(6);
        System.out.println(r1.description(6));
        r1.roomVisited[6] = true;
        String dir;
        System.out.println("Which way do you wanna go? e, w");
        dir = sc.next();
        switch (dir) {
            case "e":
                Freiheit2();
                break;
            case "w":
                Bedroom();
                break;
            default:
                System.out.println("NOPE");
                break;
        }
    } //6

    public void Pantry() {
        r1.room.get(13);
        System.out.println(r1.description(13));
        r1.roomVisited[13] = true;
        String dir;
        System.out.println("Which way do you wanna go? n, e");
        dir = sc.next();
        switch (dir) {
            case "n":
                HiddenCorridor();
                break;
            case "e":
                Kitchen();
                break;
            default:
                System.out.println("NOPE");
                break;
        }

    } //13

    public void HiddenCorridor() {
        r1.room.get(14);
        System.out.println(r1.description(14));
        String dir;
        if (r1.roomVisited[14] == false) {
            p1.Health("Trap");
        }

        r1.roomVisited[14] = true;

        System.out.println("Which way do you wanna go? n, s");
        dir = sc.next();
        switch (dir) {
            case "n":
                RoomOfRiches();
                break;
            case "s":
                Pantry();
                break;
            default:
                System.out.println("NOPE");
                break;
        }
    } //14

    public void RoomOfRiches() {
        r1.room.get(15);
        System.out.println(r1.description(15));
        r1.roomVisited[15] = true;
        String dir;
        p1.Loot("Treasure");
        System.out.println("Which way do you wanna go? s");
        dir = sc.next();
        switch (dir) {
            case "s":
                HiddenCorridor();
                break;
            default:
                System.out.println("NOPE");
                break;
        }

    } //15

    public void DiningHall() {
        r1.room.get(16);
        System.out.println(r1.description(16));
        r1.roomVisited[16] = true;
        String dir;
        System.out.println("Which way do you wanna go? n, s");
        dir = sc.next();
        switch (dir) {
            case "n":
                Corridor2();
                break;
            case "s":
                Kitchen();
                break;
            default:
                System.out.println("NOPE");
                break;
        }

    } //16

    public void Corridor2() {
        r1.room.get(17);
        System.out.println(r1.description(17));
        r1.roomVisited[17] = true;
        String dir;
        System.out.println("Which way do you wanna go? s, e");
        dir = sc.next();
        switch (dir) {
            case "s":
                DiningHall();
                break;
            case "e":
                Courtyard();
                break;

            default:
                System.out.println("NOPE");
                break;
        }

    } //17

    public void Courtyard() {
        r1.room.get(18);
        System.out.println(r1.description(18));
        r1.roomVisited[18] = true;
        String dir;
        System.out.println("Which way do you wanna go? n, e, w");
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
            default:
                System.out.println("NOPE");
                break;
        }
    } //18

    public void GuardRoom() {
        r1.room.get(20);
        System.out.println(r1.description(20));
        r1.roomVisited[20] = true;
        String dir;
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

}
