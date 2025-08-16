package exampleAbsInterfaces;

public abstract class Vehicle {

    private String brand;
    private String model;
    private int year;
    private Color color;
    private VehicleStatus vehicleStatus;

    public Vehicle(String brand, String model, int year, Color color, VehicleStatus vehicleStatus) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.vehicleStatus = vehicleStatus;
    }

    public Vehicle(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public void stop() {
        System.out.println("Vehicle stop");
    }

    public abstract void drive();

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        int currentValue = java.time.Year.now().getValue(); /*Current Year*/

        if (year < 1886 || year > currentValue + 2) {
            throw new IllegalArgumentException("Invalid Year");
        }
        this.year = year;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", color=" + color +
                ", vehicleStatus=" + vehicleStatus +
                '}';
    }
}