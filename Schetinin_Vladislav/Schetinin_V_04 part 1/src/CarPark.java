import java.util.ArrayList;
import java.util.List;

class CarPark {
    private List<Car> cars;

    public CarPark() {
        this.cars = new ArrayList<>();
    }

    public void addCar(Car car) {
        cars.add(car);
    }

    public void displayAvailableCars() {
        System.out.println("Доступные автомобили:");
        for (Car car : cars) {
            car.displayInfo();
            System.out.println(); // Пустая строка для удобства
        }
    }
}
