public class BankApp {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount(100.0);
        

        System.err.println("----------1st Scene----------");
        try {
            account1.withdraw(300.0);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        account1.deposit(600.0);

        try {
            account1.withdraw(300.0);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Saldo saat ini \t: $" + account1.getBalance());
        System.err.println("");

        BankAccount account2 = new BankAccount(500.0);

        System.err.println("----------2nd Scene----------");
        try {
            account2.withdraw(200.0);
            System.out.println("Saldo saat ini \t: $" + account2.getBalance());
            account2.withdraw(400.0);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
