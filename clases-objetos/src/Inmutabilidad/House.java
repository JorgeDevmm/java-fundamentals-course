package Inmutabilidad;

public final class House {

    private final int doors;
    private final int windows;
    private final int size;

    public House(int doors, int windows, int size) {
        this.doors = doors;
        this.windows = windows;
        this.size = size;
    }

    public int getDoors() {
        return doors;
    }

    public int getWindows() {
        return windows;
    }

    public int getSize() {
        return size;
    }
}
