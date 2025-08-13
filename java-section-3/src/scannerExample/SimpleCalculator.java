package scannerExample;


import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Calculator");

        //Number input
        int firstNumber = numberInput(scanner, "Enter the first number:");
        int secondNumber = numberInput(scanner, "Enter the second number");

        System.out.println("================");
        //Compare Number
        System.out.println(compareNumber(firstNumber, secondNumber) + " it is the greater number ");

        //Enter Operation Option
        int operationType = EnterOperationOption(scanner);

        Double result = calculateResult(firstNumber, secondNumber, operationType);

        System.out.println("The Result is: " + result);


    }

    public static Double calculateResult(int firstNumber, int secondNumber, int operation) {

        Double result;

        switch (operation) {
            case 1:
                result = (double) (firstNumber + secondNumber);
                break;
            case 2:
                result = (double) (firstNumber - secondNumber);
                break;
            case 3:
                result = (double) (firstNumber * secondNumber);
                break;
            case 4:
                if (secondNumber == 0) {
                    System.out.println("Cannot divide by zero.");
                    return null;
                }
                result = (double) (firstNumber / secondNumber);
                break;
            default:
                throw new IllegalArgumentException("Invalid operation type");
        }

        return result;
    }

    public static int numberInput(Scanner scanner, String message) {


        int number = 0;
        boolean error = false;

        do {
            System.out.println(message);

            try {
                number = scanner.nextInt();
                error = true;
            } catch (Exception e) {
                System.out.println("Invalid value: " + e.getMessage());
                System.out.println("Please enter a valid integer.");
                scanner.nextLine();
            }

        } while (!error);

        return number;
    }

    public static int EnterOperationOption(Scanner scanner) {

        int operationType = 0;

        do {

            System.out.println("""
                    Choose an operation:
                    1 = Addition
                    2 = Subtraction
                    3 = Multiplication
                    4 = Division
                    
                    """);
            try {
                operationType = scanner.nextInt();

                if (operationType < 1 || operationType > 4) {
                    System.out.println("Enter a number within that range");
                    scanner.nextLine();
                }
            } catch (Exception e) {
                System.out.println("Invalid character");
                scanner.nextLine();
            }


        } while (operationType < 1 || operationType > 4);

        return operationType;
    }

    public static int compareNumber(int firstNumber, int secondNumber) {

        if (firstNumber > secondNumber) {
            return firstNumber;
        } else {
            return secondNumber;
        }
    }
}
