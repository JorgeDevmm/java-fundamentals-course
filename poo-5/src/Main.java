import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

//        Vehicle vehicle = new Vehicle("Toyota", "Yaris", 2015);
//
//        vehicle.setYear(1887);
//
//        System.out.println("The Year is :" + vehicle.getYear());

        Vehicle car = new Car("Hiundai", "Tucson", 2011, 4);
        car.start();

        //Cast
        ((Car)car).setDoors(5);

        printVehicle(car);

        Motorcycle moto = new Motorcycle("Honda", "Twister", 2015, true);
        moto.start();

        printVehicle(moto);

    }

    public static void printVehicle(Vehicle vehicle) {
        System.out.println(vehicle.toString());
    }

}