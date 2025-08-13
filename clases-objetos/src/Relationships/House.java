package Relationships;

public class House {

    /*Attributes are created with the classes that are defined*/
    private Room room;//Composition
    private Door door;//Composition
    private Owner owner;//Association

    public House(Room room, Door door, Owner owner) {
        this.room = room;
        this.door = door;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "House{" +
                "room=" + room +
                ", door=" + door +
                ", owner=" + owner +
                '}';
    }
}
