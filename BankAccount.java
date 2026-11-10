package bankaccounthomework;

public class BankAccount {

    private String accountHolder;
    private int accountNumber;
    private double balance;

    public BankAccount(String accountHolder, int accountNumber, double balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance = balance - amount;
        }
    }

    public double calculateInterest(double annualRate) {
        return balance * annualRate / 100;
    }

    public void displayAccountInfo(double interest) {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: " + balance);
        System.out.println("Annual Interest: " + interest);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("Saleh Alzamly", 12345, 1500.0);

        account.deposit(300.0);
        account.withdraw(250.0);

        double interest = account.calculateInterest(4.0);

        account.displayAccountInfo(interest);
    }
}
