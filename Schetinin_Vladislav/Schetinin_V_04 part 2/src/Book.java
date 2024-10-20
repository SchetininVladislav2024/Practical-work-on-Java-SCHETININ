class Book {
    private String title;
    private String author;
    private boolean isCheckedOut;

    // Конструктор
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isCheckedOut = false;
    }

    // Метод для изменения статуса книги на "на руках"
    public void checkout() {
        isCheckedOut = true;
    }

    // Метод для изменения статуса книги на "доступна"
    public void checkin() {
        isCheckedOut = false;
    }

    // Метод для вывода информации о книге
    public void displayInfo() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Доступна: " + (isCheckedOut ? "Нет" : "Да"));
    }

    // Метод для проверки статуса книги
    public boolean isCheckedOut() {
        return isCheckedOut;
    }
}
