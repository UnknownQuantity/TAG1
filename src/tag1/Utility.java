package tag1;

public class Utility extends TAG1 {

    public void gameEnd() {

        System.out.println("Your game has ended, please come again!");
        System.exit(0);
    }

    public void help() {
        System.out.println("********HELP********");
        System.out.println("When asked to perform an action the following codes is allowed");
        System.out.println("for help type: h");
        System.out.println("to go north type: n");        
        System.out.println("to check inventory type: i");
        System.out.println("to view your stats type: st");
        System.out.println("to go south type: s");
        System.out.println("to go east type: e");
        System.out.println("to go west type: w");
        System.out.println("to quit type: q");
        System.out.println("to check inventory type: i");
        System.out.println("********HELP********");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    public void win() {
        System.out.println("Congratulations you have won the game!");
        System.out.println("You ended with " + game.player.getGold() + " gold, and " + game.player.getHealth() + " health");
        System.out.println("Hope you enjoyed this interactive experience, please come again!");
        System.exit(0);
    }

    public void quit() {
        System.out.println("Oh are you leaving? :( ");
        System.out.println("We hope you had fun, please come again!");
        System.exit(0);
    }

    public void currentInventory() {

        System.out.println(game.player.current_Inventory);
        System.out.println("Current gold: " + game.player.getGold());
    }
    
    public void stats() {
        System.out.println("current gold: " + game.player.getGold());
        System.out.println("current health: " + game.player.getHealth());
    }
}
