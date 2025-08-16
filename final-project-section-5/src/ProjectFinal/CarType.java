package ProjectFinal;

public enum CarType {
    SEDAN("A passenger car with four doors and a separate trunk"),
    TRUCK("A motor vehicle designed to carry cargo or perform heavy-duty tasks"),
    SPORTS("A high-performance vehicle built for speed and agile handling.");

    private final String description;

    CarType(String description) {
        this.description = description;
    }


    public String getDescription() {
        return description;
    }
}
