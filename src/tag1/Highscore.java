package tag1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Highscore extends TAG1 {

    private int finalHP = 0;
    private int finalGP = 0;
    private int score = 0;
    private String pName = "";
    private final ArrayList<Integer> scoreboard = new ArrayList<>();

    public void Highscore() {

        finalHP = game.player.getHealth();
        finalGP = game.player.getGold();
        pName = game.player.getName();
        score = finalGP + finalHP;
        scoreboard.add(score);
        //reader();
        try {
            String content = "Player " + pName + " scored " + scoreboard.toString() + " points.";

            File file = new File("Scoreboard.txt");

            FileWriter fw = new FileWriter(file.getAbsoluteFile(),true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(content);
            bw.newLine();
            bw.close();
            
        } catch (IOException e) {
            System.out.println(e);
        }
        //content = content.replace("Potato", "Hej");
        //Potato = Highscore;
            }

    public static void reader() {
        String fileName = "Scoreboard.txt";

        String line = null;

        try {
            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }

            bufferedReader.close();
        } catch (FileNotFoundException ex) {
            System.out.println("Unable to open file '" + fileName + "'");
        } catch (IOException ex) {
            System.out.println("Error reader file '" + fileName + "'");
        }
    }
}
