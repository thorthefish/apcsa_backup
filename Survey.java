import java.util.*;
import java.io.*;


public class Survey {
    public static void main(String[] args) {
        try {
            Scanner inScan = new Scanner(System.in);
            FileWriter resIn = new FileWriter("Results.txt", true);
            System.out.println("okee here we go");
            System.out.println("1. what is the awnser to life the universe and everything?");
            int ques1 = Integer.parseInt(inScan.nextLine());
            resIn.write(String.valueOf(ques1));
            resIn.write("\n");
            System.out.println("2. what is the capital of Assyria? {4 possible correct awnsers}");
            String ques2 = inScan.nextLine();
            resIn.write(ques2);
            resIn.write("\n");
            System.out.println("3. driving backwards reduces milage {t/f}?");
            boolean ques3 = Boolean.parseBoolean(inScan.nextLine());
            resIn.write(String.valueOf(ques3));
            resIn.write("\n");
            System.out.println("4. all of human wisdom is contained in what two words? {\"___ and ___\" formatting}");
            String ques4 = inScan.nextLine();
            resIn.write(ques4);
            resIn.write("\n");
            System.out.println("5. What is the airspeed velocity of an unlaidened swollow?");
            String ques5Pre = inScan.nextLine();
            double ques5 = 0.0;
            if(ques5Pre.contains("f") || ques5Pre.contains("e") || ques5Pre.contains("a")){
                System.out.println("european cuz idk the number for african swollows");
                ques5 = Double.parseDouble(inScan.nextLine());
            }else{
                ques5 = Double.parseDouble(ques5Pre);
            }
            resIn.write(String.valueOf(ques5));
            resIn.write("\n");
            System.out.println("6. prefered browser");
            String ques6 = inScan.nextLine();
            resIn.write(ques6);
            resIn.write("\n");


            resIn.close();
            inScan.close();
            } catch (IOException e) {
                System.out.println("error");
            }
            System.out.println("thx for doin the stuffs");
        }
}





