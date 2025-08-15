public class Engine {

    public void start() {
        System.out.println("Engine On");
    }

    //   Polymorphism reference
    public void start(boolean silentMode) {
        if (silentMode) {
            System.out.println("It is on in silent mode");
        } else {
            System.out.println("Vehicle On");
        }
    }
}
