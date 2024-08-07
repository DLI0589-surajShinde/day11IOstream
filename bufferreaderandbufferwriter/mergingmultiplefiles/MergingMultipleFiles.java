package bufferreaderandbufferwriter.mergingmultiplefiles;

import java.io.*;

public class MergingMultipleFiles {
    public static void main(String[] args) {
        File file1 = new File("C:\\Users\\Suraj.Jotiram\\Desktop\\day11IOstream\\src\\bufferreaderandbufferwriter\\mergingmultiplefiles\\file1.txt");
        File file2 = new File("C:\\Users\\Suraj.Jotiram\\Desktop\\day11IOstream\\src\\bufferreaderandbufferwriter\\mergingmultiplefiles\\file2.txt");
        File file3 = new File("C:\\Users\\Suraj.Jotiram\\Desktop\\day11IOstream\\src\\bufferreaderandbufferwriter\\mergingmultiplefiles\\file3.txt");
        File merged_feedback = new File("C:\\Users\\Suraj.Jotiram\\Desktop\\day11IOstream\\src\\bufferreaderandbufferwriter\\mergingmultiplefiles\\merged_feedback.txt");
        try(BufferedReader bufferedReader1=new BufferedReader(new FileReader(file1));
            BufferedReader bufferedReader2=new BufferedReader(new FileReader(file2));
            BufferedReader bufferedReader3=new BufferedReader(new FileReader(file3));
            BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(merged_feedback))) {

            String line;
            while ((line = bufferedReader1.readLine()) != null) {
                bufferedWriter.write(line + " ");

            }
            bufferedWriter.newLine();
            System.out.println();
            while ((line = bufferedReader2.readLine()) != null) {
                bufferedWriter.write(line + " ");
            }
            bufferedWriter.newLine();
            System.out.println();
            while ((line = bufferedReader3.readLine()) != null) {
                bufferedWriter.write(line + " ");
            }
            System.out.println();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
