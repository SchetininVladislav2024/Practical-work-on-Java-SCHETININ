class Car {
    private String licensePlate;
    private String model;
    private boolean isRented;

    public Car(String licensePlate, String model) {
        this.licensePlate = licensePlate;
        this.model = model;
        this.isRented = false;
    }

    public void rent() {
        isRented = true;
    }

    public void returnCar() {
        isRented = false;
    }

    public void displayInfo() {
        System.out.println("Модель: " + model);
        System.out.println("Номерной знак: " + licensePlate);
        System.out.println("Доступен: " + (isRented ? "Нет" : "Да"));
    }

    public boolean isRented() {
        return isRented;
    }
}
