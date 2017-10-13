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
        switch (move) { //står i Passage
            case "east":
                Death();
            case "north":
                Storage1();
                break;
            case "west":
                Corridor();
                break;
            case "south":
                Start();
                break;
            default:
                System.out.println("wtf");
                break;
        }
        if (move.equals("north")) { //står i Storage1
            move = p1.Movement();

            switch (move) { 
                case "north":
                    Passage3();
                    break;
                case "south":
                    Passage();
                    break;
                default:
                    System.out.println("Illigal action!");
                    List choices = Arrays.asList(new String[]{"north", "south",});
                    int p = io.select("*************************", choices, "*************************");
            }
        } else if (move.equals("west")) { //står i corridor
            move = p1.Movement();
            switch (move) {
                case "east":
                    Passage();
                    break;
                case "west":
                    Passage2();
                    break;

            }
        }
        if (move.equals("north")) { //står i Passage3
            move = p1.Movement();

            switch (move) {
                case "south":
                    Storage1();
                    break;
                case "west":
                    Hall();
                    break;
                case "north":
                    
                default:
                    System.out.println("you win");
                    break;
            }
        }
    }

    public void Start() {
        r1.room.get(0);
        r1.description();
        r1.roomVisited[0] = true;
    }

    public void Passage() {
        r1.room.get(1);
        r1.description();
        r1.roomVisited[1] = true;
    }

    public void Death() {
        r1.roomVisited[2] = true;
        p1.Health("Death"); //Death1
        System.out.println("Do you want to try again? y/n");  //respawn
        rerun = sc.next();
        if ("y".equals(rerun)) {
            TAG1.main(args);
        } else if ("n".equals(rerun)) {
            GameEnd();
        }
    }

    public void Storage1() {
        r1.room.get(3); //Storage1                
        r1.roomVisited[3] = true;
        r1.description();
        if (r1.roomStorage1 == false) {
            System.out.println("wanna search? y/n");
            search = sc.next();
            if (search.equals("y")) {
                p1.Loot("Coins");
                System.out.println("You now have: " + p1.getGold() + " Gold");
                r1.roomStorage1 = true;
            }
        }
    }

    public void Corridor() {
        r1.room.get(8); //Corridor                                
        r1.roomVisited[8] = true;
        r1.description();
    }
    
    public void Passage2() {        
                    r1.room.get(9);//Passage2
                    r1.description();
    }

    public void Passage3() {
        r1.room.get(4); //Passage3
        r1.description();
    }
    
    public void Hall() {
        r1.room.get(19);
        r1.description();
    }
    
    public void GameEnd() {
        for (int i = 0; i < r1.roomVisited.length; i++) {
            System.out.println(r1.roomVisited[i]);
        }
        System.out.println("Your game has ended, please come again!");
        System.exit(0);
    }

}
