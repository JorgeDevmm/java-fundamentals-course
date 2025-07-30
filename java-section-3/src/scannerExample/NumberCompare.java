package scannerExample;

import java.util.Scanner;

public class NumberCompare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //Ingresar numero entero desde el teclado

        try {
            System.out.println("Ingrese el primer Numero: ");
            int firstNumber = scanner.nextInt();

            System.out.println("Ingrese el Segundo Numero: ");
            int secondNumber = scanner.nextInt();


            int sum = firstNumber + secondNumber;
            int difference = firstNumber - secondNumber;
            System.out.println("La suma de a + b = " + (sum));
            System.out.println("La diferencia de a - b = " + (difference));

            String mensaje =
                    (firstNumber > secondNumber) ? "El primer número es mayor" : "El segundo número es mayor";

            System.out.println(mensaje);

            System.out.println("Fin de la aplicación");

            scanner.close();
        } catch (Exception e) {
            System.out.printf("error por caracter no valido en: " + e);
        }


    }
}
