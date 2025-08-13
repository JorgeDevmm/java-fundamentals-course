package FinalProject;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("Jorge", 1200);
        BankApp bankApp = new BankApp(bankAccount);

        bankApp.start();
    }
}
