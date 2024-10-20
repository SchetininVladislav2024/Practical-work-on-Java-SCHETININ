import java.util.Scanner;

public class Job_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the original price: ");
        double originalPrice = scanner.nextDouble();
        System.out.print("Enter the discount percentage: ");
        double discountPercentage = scanner.nextDouble();

        double discountAmount = originalPrice * (discountPercentage / 100);
        double newPrice = originalPrice - discountAmount;

        System.out.printf("The new price after discount is: %.2f%n", newPrice);
    }
}
