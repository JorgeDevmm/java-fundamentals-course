package finalProject;
import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {
        /* 1- Usuario: Ingresa edad y 3 calificaciones de un estudiante
           2- Calcular el promedio de las calificaciones
           3 - Evaluar si el estudiante aprobó o no
           a. Criterio aprobación: average >=6.
        * */

        Scanner scanner = new Scanner(System.in);

        int age = 0;
        int grade1 = 0;
        int grade2 = 0;
        int grade3 = 0;
        boolean repeat = true;

        try{

            System.out.println("==========================");
            System.out.println("Ingreso de Notas");
            System.out.println("==========================");


            do {
                System.out.println();
                System.out.println("========================================");
                System.out.println("Ingresar edad mayor a 0 y menor a 100");
                System.out.print("Ingresar edad:");
                age = scanner.nextInt();

                if(age > 0 && age < 100){

                    System.out.println();
                    System.out.println("========================================");
                    System.out.println("Ingresar calificaciones dentro de 0 a 10");

                    System.out.print("Ingresar Calificacion 1:");
                    grade1 = scanner.nextInt();

                    System.out.print("Ingresar Calificacion 2:");
                    grade2 = scanner.nextInt();

                    System.out.print("Ingresar Calificacion 3:");
                    grade3 = scanner.nextInt();

                    if ((grade1 >= 0 && grade1 <= 10) && (grade2 >= 0 && grade2 <= 10) && (grade3 >= 0 && grade3 <= 10)) {
                        double average = (grade1 + grade2 + grade3) / 3.0;

                        if (average >= 6) {
                            System.out.println("El estudiante de: " + age + " de edad aprobo con: " + average);

                            repeat = solicitarRepeticion();
                        } else {
                            System.out.println("El estudiante de: " + age + " de edad desaprobo con: " + average);

                            repeat = solicitarRepeticion();
                        }
                    } else {
                        System.out.println("calificacion ingresadas no validas");
                    }
                }else{
                    System.out.println("Edad no valida");
                }


            } while ((age <= 0 || age >= 100) || (grade1 < 0 || grade1 > 10) || (grade2 < 0 || grade2 > 10) || (grade3 < 0 || grade3 > 10) || (repeat));

        } catch (Exception e) {
            System.out.println("El caracter de uno de los valores solicitados esta considerado como : " + e.getMessage() + " Vuelva ingresar correctamente el valor solicitado");
            e.printStackTrace();
        }
        System.out.println("Programa finalizado");
        scanner.close();
    }

    public static boolean solicitarRepeticion(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("¿Desea ingresar nuevos datos? (1 para si , 0 para no)");
        int option = scanner.nextInt();

        return option == 1;
    }
}
