package tag1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Sorter {

    public void sorter() {

        File file = new File("Scoreboard.txt");
        File file2 = new File("ScoreboardFinal.txt");

        BufferedReader reader = null;

        BufferedWriter writer = null;

        ArrayList<String> lines = new ArrayList<>();
        try {

            reader = new BufferedReader(new FileReader(file));

            String currentLine = reader.readLine();

            while (currentLine != null) {
                lines.add(currentLine);
                currentLine = reader.readLine();
            }

            Collections.sort(lines);
            Collections.reverse(lines);

            writer = new BufferedWriter(new FileWriter(file2.getAbsoluteFile(), true));

            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
            }
        }

    }

}
