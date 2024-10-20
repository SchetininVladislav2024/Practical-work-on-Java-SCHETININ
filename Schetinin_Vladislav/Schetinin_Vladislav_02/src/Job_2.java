import java.util.Scanner;

public class Job_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите трехзначное положительное число: ");
        int number = scanner.nextInt();

        if (number >= 100 && number <= 999) {
            int firstDigit = number / 100;
            int lastDigit = number % 10;

            if (firstDigit == lastDigit) {
                System.out.println("Число является симметричным.");
            } else {
                System.out.println("Число не является симметричным.");
            }
        } else {
            System.out.println("Ошибка: введите трехзначное число.");
        }
        scanner.close();
    }
}
