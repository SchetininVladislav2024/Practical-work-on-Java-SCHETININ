abstract class Pet {
    protected String name;
    protected int age;
    protected PetType type;

    public Pet(String name, int age, PetType type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public abstract void displayInfo();

    public String getName() {
        return name;
    }
}
