import java.util.ArrayList;
import java.util.List;

class Reader {
    private String name;
    private List<Book> checkedOutBooks;

    // Конструктор
    public Reader(String name) {
        this.name = name;
        this.checkedOutBooks = new ArrayList<>();
    }

    // Метод для добавления книги в список и изменения её статуса
    public void checkoutBook(Book book) {
        if (!book.isCheckedOut()) {
            checkedOutBooks.add(book);
            book.checkout();
        } else {
            System.out.println("Книга уже на руках.");
        }
    }

    // Метод для удаления книги из списка и изменения её статуса
    public void checkinBook(Book book) {
        if (checkedOutBooks.remove(book)) {
            book.checkin();
        } else {
            System.out.println("Эта книга не находится на руках у читателя.");
        }
    }

    // Метод для вывода информации о читателе и его книгах
    public void displayInfo() {
        System.out.println("Читатель: " + name);
        System.out.println("Книги на руках:");
        for (Book book : checkedOutBooks) {
            book.displayInfo();
        }
    }
}
