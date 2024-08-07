package bufferreaderandbufferwriter.largdatafileprocessing;

import java.io.*;

public class FilterTransactions {
    public static void main(String[] args) {
        String inputFile = "C:\\Users\\Suraj.Jotiram\\Desktop\\day11IOstream\\src\\bufferreaderandbufferwriter\\largdatafileprocessing\\transactions.txt";
        String outputFile = "C:\\Users\\Suraj.Jotiram\\Desktop\\day11IOstream\\src\\bufferreaderandbufferwriter\\largdatafileprocessing\\filtered_transactions.txt";
        double threshold = 1000.0;

        BufferedReader reader = null;
        BufferedWriter writer = null;

        try {
            reader = new BufferedReader(new FileReader(inputFile));
            writer = new BufferedWriter(new FileWriter(outputFile));
            String line;

            while ((line = reader.readLine()) != null) {
                String[] fields = line.split(",");
                if (fields.length == 4) {
                    String transactionID = fields[0];
                    String customerID = fields[1];
                    double transactionAmount = Double.parseDouble(fields[2]);
                    String date = fields[3];

                    if (transactionAmount > threshold) {
                        writer.write(transactionID + "," + customerID + "," + transactionAmount + "," + date);
                        writer.newLine();
                    }
                }
            }
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

