package fileio.countwordsinafile;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordsCount {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\Suraj.Jotiram\\Desktop\\day11IOstream\\src\\fileio\\countwordsinafile\\text_file.txt";
        int wordCount = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] words = line.split("\\s+");
                wordCount += words.length;
            }
            System.out.println("Total number of words: " + wordCount);
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
