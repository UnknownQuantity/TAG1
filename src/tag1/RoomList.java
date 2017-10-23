package tag1;

class RoomList {
   //******************Room-methods.start******************\\
//    public void start(char es) {
//
//        System.out.println("Start");
//        if (es == '+' && room.roomVisited[0] == false) {
////            room.player.get(0);
//            System.out.println(room.Description(0));
//            room.roomVisited[0] = true;
//        }
//        String dir;
//        System.out.println("What do you want to do?");
//        dir = sc.next();
//        switch (dir) {
//            case "n":
//                passage('+');
//                break;
//            case "h":
//                help();
//                start('-');
//                break;
//            case "q":
//                quit();
//                break;
//            default:
//                System.out.println("Invalid answer!");
//                start('-');
//                break;
//
//        }
//    } //0
//
//    public void passage(char es) {
//
//        System.out.println("Passage");
//        if (es == '+' && room.roomVisited[1] == false) {
//            System.out.println(room.Description(1));
//            room.roomVisited[1] = true;
//        }
//        String dir;
//        System.out.println("What do you want to do?");
//        dir = sc.next();
//        switch (dir) {
//            case "n":
//                storage1('+');
//                break;
//            case "s":
//                start('+');
//                break;
//            case "w":
//                corridor('+');
//                break;
//            case "e":
//                death('+');
//                break;
//            case "q":
//                quit();
//                break;
//            case "h":
//                help();
//                passage('-');
//                break;
//            default:
//                System.out.println("Invalid answer!");
//                passage('-');
//                break;
//        }
//    } //1
//
//    public void death(char es) {
//
//        System.out.println("Death");
//        if (es == '+' && room.roomVisited[2] == false) {
//            System.out.println(room.Description(2));
//            room.roomVisited[2] = true;
//            player.Health("Death");
//        }
//        System.out.println("Do you want to try again? y/n");  //respawn
//        rerun = sc.next();
//        if ("y".equals(rerun)) {
//            TAG1.main(args);
//        } else if ("n".equals(rerun)) {
//            gameEnd();
//        } else {
//            death('-');
//        }
//
//    } //2
//
//    public void storage1(char es) {
//
//        System.out.println("Storage1");
//        if (es == '+' && room.roomVisited[3] == false) {
//            room.roomVisited[3] = true;
//            System.out.println(room.Description(3));
//        }
//        String dir;
//        if (room.roomStorage1 == false) {
//            System.out.println("wanna search the room? y/n");
//            search = sc.next();
//            if (search.equals("y")) {
//                player.Loot("Coins");
//                System.out.println("You now have: " + player.getGold() + " Gold");
//                room.roomStorage1 = true;
//            }
//        }
//        System.out.println("What do you want to do?");
//        dir = sc.next();
//        switch (dir) {
//            case "n":
//                passage3('+');
//                break;
//            case "s":
//                passage('+');
//                break;
//            case "q":
//                quit();
//                break;
//            case "h":
//                help();
//                storage1('-');
//                break;
//            default:
//                System.out.println("Invalid answer!");
//                storage1('-');
//                break;
//        }
//    } //3
//
//    public void passage3(char es) {
//
//        System.out.println("Passage3");
//        if (es == '+' && room.roomVisited[4] == false) {
//            System.out.println(room.Description(4));
//            room.roomVisited[4] = true;
//        }
//        String dir;
//        System.out.println("What do you want to do?");
//        dir = sc.next();
//        switch (dir) {
//            case "n":
//                deadEnd('+');
//                break;
//            case "s":
//                storage1('+');
//                break;
//            case "e":
//                bedroom('+');
//                break;
//            case "w":
//                hall('+');
//                break;
//            case "q":
//                quit();
//                break;
//            case "h":
//                help();
//                passage3('-');
//            default:
//                System.out.println("Invalid answer!");
//                passage3('-');
//                break;
//        }
//    } //4
//
//    public void bedroom(char es) {
//
//        System.out.println("Bedroom");
//        if (es == '+' && room.roomVisited[5] == false) {
//            System.out.println(room.Description(5));
//            room.roomVisited[5] = true;
//        }
//        String dir;
//        System.out.println("What do you want to do?");
//        dir = sc.next();
//        switch (dir) {
//            case "e":
//                loo2('+');
//                break;
//            case "w":
//                passage3('+');
//                break;
//            case "q":
//                quit();
//            case "h":
//                help();
//                bedroom('-');
//                break;
//            default:
//                System.out.println("Invalid answer!");
//                bedroom('-');
//                break;
//        }
//    } //5
//
//    public void loo2(char es) {
//
//        System.out.println("Loo2");
//        if (es == '+' && room.roomVisited[6] == false) {
//            System.out.println(room.Description(6));
//            room.roomVisited[6] = true;
//        }
//        String dir;
//        System.out.println("What do you want to do?");
//        dir = sc.next();
//        switch (dir) {
//            case "e":
//                freiheit2('+');
//                break;
//            case "w":
//                bedroom('+');
//                break;
//            case "q":
//                quit();
//                break;
//            case "h":
//                help();
//                loo2('-');
//                break;
//            default:
//                System.out.println("Invalid answer!");
//                loo2('-');
//                break;
//        }
//    } //6
//
//    public void deadEnd(char es) {
//
//        System.out.println("DeadEnd");
//        if (es == '+' && room.roomVisited[7] == false) {
//            System.out.println(room.Description(7));
//            room.roomVisited[7] = true;
//        }
//        if (areIn == false) {
//            if (!hound) {
//                ran = (int) (3 * Math.random()) + 1;
//                System.out.println(ran);
//                if (ran == 3) {
//                    player.Health("Hound_Sleep");
//                }
//                hound = true;
//            } else if (hound) {
//                player.Health("Hound_Wake");
//            }
//        }
//        String dir;
//        System.out.println("What do you want to do?");
//        dir = sc.next();
//        switch (dir) {
//            case "s":
//                areIn = false;
//                passage3('+');
//                break;
//            case "q":
//                quit();
//                break;
//            case "h":
//                help();
//                deadEnd('-');
//                break;
//            default:
//                System.out.println("Invalid answer!");
//                areIn = true;
//                deadEnd('-');
//                break;
//        }
//    } //7
//
//    public void corridor(char es) {
//
//        System.out.println("Corridor");
//        if (es == '+' && room.roomVisited[8] == false) {
//            room.roomVisited[8] = true;
//            System.out.println(room.Description(8));
//        }
//        String dir;
//        System.out.println("What do you want to do?");
//        dir = sc.next();
//        switch (dir) {
//            case "w":
//                passage2('+');
//                break;
//            case "e":
//                passage('+');
//                break;
//            case "q":
//                quit();
//                break;
//            case "h":
//                help();
//                corridor('-');
//                break;
//            default:
//                System.out.println("Invalid answer!");
//                corridor('-');
//                break;
//        }
//    } //8
//
//    public void passage2(char es) {
//
//        System.out.println("Passage2");
//        if (es == '+' && room.roomVisited[9] == false) {
//            System.out.println(room.Description(9));
//            room.roomVisited[9] = true;
//        }
//        String dir;
//        System.out.println("What do you want to do?");
//        dir = sc.next();
//        switch (dir) {
//            case "n":
//                labratory('+');
//                break;
//            case "s":
//                loo('+');
//                break;
//            case "e":
//                corridor('+');
//                break;
//            case "w":
//                kitchen('+');
//                break;
//            case "q":
//                quit();
//                break;
//            case "h":
//                help();
//                passage2('-');
//                break;
//            default:
//                System.out.println("Invalid answer!");
//                passage2('-');
//                break;
//        }
//    } //9
//
//    public void loo(char es) {
//
//        System.out.println("Loo");
//        if (es == '+' && room.roomVisited[10] == false) {
//            System.out.println(room.Description(10));
//            room.roomVisited[10] = true;
//        }
//        String dir;
//        System.out.println("What do you want to do?");
//        dir = sc.next();
//        switch (dir) {
//            case "n":
//                passage2('+');
//                break;
//            case "q":
//                quit();
//                break;
//            case "h":
//                help();
//                loo('-');
//                break;
//            default:
//                System.out.println("Invalid answer!");
//                loo('-');
//                break;
//        }
//    } //10
//
//    public void labratory(char es) {
//
//        System.out.println("Labratory");
//        if (es == '+' && room.roomVisited[11] == false) {
//            System.out.println(room.Description(11));
//            room.roomVisited[11] = true;
//        }
//        String dir;
//        if (room.roomLabratory == false) {
//            System.out.println("wanna search the room? y/n");
//            search = sc.next();
//            if (search.equals("y")) {
//                player.Health("Explosion");
//                room.roomLabratory = true;
//            }
//        } else {
//            player.Health("Flames");
//        }
//        System.out.println("What do you want to do?");
//        dir = sc.next();
//        switch (dir) {
//            case "s":
//                passage2('+');
//                break;
//            case "q":
//                quit();
//                break;
//            case "h":
//                help();
//                labratory('-');
//                break;
//            default:
//                System.out.println("Invalid answer!");
//                labratory('-');
//                break;
//        }
//    } //11
//
//    public void kitchen(char es) {
//
//        System.out.println("Kitchen");
//        if (es == '+' && room.roomVisited[12] == false) {
//            System.out.println(room.Description(12));
//            room.roomVisited[12] = true;
//        }
//        String dir;
//        if (room.roomKitchen == false) {
//            System.out.println("wanna search the room? y/n");
//            search = sc.next();
//            if (search.equals("y")) {
//                player.Health("Rotten food");
//                room.roomKitchen = true;
//            }
//        }
//        System.out.println("What do you want to do?");
//        dir = sc.next();
//        switch (dir) {
//            case "n":
//                diningHall('+');
//                break;
//            case "e":
//                passage2('+');
//                break;
//            case "w":
//                pantry('+');
//                break;
//            case "q":
//                quit();
//                break;
//            case "h":
//                help();
//                kitchen('-');
//                break;
//            default:
//                System.out.println("Invalid answer!");
//                kitchen('-');
//                break;
//        }
//    } //12    
//
//    public void pantry(char es) {
//
//        System.out.println("Pantry");
//        if (es == '+' && room.roomVisited[13] == false) {
//            System.out.println(room.Description(13));
//            room.roomVisited[13] = true;
//        }
//        String dir;
//        System.out.println("What do you want to do?");
//        dir = sc.next();
//        switch (dir) {
//            case "n":
//                hiddenCorridor('+');
//                break;
//            case "e":
//                kitchen('+');
//                break;
//            case "q":
//                quit();
//                break;
//            case "h":
//                help();
//                pantry('-');
//                break;
//            default:
//                System.out.println("Invalid answer!");
//                pantry('-');
//                break;
//        }
//
//    } //13
//
//    public void hiddenCorridor(char es) {
//
//        System.out.println("HiddenCorridor");
//        if (es == '+' && room.roomVisited[14] == false) {
//            System.out.println(room.Description(14));
//        }
//        String dir;
//        if (room.roomVisited[14] == false) {
//            player.Health("Trap");
//        }
//
//        room.roomVisited[14] = true;
//
//        System.out.println("What do you want to do?");
//        dir = sc.next();
//        switch (dir) {
//            case "n":
//                roomOfRiches('+');
//                break;
//            case "s":
//                pantry('+');
//                break;
//            case "q":
//                quit();
//                break;
//            case "h":
//                help();
//                hiddenCorridor('-');
//                break;
//            default:
//                System.out.println("Invalid answer!");
//                hiddenCorridor('-');
//                break;
//        }
//    } //14
//
//    public void roomOfRiches(char es) {
//
//        System.out.println("RoomOfRiches");
//        if (es == '+' && room.roomVisited[15] == false) {
//            System.out.println(room.Description(15));
//            room.roomVisited[15] = true;
//        }
//        String dir;
//        player.Loot("Treasure");
//        System.out.println("What do you want to do?");
//        dir = sc.next();
//        switch (dir) {
//            case "s":
//                hiddenCorridor('+');
//                break;
//            case "q":
//                quit();
//                break;
//            case "h":
//                help();
//                roomOfRiches('-');
//                break;
//            default:
//                System.out.println("Invalid answer!");
//                roomOfRiches('-');
//                break;
//        }
//
//    } //15
//
//    public void diningHall(char es) {
//
//        System.out.println("DiningHall");
//        if (es == '+' && room.roomVisited[16] == false) {
//            System.out.println(room.Description(16));
//            room.roomVisited[16] = true;
//        }
//        String dir;
//        System.out.println("What do you want to do?");
//        dir = sc.next();
//        switch (dir) {
//            case "n":
//                corridor2('+');
//                break;
//            case "s":
//                kitchen('+');
//                break;
//            case "q":
//                quit();
//                break;
//            case "h":
//                help();
//                diningHall('-');
//                break;
//            default:
//                System.out.println("Invalid answer!");
//                diningHall('-');
//                break;
//        }
//
//    } //16
//
//    public void corridor2(char es) {
//
//        System.out.println("Corridor2");
//        if (es == '+' && room.roomVisited[17] == false) {
//            System.out.println(room.Description(17));
//            room.roomVisited[17] = true;
//        }
//        String dir;
//        System.out.println("What do you want to do?");
//        dir = sc.next();
//        switch (dir) {
//            case "s":
//                diningHall('+');
//                break;
//            case "e":
//                courtyard('+');
//                break;
//            case "q":
//                quit();
//                break;
//            case "h":
//                help();
//                corridor2('-');
//                break;
//            default:
//                System.out.println("Invalid answer!");
//                corridor2('-');
//                break;
//        }
//
//    } //17
//
//    public void courtyard(char es) {
//
//        System.out.println("Courtyard");
//        if (es == '+' && room.roomVisited[18] == false) {
//            System.out.println(room.Description(18));
//            room.roomVisited[18] = true;
//        }
//        String dir;
//        System.out.println("What do you want to do?");
//        dir = sc.next();
//        switch (dir) {
//            case "n":
//                freiheit('+');
//                break;
//            case "e":
//                hall('+');
//                break;
//            case "w":
//                corridor2('+');
//                break;
//            case "q":
//                quit();
//                break;
//            case "h":
//                help();
//                courtyard('-');
//                break;
//            default:
//                System.out.println("Invalid answer!");
//                courtyard('-');
//                break;
//        }
//    } //18
//
//    public void hall(char es) {
//
//        System.out.println("Hall");
//        if (es == '+' && room.roomVisited[19] == false) {
//            System.out.println(room.Description(19));
//            room.roomVisited[19] = true;
//        }
//        String dir;
//        System.out.println("What do you want to do?");
//        dir = sc.next();
//        switch (dir) {
//            case "s":
//                guardRoom('+');
//            case "e":
//                passage3('+');
//            case "w":
//                courtyard('+');
//                break;
//            case "q":
//                quit();
//                break;
//            case "h":
//                help();
//                hall('-');
//                break;
//            default:
//                System.out.println("Invalid answer!");
//                hall('-');
//                break;
//        }
//    } //19
//
//    public void guardRoom(char es) {
//
//        System.out.println("GuardRoom");
//        if (es == '+' && room.roomVisited[20] == false) {
//            System.out.println(room.Description(20));
//            room.roomVisited[20] = true;
//        }
//        player.Health("Guards");
//        player.Loot("Guards");
//        hall('+');
//    } //20
//
//    public void freiheit(char es) {
//        win();
//    } //21
//
//    public void freiheit2(char es) {
//        win();
//    } //22
//
    //******************Room-methods.end******************\\
}
