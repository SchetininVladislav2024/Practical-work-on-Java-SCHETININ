class Product {
    private String name;
    private int quantity;
    private double price;

    // Конструктор
    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Метод для увеличения количества товара
    public void increaseQuantity(int amount) {
        if (amount > 0) {
            quantity += amount;
            System.out.println("Количество товара увеличено на " + amount);
        } else {
            System.out.println("Количество должно быть положительным.");
        }
    }

    // Метод для уменьшения количества товара
    public void decreaseQuantity(int amount) {
        if (amount > 0 && amount <= quantity) {
            quantity -= amount;
            System.out.println("Количество товара уменьшено на " + amount);
        } else {
            System.out.println("Недостаточно товара на складе или неверное количество.");
        }
    }

    // Метод для изменения цены
    public void changePrice(double newPrice) {
        if (newPrice >= 0) {
            price = newPrice;
            System.out.println("Цена изменена на " + newPrice);
        } else {
            System.out.println("Цена не может быть отрицательной.");
        }
    }

    // Метод для вывода информации о продукте
    public void displayInfo() {
        System.out.println("Продукт: " + name + ", Количество: " + quantity + ", Цена: " + price + " руб.");
    }

    public static void main(String[] args) {
        // Создание объекта класса Product
        Product product = new Product("Яблоки", 100, 50.0);

        // Вывод информации о продукте
        product.displayInfo();

        // Увеличение и уменьшение количества товара
        product.increaseQuantity(20);
        product.decreaseQuantity(30);
        product.decreaseQuantity(100); // Пример ошибки

        // Изменение цены
        product.changePrice(55.0);

        // Вывод обновленной информации о продукте
        product.displayInfo();
    }
}
