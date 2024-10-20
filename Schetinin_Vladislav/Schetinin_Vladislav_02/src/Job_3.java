import java.util.Scanner;

public class Job_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите целое число: ");
        int intValue = scanner.nextInt();

        if (intValue % 2 == 0) {
            System.out.print("Введите дробное число: ");
            double doubleValue = scanner.nextDouble();
            double product = intValue * doubleValue;
            System.out.println("Произведение: " + product);
        } else {
            System.out.print("Введите другое целое число: ");
            int anotherIntValue = scanner.nextInt();
            int sum = intValue + anotherIntValue;
            System.out.println("Сумма: " + sum);
        }
        scanner.close();
    }
}
