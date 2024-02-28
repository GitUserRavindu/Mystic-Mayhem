import java.util.HashSet;
import java.util.Scanner;

public class Player {
    private static HashSet<String> usernames = new HashSet<>();
    private String name;
    private String username;
    private float coins;

    public Player () {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter User ID: ");
        username = scanner.nextLine();
        while (usernames.contains(username)) {
            System.out.println("User ID Taken, Please Try Again: ");
            username = scanner.nextLine();
        }     
        usernames.add(username);

        System.out.println("Enter Name: ");
        name = scanner.nextLine();
        scanner.close();

        coins = 500;
    }
}