package fileio.writeuserinputtoafile;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteUserInputToAFile {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String line="";
        do{

            try(FileWriter fileWriter=new FileWriter("C:\\Users\\Suraj.Jotiram\\Desktop\\day11IOstream\\src\\fileio\\writeuserinputtoafile\\user_input.txt",true)) {
                line=scanner.nextLine();
                fileWriter.write(line);
                fileWriter.write("\n");
            }catch(IOException e) {
                System.out.println(e.getMessage());
            }
        }while(!line.equals("quiet"));
    }
}
