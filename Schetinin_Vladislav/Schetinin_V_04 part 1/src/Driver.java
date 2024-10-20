class Driver {
    private String name;
    private Car rentedCar;

    public Driver(String name) {
        this.name = name;
        this.rentedCar = null;
    }

    public void rentCar(Car car) {
        if (!car.isRented()) {
            rentedCar = car;
            car.rent();
        } else {
            System.out.println("Автомобиль уже арендован.");
        }
    }

    public void returnCar() {
        if (rentedCar != null) {
            rentedCar.returnCar();
            rentedCar = null;
        } else {
            System.out.println("Нет арендованного автомобиля для возврата.");
        }
    }

    public void displayInfo() {
        System.out.println("Водитель: " + name);
        System.out.println("Арендованный автомобиль:");
        if (rentedCar != null) {
            rentedCar.displayInfo();
        } else {
            System.out.println("Нет арендованного автомобиля.");
        }
    }
}
