import java.util.*;

// Главный класс
public class Praktika7 {

    public static void main(String[] args) {
        Cafe cafe = new Cafe();

        // Добавляем несколько блюд в меню
        cafe.addMenuItem(new MenuItem("Кофе", 950.0, "Напитки"));
        cafe.addMenuItem(new MenuItem("Сэндвич", 1900.0, "Еда"));
        cafe.addMenuItem(new MenuItem("Чизкейк", 1230.0, "Десерт"));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Добро пожаловать в кафе!");

        // Ввод данных клиента
        System.out.print("Введите имя клиента: ");
        String name = scanner.nextLine();
        System.out.print("Введите телефон клиента: ");
        String phone = scanner.nextLine();
        Customer customer = new Customer(name, phone);

        // Список для хранения выбранных блюд
        List<MenuItem> orderItems = new ArrayList<>();
        boolean ordering = true;

        // Процесс заказа
        while (ordering) {
            System.out.println("\nМеню:");
            for (MenuItem item : cafe.getMenuItems()) {
                System.out.println(item);
            }
            System.out.print("Введите название блюда для добавления в заказ (или 'готово' для завершения): ");
            String itemName = scanner.nextLine();

            if (itemName.equalsIgnoreCase("готово")) {
                ordering = false;
            } else {
                for (MenuItem item : cafe.getMenuItems()) {
                    if (item.getName().equalsIgnoreCase(itemName)) {
                        orderItems.add(item);
                        System.out.println(itemName + " добавлен в заказ.");
                        break;
                    }
                }
            }
        }

        // Создание заказа
        Order order = cafe.createOrder(customer, orderItems);

        // Вывод заказа
        System.out.println("\nID заказа: " + order.getOrderId());
        System.out.println("Заказанные блюда:");
        for (MenuItem item : order.getItems()) {
            System.out.println(item);
        }
        System.out.printf("Общая стоимость (тг): %.2f%n", order.getTotalPrice());

        scanner.close();
    }

    // Класс MenuItem
    static class MenuItem {
        private String name;
        private double price;
        private String category;

        public MenuItem(String name, double price, String category) {
            this.name = name;
            this.price = price;
            this.category = category;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

        public String getCategory() {
            return category;
        }

        @Override
        public String toString() {
            return name + " - " + price + " тг";
        }
    }

    // Класс Order
    static class Order {
        private static int orderCounter = 1;
        private int orderId;
        private List<MenuItem> items;

        public Order(List<MenuItem> items) {
            this.orderId = orderCounter++;
            this.items = items;
        }

        public int getOrderId() {
            return orderId;
        }

        public List<MenuItem> getItems() {
            return items;
        }

        public double getTotalPrice() {
            return items.stream().mapToDouble(MenuItem::getPrice).sum();
        }
    }

    // Класс Customer
    static class Customer {
        private String name;
        private String phone;
        private List<Order> orderHistory;

        public Customer(String name, String phone) {
            this.name = name;
            this.phone = phone;
            this.orderHistory = new ArrayList<>();
        }

        public String getName() {
            return name;
        }

        public String getPhone() {
            return phone;
        }

        public List<Order> getOrderHistory() {
            return orderHistory;
        }

        public void addOrder(Order order) {
            orderHistory.add(order);
        }
    }

    // Интерфейс ICafe
    interface ICafe {
        void addMenuItem(MenuItem item);
        void removeMenuItem(String name);
        List<MenuItem> getMenuItems();
        Order createOrder(Customer customer, List<MenuItem> items);
    }

    // Класс Cafe, реализующий интерфейс ICafe
    static class Cafe implements ICafe {
        private List<MenuItem> menu;
        private Map<Integer, Customer> customers;

        public Cafe() {
            menu = new ArrayList<>();
            customers = new HashMap<>();
        }

        @Override
        public void addMenuItem(MenuItem item) {
            menu.add(item);
            System.out.println(item.getName() + " добавлен в меню.");
        }

        @Override
        public void removeMenuItem(String name) {
            menu.removeIf(item -> item.getName().equalsIgnoreCase(name));
            System.out.println("Блюдо с именем " + name + " удалено из меню.");
        }

        @Override
        public List<MenuItem> getMenuItems() {
            return menu;
        }

        @Override
        public Order createOrder(Customer customer, List<MenuItem> items) {
            Order order = new Order(items);
            customer.addOrder(order);
            System.out.println("Заказ с ID " + order.getOrderId() + " создан.");
            return order;
        }

        public void addCustomer(int id, Customer customer) {
            customers.put(id, customer);
        }

        public Customer getCustomer(int id) {
            return customers.get(id);
        }
    }
}
