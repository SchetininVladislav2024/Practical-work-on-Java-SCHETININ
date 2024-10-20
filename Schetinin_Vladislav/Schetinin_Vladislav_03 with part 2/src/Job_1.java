import java.util.Scanner;

public class Job_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Выберите задачу (1-6) или 0 для выхода:");
            System.out.println("1. Сумма двух чисел");
            System.out.println("2. Приветствие");
            System.out.println("3. Нахождение максимального элемента массива");
            System.out.println("4. Проверка четности числа");
            System.out.println("5. Среднее арифметическое");
            System.out.println("6. Перегрузка метода умножения");
            System.out.print("Ваш выбор: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введите первое число: ");
                    int a = scanner.nextInt();
                    System.out.print("Введите второе число: ");
                    int b = scanner.nextInt();
                    System.out.println("Сумма: " + sum(a, b));
                    break;

                case 2:
                    System.out.print("Введите ваше имя: ");
                    String name = scanner.next();
                    printGreeting(name);
                    break;

                case 3:
                    System.out.print("Введите количество элементов массива: ");
                    int size = scanner.nextInt();
                    int[] numbers = new int[size];
                    System.out.println("Введите элементы массива:");
                    for (int i = 0; i < size; i++) {
                        numbers[i] = scanner.nextInt();
                    }
                    System.out.println("Максимальный элемент: " + findMax(numbers));
                    break;

                case 4:
                    System.out.print("Введите число: ");
                    int number = scanner.nextInt();
                    System.out.println(number + " четное? " + isEven(number));
                    break;

                case 5:
                    System.out.print("Введите три числа: ");
                    double num1 = scanner.nextDouble();
                    double num2 = scanner.nextDouble();
                    double num3 = scanner.nextDouble();
                    System.out.println("Среднее арифметическое: " + calculateAverage(num1, num2, num3));
                    break;

                case 6:
                    System.out.print("Введите два числа для умножения: ");
                    int x = scanner.nextInt();
                    int y = scanner.nextInt();
                    System.out.println("Произведение двух чисел: " + multiply(x, y));
                    System.out.print("Введите третье число для умножения: ");
                    int z = scanner.nextInt();
                    System.out.println("Произведение трех чисел: " + multiply(x, y, z));
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

    public static int sum(int a, int b) {
        return a + b;
    }

    public static void printGreeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static double calculateAverage(double a, double b, double c) {
        return (a + b + c) / 3;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }
}
