class Book {
    private String title;
    private String author;
    private double price;

    // Конструктор
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // Геттеры
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    // Метод для вывода информации о книге
    public void displayInfo() {
        System.out.println("Название: " + title + ", Автор: " + author + ", Цена: " + price + " руб.");
    }

    public static void main(String[] args) {
        // Создание объектов класса Book
        Book book1 = new Book("1984", "Джордж Оруэлл", 500);
        Book book2 = new Book("Убить пересмешника", "Харпер Ли", 450);
        Book book3 = new Book("Великий Гэтсби", "Фрэнсис Скотт Фицджеральд", 400);

        // Вывод информации о каждой книге
        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
    }
}
