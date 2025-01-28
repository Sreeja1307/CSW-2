package newproject;

class BankAccount1 {
    
    private int accountNumber;
    private String accountHolderName;
    private double balance;
    
    BankAccount1(int accountNum, String accountName, double amount) {
        this.accountNumber = accountNum;
        this.accountHolderName = accountName;
        this.balance = amount;
    }
    
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount + ". New balance: " + balance);
        } else {
            System.out.println("Please do not enter negative amount");
        }
    }
    
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Your balance is: " + balance);
        } else {
            balance -= amount;
            System.out.println("Withdrew: " + amount + ". New balance: " + balance);
        }
    }
    
    public void checkBalance() {
        System.out.println("Account balance: " + balance);
    }
}

public class BankAccount {

    public static void main(String[] args) {
        
        BankAccount1 account = new BankAccount1(19691, "Sreeja Swayamsiddha", 500000);
       
        account.checkBalance();
       
        account.deposit(500.00);
  
        account.withdraw(300.00);
        
        account.checkBalance();
        
        account.withdraw(700.00);
       
        account.deposit(-50.00);
    }
}
