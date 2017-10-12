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
    
  public void GameEnd() {
        System.out.println("Your game has ended, please come again!");
        System.exit(0);
    }  
  
    public void GameCtrl() {
        boolean d = true;

        //while (d == true) {
            Player p1 = new Player();
            Rooms r1 = new Rooms();

            p1.Player();
            r1.Rooms();
            r1.room.get(0);
            r1.description();
            
            move = p1.Movement();
            
            r1.room.get(1);
            r1.description();

            move = p1.Movement();
            switch (move) {
                case "east":
                    p1.Health("Death"); //Death1
                    System.out.println("Do you want to try again? y/n");  //respawn
                    rerun = sc.next();
                    if ("y".equals(rerun))
                    TAG1.main(args);
                    else if ("n".equals(rerun))
                    GameEnd();
                case "north":
                    r1.room.get(3); //Storage1
                    r1.description();
                    if(r1.roomStorage1 == false) {
                    System.out.println("wanna search? y/n" );
                    search = sc.next();
                    if (search.equals("y")) {
                        p1.Loot("Coins");
                        System.out.println("You now have: " + p1.getGold() + " Gold");
                        r1.roomStorage1 = true;
                    }                      
                    }
                    else
                    break;
                case "west":
                    r1.room.get(8); //Corridor
                    r1.description();
                    break;
                case "south":
                    r1.room.get(0); //Start
                    r1.description();
                    break;
                default:
                    System.out.println("wtf");
                    break;
            }        
                if (move.equals("north")) {
                    move = p1.Movement();   
                        
                    switch (move) {
                        case "north":
                            r1.room.get(4); //Passage3
                            r1.description();
                            break;
                        case "south":
                            r1.room.get(1); //Passage
                            r1.description();
                            System.out.println("boool");
                            break;
                        default:
                            System.out.println("Illigal action!");
                            List choices = Arrays.asList(new String[]{"north", "south",});
                            int p = io.select("*************************", choices, "*************************");                           
                    }                 
                }
                else if(move.equals("west")) {
                    move = p1.Movement();
                    switch (move) {
                        case "east":
                            r1.room.get(1); //Passage
                            r1.description();
                            break;
                        case "west":
                            r1.room.get(9);//Passage2
                            r1.description();
                            break;
                                    
                    }
                }
                if(move.equals("north")) {
                    move = p1.Movement();
                    
                    switch (move) {
                        case "south":
                            r1.room.get(3); //Storage1
                    r1.description();
                    if(r1.roomStorage1 == false) { //master searcher
                    System.out.println("wanna search? y/n");
                    search = sc.next();
                    if (search.equals("y")) {
                        p1.Loot("Coins");
                        System.out.println("You now have: " + p1.getGold() + " Gold");
                        r1.roomStorage1 = true;
                    }                      
                    }
                    else
                    System.out.println("you cant search");
                    break;                    
                    default:
                    System.out.println("you win");
                    break;
                }
                }
    }
}
                    
        
