//uncomment the methods as you write them
import java.util.Scanner;
public class Mastermind {

    //generate a unique 4 digit number with no repeat digits
    public static int generateRandom(){
        int one = (int)(Math.random()*10);
        while (one == 0){
            one = (int)(Math.random()*10);
        }
        int two = (int)(Math.random()*10);
        while( two == 0){
            two = (int)(Math.random()*10);
        }
        while (two == one) {
            two = (int)(Math.random()*10);
        }
        int three = (int)(Math.random()*10);
        while (three == one) {
            three = (int)(Math.random()*10);
        }
        while (three == two) {
            three = (int)(Math.random()*10);
        }
        int four = (int)(Math.random()*10);
        while (four == one) {
            four = (int)(Math.random()*10);
        }
        while (four == two) {
            four = (int)(Math.random()*10);
        }
        while (four == three) {
            four = (int)(Math.random()*10);
        }
        int whole = ((one*1000) + (two*100) + (three*10) + four);
        //System.out.println(whole);
        return (whole);
    }

    public static int correctNum(int guess, int ranNum){
        int oneGu = ((guess/1000));
        int twoGu = (((guess%1000)/100));
        int threeGu = (((guess%100)/10));
        int fourGu = ((guess%10));
        int oneRan = ((ranNum/1000));
        int twoRan = (((ranNum%1000)/100));
        int threeRan = (((ranNum%100)/10));
        int fourRan = ((ranNum%10));
        int result = 0;
        if(oneGu == oneRan){
            result ++;
        }else if(oneGu == twoRan){
            result ++;
        }else if(oneGu == threeRan){
            result++;
        }else if(oneGu == fourRan){
            result++;
        }
        if(twoGu == oneRan){
            result ++;
        }else if(twoGu == twoRan){
            result ++;
        }else if(twoGu == threeRan){
            result++;
        }else if(twoGu == fourRan){
            result++;
        }
        if(threeGu == oneRan){
            result ++;
        }else if(threeGu == twoRan){
            result ++;
        }else if(threeGu == threeRan){
            result++;
        }else if(threeGu == fourRan){
            result++;
        }
        if(fourGu == oneRan){
            result ++;
        }else if(fourGu == twoRan){
            result ++;
        }else if(fourGu == threeRan){
            result++;
        }else if(fourGu == fourRan){
            result++;
        }
        //System.out.println(oneGu + " " + oneRan + " | " + twoGu + " " + twoRan + " | " + threeGu + " " + threeRan + " | " + fourGu + " " + fourRan );
        return result;
    }

    //compare the guess to the 4 digit number, return how many numbers are in the correct position
    public static int correctPos(int guess, int ranNum){
        int result = 0;
        int oneGu = ((guess/1000));
        int twoGu = (((guess%1000)/100));
        int threeGu = (((guess%100)/10));
        int fourGu = ((guess%10));
        int oneRan = ((ranNum/1000));
        int twoRan = (((ranNum%1000)/100));
        int threeRan = (((ranNum%100)/10));
        int fourRan = ((ranNum%10));
        if(oneGu == oneRan){
            result ++;
        }
        if(twoGu == twoRan){
            result ++;
        }
        if(threeGu == threeRan){
            result ++;
        }
        if(fourGu == fourRan){
            result ++;
        }
        //System.out.println(oneGu + " " + oneRan + " | " + twoGu + " " + twoRan + " | " + threeGu + " " + threeRan + " | " + fourGu + " " + fourRan );
        return result;
    }
    public static boolean dummyCheck(int guess){
        boolean isDummy = false;
        int oneGu = ((guess/1000));
        int twoGu = (((guess%1000)/100));
        int threeGu = (((guess%100)/10));
        int fourGu = ((guess%10));
        if(guess < 1000){
            isDummy = true;
        }else if(oneGu == twoGu){
            isDummy = true;
        }else if(oneGu == threeGu){
            isDummy = true;
        }else if(oneGu == fourGu){
            isDummy = true;
        }else if(twoGu == threeGu){
            isDummy = true;
        }else if(twoGu == fourGu){
            isDummy = true;
        }else if(threeGu == fourGu){
            isDummy = true;
        }else if(guess >= 9876){
            isDummy = true;
        }else if(oneGu == 0){
            isDummy = true;
        }
        return isDummy;
    }
    public static void main(String[] args){
       int randomNum = generateRandom();
       Scanner myScanner = new Scanner(System.in);
       System.out.println("4 digit number, no repeats, no 0 1st digit cuz i dont wanna do strings"); 
        boolean gameOn = true;
        int tries = 0;
        //main game loop
        while(gameOn){
            int guess = myScanner.nextInt();
            int correctPos = correctPos(guess, randomNum);
            int correctNum = correctNum(guess, randomNum);
            boolean stupid = dummyCheck(guess);
            if(stupid == true){
                System.out.println("no");
            }else{
                System.out.println("pos correct = " + correctPos + " num correct = " + correctNum);
            }
                tries ++;
            if(correctPos == 4){
                System.out.println("woo you win");
                System.out.println("it took you " + tries + " tries");
                gameOn = false;
            }
        }
        myScanner.close();
    }
}