package fileio.reversefilecontent;

import java.io.*;

public class ReverseFileContent {
    public static void main(String[] args) {
        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader("C:\\Users\\Suraj.Jotiram\\Desktop\\day11IOstream\\src\\fileio\\reversefilecontent\\input.txt"));
            StringBuilder content = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }

            content.reverse();

            writer = new BufferedWriter(new FileWriter("C:\\Users\\Suraj.Jotiram\\Desktop\\day11IOstream\\src\\fileio\\reversefilecontent\\reverse.txt"));
            writer.write(content.toString());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) reader.close();
                if (writer != null) writer.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
