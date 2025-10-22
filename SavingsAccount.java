
public class SavingsAccount {
    public double balance;
    public String name;
    public double interestRate;

    public double calculateInterest() {
        return balance * interestRate / 11;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void displayCustomer() {
        System.out.println("Customer Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("-------------------------");

    }

}
