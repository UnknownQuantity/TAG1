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

    public void sorter(String f, String f2) {

        //  File file = new File("Scoreboard.txt");
        // File file2 = new File("ScoreboardFinal.txt");
        File file = new File(f);
        File file2 = new File(f2);

        BufferedWriter writer = null;

        ArrayList<String> lines = read(file, file2);

        Collections.sort(lines);
        Collections.reverse(lines);
try {
        writer = new BufferedWriter(new FileWriter(file2.getAbsoluteFile(), true));
        
            for (String line : lines) {
                writer.write(line);
                writer.newLine();
            }
        } catch (IOException e) {
        } finally {
            try {
                if (writer != null) {
                    writer.close();
                }
            } catch (IOException e) {
            }
        }
    }

    public ArrayList read(File f1, File f2) {
        BufferedReader reader = null;

        ArrayList<String> lines = new ArrayList<>();
        try {

            reader = new BufferedReader(new FileReader(f1));

            String currentLine = reader.readLine();

            while (currentLine != null) {
                lines.add(currentLine);
                currentLine = reader.readLine();
            }

        } catch (IOException e) {
        } finally {
            try {
            if (reader != null) {
                reader.close();
            }
        } catch (IOException e) {
            
        }
        }
    return lines;
    }
}
