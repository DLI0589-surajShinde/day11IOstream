package fileio.readanddisplayfilecontent;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOError;
import java.io.IOException;

public class ReadAndDisplay {
    public static void main(String[] args) {
        String indexFile= "C:\\Users\\Suraj.Jotiram\\Desktop\\day11IOstream\\src\\fileio\\readanddisplayfilecontent\\input.txt";
        try(BufferedReader bufferedReader=new BufferedReader(new FileReader(indexFile))) {
            String line;
            while((line = bufferedReader.readLine())!=null) {
                System.out.println(line);
            }
        }catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
