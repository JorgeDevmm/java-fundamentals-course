package FinalProject;

public class Main {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount("jorge", 500.0);

        System.out.println(bankAccount.toString());

        bankAccount.deposit(0.0);

        bankAccount.withdrawAmount(250.0);

        System.out.println(bankAccount.toString());

    }
}
