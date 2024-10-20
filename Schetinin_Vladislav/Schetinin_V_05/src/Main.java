public class Main {
    public static void main(String[] args) {
        PetClinic clinic = new PetClinic();
        try {
            Dog dog1 = new Dog("Бобик", 3, "Шершавая");
            Cat cat1 = new Cat("Мурка", 2, "Черный");
            clinic.addPet(dog1);
            clinic.addPet(cat1);
            // Попытка добавить питомца с уже существующим именем
            Dog dog2 = new Dog("Бобик", 5, "Лабрадор");
            clinic.addPet(dog2); // вызовет исключение
            Cat cat2 = new Cat("Гарри", 2, "Рыжий");
            clinic.addPet(cat2);
            clinic.displayPets();
        } catch (Exception e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }
}
