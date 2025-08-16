package ProjectFinal;

public class Main {
    public static void main(String[] args) {

        Vehicle car = new Car("Toyota", "Yaris", 2015, CarType.SPORTS);
        Vehicle electricCar = new EletricCar("Nissan", "Sedano", 2020, CarType.TRUCK, 80);

        car.start();
        System.out.println(car.toString());
        electricCar.start();
        ((Electric)electricCar).chargeBattery();
        System.out.println(electricCar.toString());
    }
}
