package constructor;

//Problem 3: Bank Account Management
public class constructor6 {
 static class BankAccount {
     public int accountNumber;
     protected String accountHolder;
     private double balance;

     public BankAccount(int accountNumber, String accountHolder, double balance) {
         this.accountNumber = accountNumber;
         this.accountHolder = accountHolder;
         this.balance = balance;
     }

     public double getBalance() {
         return balance;
     }

     public void setBalance(double balance) {
         this.balance = balance;
     }
 }

 static class SavingsAccount extends BankAccount {
     private double interestRate;

     public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
         super(accountNumber, accountHolder, balance);
         this.interestRate = interestRate;
     }

     public void displayAccountDetails() {
         System.out.println("Account Number: " + accountNumber + ", Holder: " + accountHolder +
                 ", Balance: " + getBalance() + ", Interest Rate: " + interestRate);
     }
 }

 public static void main(String[] args) {
     SavingsAccount sa = new SavingsAccount(1001, "Rohit", 50000, 4.5);
     sa.displayAccountDetails();
     sa.setBalance(60000);
     sa.displayAccountDetails();
 }
}
