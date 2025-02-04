package StringBuilder.Problem1;

// MainClass.java (Main Method)
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        StringReverser reverser = new StringReverser();
        String reversed = reverser.reverse(input);

        System.out.println("Reversed String: " + reversed);

        scanner.close();
    }
}
