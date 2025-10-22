public class Account_Test {
  public static void main(String[] args) {
    {
    }
    SavingsAccount sa01 = new SavingsAccount();
    sa01.balance = 1000;
    sa01.name = "Adriel";
    sa01.interestRate = 0.02;

    SavingsAccount sa0002 = new SavingsAccount();
    sa0002.balance = 2000;
    sa0002.name = "David";

    sa01.displayCustomer();
    sa0002.displayCustomer();
  }
}
