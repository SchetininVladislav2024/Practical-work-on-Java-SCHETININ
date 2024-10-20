class Dog extends Pet {
    private String breed;

    public Dog(String name, int age, String breed) {
        super(name, age, PetType.DOG);
        this.breed = breed;
    }

    @Override
    public void displayInfo() {
        System.out.println("Имя: " + name + ", Возраст: " + age + ", Тип: " + type);
        System.out.println("Порода: " + breed);
    }
}
