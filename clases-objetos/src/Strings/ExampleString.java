package Strings;

public class ExampleString {

    public static void main(String[] args) {
        String name = "Jorge";
        String name2 = "Jorge";

        System.out.println(name == name2);

        String name3 = new String("Jorge");

        System.out.println(name3 == name);

        System.out.println(name.toUpperCase());

        System.out.println(name);

        System.out.println("===================");
        Person person = new Person("Jorge","Monzon");

        System.out.println(person.getName());
        System.out.println(person.getLastname());


        String message = person.toString();
        System.out.println(message);

    }
}