package ProjectOOPs;

import java.util.*;

// Transaction Logger Interface
// An interface defines a contract → any class that implements it must provide the method logTransaction().
interface TransactionLogger {
    void logTransaction(Transaction transaction);
}

// Transaction class 
class Transaction {
    private String transactionId;
    private Date date;
    private double amount;
    private String type;

    // Constructor to set the data
    public Transaction(String transactionId, Date date, double amount, String type) {
        this.transactionId = transactionId;
        this.date = date;
        this.amount = amount;
        this.type = type;
    }

    // Getters
    public String getTransactionId() {
        return transactionId;
    }
    public Date getDate() { return date; }
    public double getAmount() { return amount; }
    public String getType() { return type; }

    @Override
    public String toString() {
        return "Transaction Id: " + transactionId + 
               ", Date: " + date + 
               ", Amount: " + amount + 
               ", Type: " + type;
    }
}

// Account class 
class Account {
    protected String accountNumber;
    protected String holderName;
    protected double balance;
    protected List<Transaction> transactions;

    public Account(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public double getBalance() { return balance; }

    public void printTransactions() {
        for (Transaction t : transactions) {
            System.out.println(t);
        }
    }
}

// Savings account
class SavingAccount extends Account {
    private static final double MIN_BALANCE = 10000;

    public SavingAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public boolean withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Cannot withdraw. Maintain the minimum balance of Rs " + MIN_BALANCE);
            return false;
        }
    }
}

// Current account class 
class CurrentAccount extends Account {
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    public boolean withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient balance.");
            return false;
        }
    }
}

// Abstract ATM class 
abstract class ATM implements TransactionLogger {
    protected String location;
    protected String machineId;

    public ATM(String location, String machineId) {
        this.location = location;
        this.machineId = machineId;
    }

    public abstract void withdraw(Account account, double amount);
    public abstract void deposit(Account account, double amount);

    @Override
    public void logTransaction(Transaction transaction) {
        System.out.println("Transaction logged => " + transaction);
    }
}

// Concrete ATM implementation
class MyATM extends ATM {
    public MyATM(String location, String machineId) {
        super(location, machineId);
    }

    @Override
    public void withdraw(Account account, double amount) {
        boolean success = false;

        if (account instanceof SavingAccount) {
            success = ((SavingAccount) account).withdraw(amount);
        } else if (account instanceof CurrentAccount) {
            success = ((CurrentAccount) account).withdraw(amount);
        }

        if (success) {
            Transaction t = new Transaction(UUID.randomUUID().toString(), new Date(), amount, "Withdraw");
            account.transactions.add(t);
            logTransaction(t);
        }
    }

    @Override
    public void deposit(Account account, double amount) {
        account.balance += amount;
        Transaction t = new Transaction(UUID.randomUUID().toString(), new Date(), amount, "Deposit");
        account.transactions.add(t);
        logTransaction(t);
    }
}

// Main class
public class ATM_ManagementSystem {
    public static void main(String args[]) {
        ATM atm = new MyATM("Delhi", "ATM001");

        // Create accounts
        SavingAccount sa = new SavingAccount("S001", "Satyaa", 12000); // >= 10000
        CurrentAccount ca = new CurrentAccount("C001", "Shivay", 3000);

        // Transactions
        atm.deposit(sa, 1000);
        atm.withdraw(sa, 1200);
        atm.withdraw(sa, 2500);

        atm.deposit(ca, 2000);
        atm.withdraw(ca, 4000);
        atm.withdraw(ca, 2000); // fail due to insufficient funds

        // Print transactions
        System.out.println("\nSavings Account Transactions:");
        sa.printTransactions();

        System.out.println("\nCurrent Account Transactions:");
        ca.printTransactions();
    }
}


