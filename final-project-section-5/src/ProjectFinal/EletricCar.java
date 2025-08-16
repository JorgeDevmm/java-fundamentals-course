package ProjectFinal;

public class EletricCar extends Car implements Electric {

    private int batteryLevel;

    public EletricCar(String brand, String model, int year, CarType type, int batteryLevel) {
        super(brand, model, year, type);
        this.batteryLevel = batteryLevel;
    }

    @Override
    public void start() {
        System.out.println("The electric car is on");
    }

    @Override
    public void chargeBattery() {
        batteryLevel = 100;

        System.out.println("The battery is 100% charged");
    }

    @Override
    public String toString() {
        return "EletricCar{" +
                "batteryLevel=" + batteryLevel +
                '}' + super.toString();
    }
}
