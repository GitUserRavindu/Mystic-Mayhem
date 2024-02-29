package gameutils;

import java.util.Scanner;

public final class Utils {

    private Utils() {}  // Cannot be Instantiated

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
    
    public static int readInt(String prompt) {
        int input;
        do{
            System.out.println(prompt);
            try{    
                input = Integer.parseInt(scanner.next());
            }
            catch(Exception e) {
                System.out.println("An unexpected error occured, please try again: ");
                input = -1;
            }
        } while (input == -1);
        return input;
    }

    public static void printStringsLineByLine(String[] arr) {
        for (String str : arr) {
            System.out.println(str);
        }
    }

    public static void waitSeconds(int secs) {
        try {
            Thread.sleep(secs*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}