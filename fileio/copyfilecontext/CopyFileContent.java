package fileio.copyfilecontext;

import java.io.*;

public class CopyFileContent {
    public static void main(String[] args) {
        File source=new File("C:\\Users\\Suraj.Jotiram\\Desktop\\day11IOstream\\src\\fileio\\copyfilecontext\\source.txt");
        File destination=new File("C:\\Users\\Suraj.Jotiram\\Desktop\\day11IOstream\\src\\fileio\\copyfilecontext\\destination.txt");

        try(FileReader fileReader=new FileReader(source);
            FileWriter fileWriter=new FileWriter(destination)) {
            int character;
            while ((character = fileReader.read()) != -1) {
                fileWriter.write((char)character);
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}