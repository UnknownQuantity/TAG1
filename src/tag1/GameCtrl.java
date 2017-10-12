package tag1;

import java.util.Scanner;

public class GameCtrl {
    String search;
    Scanner sc = new Scanner(System.in);
    String move = "";

    public void GameCtrl() {
        boolean d = true;

        while (d == true) {
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
            if (null != move) switch (move) {
                case "east":
                    p1.Health("Death");
                    d = false;
                    break;
                case "north":
                    r1.room.get(3);
                    r1.description();
                    System.out.println("wanna search?");
                    search = sc.next();
                    if (search.equals("s")) {
                        p1.Loot("Coins");
                        System.out.println("You now have: " + p1.getGold() + " Gold");
                    }   break;
                case "west":
                    r1.room.get(8);
                    r1.description();
                    break;
                case "south":
                    r1.room.get(0);
                    r1.description();
                    break;
                default:
                    break;
            }
        }
    }
}
