public class Motorcycle extends Vehicle {
    private boolean hasSidecar;
    private Engine engine;

    public Motorcycle(String brand, String model, int year, boolean hasSidecar) {
        super(brand, model, year);
        this.hasSidecar = hasSidecar;
        this.engine = new Engine();
    }

    public void start() {
        System.out.println("The motorcycle is on");
        engine.start();
    }

    public void popWheelie() {
        System.out.println("The motorcycle is doing a wheelie");
    }

    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }


    @Override
    public String toString() {
        return "Motorcycle{" +
                "hasSidecar=" + hasSidecar +
                '}' + super.toString();
    }
}
