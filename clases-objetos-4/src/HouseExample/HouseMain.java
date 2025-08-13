package HouseExample;

public class HouseMain {

    public static void main(String[] args) {

        House house = new House();
        house.setDoors(2);
        house.setWindows(4);
        house.setSize(10);

        System.out.println("El número de puertas es: " + house.getDoors() +
                "\nEl numero de ventanas es: " + house.getWindows() +
                "\nEl número de tamaño es: " + house.getSize());

        double finalArea = house.calculateArea();
        house.openDoor();
        house.showArea(finalArea);

        System.out.println("==============");

        House house2 = new House(4,6,20);


        double finalArea2 = house2.calculateArea();
        house2.openDoor();
        house2.showArea(finalArea2);



    }
}
