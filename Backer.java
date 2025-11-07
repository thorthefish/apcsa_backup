import java.io.*;
import java.util.Scanner;

public class Backer {
    public static void main(String[] args) {
        try {
            File res = new File("Results.txt");
            Scanner inScan = new Scanner(res);
            FileWriter resIn = new FileWriter("ResultsBackup.txt", true);
            System.out.println("okee here we go");
            System.out.println("\nbackup started");
            while (inScan.hasNextLine()) {
                String backLine = inScan.nextLine();
                resIn.write(backLine);
                resIn.write("\n");
            }
            resIn.close();
            inScan.close();
            System.out.println("backup done");
        } catch (IOException e) {
            System.out.println("error");
        }
    System.out.println("thx for doin the stuffs");
    }
}
