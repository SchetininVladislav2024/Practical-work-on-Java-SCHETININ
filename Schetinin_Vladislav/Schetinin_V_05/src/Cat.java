class Cat extends Pet {
    private String color;

    public Cat(String name, int age, String color) {
        super(name, age, PetType.CAT);
        this.color = color;
    }

    @Override
    public void displayInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age + ", Тип: " + type);
        System.out.println("Цвет: " + color);
    }
}
