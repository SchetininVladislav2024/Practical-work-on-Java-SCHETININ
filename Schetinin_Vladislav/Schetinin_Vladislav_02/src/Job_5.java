import java.util.Scanner;

public class Job_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите положительное число x: ");
        int x = scanner.nextInt();

        if (x > 0) {
            for (int i = x - 1; i > -1; i--) {
                System.out.print(i + " ");
            }
            for (int i = 1; i < x; i++) {
                System.out.print(i + " ");
            }
            System.out.println(); // Для новой строки
        } else {
            System.out.println("Ошибка: введите положительное число.");
        }
        scanner.close();
    }
}
