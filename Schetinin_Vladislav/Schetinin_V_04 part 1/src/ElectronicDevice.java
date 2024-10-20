class ElectronicDevice {
    private String brand;
    private String model;
    private double price;

    // Конструктор
    public ElectronicDevice(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    // Метод для вывода информации о устройстве
    public void displayInfo() {
        System.out.println("Бренд: " + brand + ", Модель: " + model + ", Цена: " + price + " руб.");
    }
}

class Smartphone extends ElectronicDevice {
    private String operatingSystem;

    // Конструктор
    public Smartphone(String brand, String model, double price, String operatingSystem) {
        super(brand, model, price); // Вызов конструктора родительского класса
        this.operatingSystem = operatingSystem;
    }

    // Переопределение метода для вывода информации о смартфоне
    @Override
    public void displayInfo() {
        super.displayInfo(); // Вывод информации о родительском классе
        System.out.println("Операционная система: " + operatingSystem);
    }

    public static void main(String[] args) {
        // Создание объекта класса Smartphone
        Smartphone smartphone = new Smartphone("Apple", "iPhone 14", 79999, "iOS");

        // Вывод информации о смартфоне
        smartphone.displayInfo();
    }
}
