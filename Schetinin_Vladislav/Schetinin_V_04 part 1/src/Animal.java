// Базовый класс
abstract class Animal {
    // Абстрактный метод
    public abstract void makeSound();
}

// Подкласс Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Гав!");
    }
}

// Подкласс Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Мяу!");
    }
}
