package HouseExample;

public class House {

    private int doors;
    private int windows;
    private double size;

    public House() {
    }

    public House(int doors, int windows, double size) {
        this.doors = doors;
        this.windows = windows;
        this.size = size;
    }

    public int getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getWindows() {
        return windows;
    }

    public void setWindows(int windows) {
        this.windows = windows;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    void openDoor(){
        System.out.println("La puerta esta abierta");
    }

    double calculateArea(){
        return size*size;
    }

    void showArea(double finalArea){
        System.out.println("El Area calculada es : " + finalArea);
    }
}
