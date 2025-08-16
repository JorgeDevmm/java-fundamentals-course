package exampleAbsInterfaces;

public class ElectricCar extends Vehicle implements Electric, SeltfDriving {

    private int batterLevel;

    public ElectricCar(String brand, String model, int year, Color color, VehicleStatus vehicleStatus, int batterLevel) {
        super(brand, model, year, color, vehicleStatus);
        this.batterLevel = batterLevel;
    }

    public ElectricCar(String brand, String model, int year, int batterLevel) {
        super(brand, model, year);
        this.batterLevel = batterLevel;
    }

    @Override
    public void drive() {
        System.out.println("The electric car is running");
    }

    @Override
    public void chargeBattery() {
        batterLevel = MAX_BATTERY_CAPACITY;

        System.out.println("the battery is full charged");
    }

    @Override
    public void activateAutopilot() {
        System.out.println("Autopilot mode activated");
    }

    @Override
    public String toString() {
        return "ElectricCar{" +
                "batterLevel=" + batterLevel +
                '}' + super.toString();
    }
}
