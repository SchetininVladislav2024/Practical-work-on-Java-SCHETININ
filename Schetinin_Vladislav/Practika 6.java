import java.util.*;

// Класс Task
class Task {
    private int id; // уникальный идентификатор задачи
    private String description; // описание задачи
    private String category; // категория задачи
    private boolean isDone; // статус выполнения
    private Date creationDate; // дата создания задачи

    // Конструктор
    public Task(int id, String description, String category, boolean isDone) {
        this.id = id;
        this.description = description;
        this.category = category;
        this.isDone = isDone;
        this.creationDate = new Date(); // текущая дата
    }

    // Геттеры и сеттеры
    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public boolean isDone() {
        return isDone;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    // Метод для отображения задачи
    @Override
    public String toString() {
        return String.format("%d. %s (Категория: %s, Статус: %s)",
                id, description, category, isDone ? "Выполнено" : "Не выполнено");
    }

    // Метод для отметки задачи как выполненной
    public void markAsDone() {
        this.isDone = true;
    }
}

// Класс TodoList
class TodoList {
    private List<Task> tasks; // список всех задач
    private Set<String> categories; // множество уникальных категорий
    private Map<String, List<Task>> tasksByCategory; // задачи, сгруппированные по категориям

    public TodoList() {
        tasks = new ArrayList<>();
        categories = new HashSet<>();
        tasksByCategory = new HashMap<>();
    }

    // Метод для добавления задачи
    public void addTask(Task task) {
        tasks.add(task);
        categories.add(task.getCategory()); // добавляем категорию в множество
        tasksByCategory.computeIfAbsent(task.getCategory(), k -> new ArrayList<>()).add(task); // добавляем задачу в Map
        System.out.println("Задача \"" + task.getDescription() + "\" добавлена.");
    }

    // Метод для удаления задачи по ID
    public void removeTask(int id) {
        Iterator<Task> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.getId() == id) {
                iterator.remove();
                tasksByCategory.get(task.getCategory()).remove(task); // удаляем из категории
                System.out.println("Задача \"" + task.getDescription() + "\" удалена.");
                return;
            }
        }
        System.out.println("Задача с ID " + id + " не найдена.");
    }

    // Метод для пометки задачи как выполненной
    public void markTaskAsDone(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.markAsDone();
                System.out.println("Задача \"" + task.getDescription() + "\" отмечена как выполненная.");
                return;
            }
        }
        System.out.println("Задача с ID " + id + " не найдена.");
    }

    // Метод для поиска задач по ключевым словам
    public void searchTasks(String keyword) {
        boolean found = false;
        for (Task task : tasks) {
            if (task.getDescription().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Найдена задача: " + task);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Задачи, содержащие слово \"" + keyword + "\", не найдены.");
        }
    }

    // Метод для вывода всех задач
    public void displayAllTasks() {
        System.out.println("=== Вывод всех задач ===");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }

    // Метод для вывода задач по категориям
    public void displayTasksByCategory() {
        System.out.println("=== Вывод задач по категориям ===");
        for (String category : categories) {
            System.out.println("Категория: " + category);
            for (Task task : tasksByCategory.get(category)) {
                System.out.println("- " + task);
            }
        }
    }

    // Метод для вывода уникальных категорий
    public void displayCategories() {
        System.out.println("=== Уникальные категории ===");
        for (String category : categories) {
            System.out.println(category);
        }
    }

    // Метод для вывода статистики по задачам
    public void displayStatistics() {
        int completed = 0;
        int notCompleted = 0;
        for (Task task : tasks) {
            if (task.isDone()) {
                completed++;
            } else {
                notCompleted++;
            }
        }
        System.out.println("=== Статистика ===");
        System.out.println("Всего задач: " + tasks.size());
        System.out.println("Выполнено: " + completed);
        System.out.println("Не выполнено: " + notCompleted);
    }
}

// Главный класс Main
public class Main {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();

        // Добавление задач
        todoList.addTask(new Task(1, "Купить молоко", "Покупки", false));
        todoList.addTask(new Task(2, "Позвонить маме", "Личное", false));
        todoList.addTask(new Task(3, "Подготовить отчет", "Работа", false));

        // Вывод всех задач
        todoList.displayAllTasks();

        // Отметка задачи как выполненной
        todoList.markTaskAsDone(1);

        // Поиск задачи по ключевому слову
        todoList.searchTasks("отчет");

        // Вывод задач по категориям
        todoList.displayTasksByCategory();

        // Вывод статистики
        todoList.displayStatistics();

        // Добавление новой задачи
        todoList.addTask(new Task(4, "Сходить в спортзал", "Здоровье", false));

        // Обновленный список задач
        todoList.displayAllTasks();

        // Удаление задачи
        todoList.removeTask(2);

        // Финальный список задач
        todoList.displayAllTasks();

        // Обновленная статистика
        todoList.displayStatistics();
    }
}
