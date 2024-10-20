public class Main {
    public static void main(String[] args) {
        // Создание массива объектов Animal
        Animal[] animals = new Animal[3];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animals[2] = new Dog(); // Можно добавить больше собак или кошек

        // Вызов метода makeSound() для каждого животного
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
}
