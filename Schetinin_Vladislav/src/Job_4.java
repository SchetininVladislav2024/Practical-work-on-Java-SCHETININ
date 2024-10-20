import java.util.Scanner;

public class Job_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        int celsius = scanner.nextInt();

        double fahrenheit = (celsius * 9.0 / 5) + 32;

        System.out.printf("Temperature in Fahrenheit: %.2f%n", fahrenheit);
    }
}
