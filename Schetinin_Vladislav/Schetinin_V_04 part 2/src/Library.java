import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books;

    // Конструктор
    public Library() {
        this.books = new ArrayList<>();
    }

    // Метод для добавления книги в библиотеку
    public void addBook(Book book) {
        books.add(book);
    }

    // Метод для вывода информации о всех доступных книгах
    public void displayAvailableBooks() {
        System.out.println("Доступные книги:");
        for (Book book : books) {
            book.displayInfo();
            System.out.println(); // Пустая строка для удобства
        }
    }
}
