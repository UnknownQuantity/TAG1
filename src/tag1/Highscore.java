package tag1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Highscore extends TAG1 {

    private int finalHP = 0;
    private int finalGP = 0;
    private Integer score = 0;
    private String pName = "";
    private static final ArrayList<String> scoreboard = new ArrayList<>();
    private final Sorter sort = new Sorter();

    public void highscore() throws IOException {

        finalHP = game.player.getHealth();
        finalGP = game.player.getGold();
        pName = game.player.getName();
        score = finalGP + finalHP;
        String result = "";
        if (score > 99 && score <= 999) {
            scoreboard.add(score.toString());
        } else if (score < 100) {
            result = "0" + score;
            scoreboard.add(result);
        } else if (score < 10) {
            result = "00" + score;
            scoreboard.add(result);
        }
        try {
            String content = scoreboard + " points scored by player: " + pName + "\n";

            File file = new File("Scoreboard.txt");

            FileWriter fw = new FileWriter(file.getAbsoluteFile(), true);
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(content);
            bw.newLine();
            bw.close();
            sort.sorter("Scoreboard.txt", "ScoreboardFinal.txt");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
    
    public int getScore() {
        return score;
    }

}
