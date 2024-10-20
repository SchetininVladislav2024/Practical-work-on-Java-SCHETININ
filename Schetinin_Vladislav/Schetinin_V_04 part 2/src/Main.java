public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        Book book1 = new Book("1984", "Джордж Оруэлл");
        Book book2 = new Book("Гарри Поттер", "Джоан Роулинг");

        library.addBook(book1);
        library.addBook(book2);

        Reader reader = new Reader("Жанибек");

        library.displayAvailableBooks();
        reader.checkoutBook(book1);
        reader.displayInfo();
        library.displayAvailableBooks();
    }
}
