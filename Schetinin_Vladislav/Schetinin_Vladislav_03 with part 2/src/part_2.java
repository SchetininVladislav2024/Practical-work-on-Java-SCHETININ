import java.util.Scanner;

public class part_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Выберите задачу (1-4) или 0 для выхода:");
            System.out.println("1. Сумма цифр числа");
            System.out.println("2. Факториал числа");
            System.out.println("3. Степень числа");
            System.out.println("4. Числа Фибоначчи");
            System.out.print("Ваш выбор: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите число: ");
                    int num = scanner.nextInt();
                    System.out.println("Сумма цифр числа " + num + ": " + sumDigits(num));
                    break;

                case 2:
                    System.out.print("Введите число для факториала: ");
                    int factNum = scanner.nextInt();
                    System.out.println(factNum + "! = " + factorial(factNum));
                    break;

                case 3:
                    System.out.print("Введите число и степень (через пробел): ");
                    double base = scanner.nextDouble();
                    int exponent = scanner.nextInt();
                    System.out.println(base + " в степени " + exponent + ": " + power(base, exponent));
                    break;

                case 4:
                    System.out.print("Введите n для чисел Фибоначчи: ");
                    int fibNum = scanner.nextInt();
                    System.out.println("Число Фибоначчи для n = " + fibNum + ": " + fibonacci(fibNum));
                    break;

                case 0:
                    System.out.println("Выход из программы.");
                    break;

                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
            }
            System.out.println(); // Для разделения выводов
        } while (choice != 0);

        scanner.close();
    }

    public static int sumDigits(int n) {
        if (n == 0) {
            return 0;
        }
        return n % 10 + sumDigits(n / 10);
    }

    public static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static double power(double a, int n) {
        if (n == 0) {
            return 1;
        }
        return a * power(a, n - 1);
    }

    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
