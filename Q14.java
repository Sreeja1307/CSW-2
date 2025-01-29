package chapter12;

public class Q14 {

    static class BankAccount {
        double balance;
        double interestRate;

        public BankAccount(double balance) {
            this.balance = balance;
            this.interestRate = 0.05;
        }

        public double calculateInterest() {
            double interest = balance * interestRate;
            double newBalance = balance + interest;
            System.out.println("Standard Bank Account Interest: " + interest);
            System.out.println("New Balance after Interest: " + newBalance);
            return newBalance;
        }
    }

    static class SavingsAccount extends BankAccount {
        public SavingsAccount(double balance) {
            super(balance);
            this.interestRate = 0.08;
        }

        @Override
        public double calculateInterest() {
            double interest = balance * interestRate;
            double newBalance = balance + interest;
            System.out.println("Savings Account Interest: " + interest);
            System.out.println("New Balance after Interest: " + newBalance);
            return newBalance;
        }
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(1000);
        bankAccount.calculateInterest();

        SavingsAccount savingsAccount = new SavingsAccount(1000);
        savingsAccount.calculateInterest();
    }
}
