import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Scans the user input.
        Scanner scanner = new Scanner(System.in);

        // Scans in degree Celsius.
        int celsius = scanner.nextInt();

        // Converts the Celsius to Fahrenheit.
        System.out.println(9 * celsius / 5F + 32);
    }
}