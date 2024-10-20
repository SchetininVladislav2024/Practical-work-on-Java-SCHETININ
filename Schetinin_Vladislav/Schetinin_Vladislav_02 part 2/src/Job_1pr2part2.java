import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Job_1pr2part2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите текст: ");
        String text = scanner.nextLine();

        // 1. Разделение текста на слова и подсчет количества слов
        String[] words = text.split("\\s+"); // Разделяем по пробелам
        int wordCount = words.length;
        System.out.println("Количество слов: " + wordCount);

        // 2. Нахождение самого длинного слова
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Самое длинное слово: " + longestWord);

        // 3. Подсчет частоты символов
        HashMap<Character, Integer> charFrequency = new HashMap<>();
        for (char c : text.toCharArray()) {
            char lowerChar = Character.toLowerCase(c); // Приводим к нижнему регистру
            if (Character.isLetter(lowerChar)) { // Учитываем только буквы
                charFrequency.put(lowerChar, charFrequency.getOrDefault(lowerChar, 0) + 1);
            }
        }

        System.out.println("Частота символов:");
        for (Map.Entry<Character, Integer> entry : charFrequency.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        // 4. Вывод текста в обратном порядке
        StringBuilder reversedText = new StringBuilder(text);
        reversedText.reverse();
        System.out.println("Текст в обратном порядке: " + reversedText);

        scanner.close();
    }
}
