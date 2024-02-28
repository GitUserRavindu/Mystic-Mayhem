package gameutils;

import java.util.Scanner;

public class Utils {

    static Scanner scanner = new Scanner (System.in);
    
    public static String readString(String prompt) {
        String input;
        do{
            System.out.println(prompt);
            try{    
                input = scanner.next();
            }
            catch(Exception e) {
                System.out.println("An unexpected error occured, please try again: ");
                input = null;
            }
        } while (input == null);
        return input;
    }

    public static void waitSeconds(int secs) {
        try {
            Thread.sleep(secs*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}