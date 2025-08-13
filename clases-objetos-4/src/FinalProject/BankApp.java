package FinalProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class BankApp {

    private BankAccount account;
    private Scanner scanner;

    public BankApp(BankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        int option;
        do {
            displayMenu();
            option = getUserOption();
            processOption(option);

        } while (option != 4);
    }

    private void displayMenu() {
        System.out.println("\nOptions Select");
        System.out.println("1 - Deposit Money");
        System.out.println("2 - Withdraw Money");
        System.out.println("3 - Display Balance");
        System.out.println("4 - Exit");
    }

    private int getUserOption() {
        int option = 0;
        try {
            option = scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid option, please enter a correct number");
            scanner.nextLine();
        }

        return option;
    }

    private void handleDeposit() {
        try {
            System.out.println("Enter amount to deposit");
            double amount = scanner.nextDouble();
            account.deposit(amount);
        } catch (InputMismatchException e) {
            System.out.println("Enter a valid numeric value");
            scanner.nextLine();
        }

    }

    private void handleWithdrawal() {

        try {
            System.out.println("Enter amount to withdraw");
            double amount = scanner.nextDouble();
            account.withdrawAmount(amount);

        } catch (InputMismatchException e) {
            System.out.println("Enter a valid numeric value");
            scanner.nextLine();
        }
    }

    private void processOption(int option) {
        switch (option) {
            case 1: {
                handleDeposit();
                break;
            }
            case 2: {
                handleWithdrawal();
                break;
            }
            case 3: {
                System.out.println(account.displayBalance());
                break;
            }
            case 4: {
                System.out.println("Program Completed");
                break;
            }
            default:
                System.out.println("Invalid option");
        }
    }
}
