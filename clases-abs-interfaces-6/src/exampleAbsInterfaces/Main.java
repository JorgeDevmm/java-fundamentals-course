package exampleAbsInterfaces;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        //An abstract class can only be instantiated through an anonymous class.
        Vehicle vehicle = new Vehicle("Toyota", "yaris", 2015) {
            @Override
            public void drive() {
                System.out.println("I am driving");
            }
        };

        System.out.println(vehicle.toString());


        System.out.println("=====ENUM=======");

        Vehicle vehicle1 = new ElectricCar("Fiat", "Duna", 2025, Color.RED, VehicleStatus.AVAILABLE, 80);


        System.out.println(vehicle1.toString());

    }
}
