public class SavingsAccount2 {
    public double balance;
    public String name;
    public double interestRate = 0.04;

    public void displayCustomer() {
        System.out.println("Customer Name: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("-------------------------");
    }

}
