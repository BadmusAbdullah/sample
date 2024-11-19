
import java.util.Scanner;


public class logicalOperators {
    public static void main(String[] args) {
        int temp = 25;
        if (temp > 30) {
            System.out.println("It is hot today!");
        }
        else if (temp >= 20 && temp <= 30) {
            System.out.println("It is warm outside!");
        }
        else {
            System.out.println("It is cold outside!");
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("You are playing a game. Press Q or q to quit");
        String response = scanner.next();

        /*if (response.equals("q") || response.equals("Q")) {
            *System.out.println("You quit the game!");
            */
        if (!response.equals("q") && !response.equals("Q")) {
            System.out.println("You are still playing the game!");
        } else {
            System.out.println("You quit!");
        }
    }
}
