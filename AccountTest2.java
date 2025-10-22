public class AccountTest2 {
    public static void main(String[] args) {

        SavingsAccount sa01 = new SavingsAccount();
        sa01.balance = 1000;
        sa01.name = "Adriel";
        sa01.interestRate = 0.02;

        SavingsAccount sa02 = new SavingsAccount();
        sa02.balance = 2000;
        sa02.name = "David";

        sa01.displayCustomer();
        sa02.displayCustomer();

    }
}
