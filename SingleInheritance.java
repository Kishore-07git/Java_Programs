// Parent class Bank
class Bank 
{
    // Fields
    String bankName;
    String branchName;

    // Constructor to initialize bank name and branch name
    public Bank(String bankName, String branchName) 
    {
        this.bankName = bankName;
        this.branchName = branchName;
    }

    // Method to display bank details
    public void displayBank()
    {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Branch Name: " + branchName);
    }
}

// Child class SavingAccount inheriting from Bank
class SavingAccount extends Bank 
{
    // Fields specific to SavingAccount
    int accountNumber;
    double balance;

    // Constructor to initialize account number, balance, bank name, and branch name
    public SavingAccount(String bankName, String branchName, int accountNumber, double balance) 
    {
        super(bankName, branchName);  // Call parent class constructor
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Method to display account details
    public void account()
    {
        displayBank();  // Calling the method from the parent class
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

    // Method to deposit money into the account
    public void deposit(double amount) 
    {
        balance += amount;
        System.out.println("Deposited: " + amount);
        System.out.println("Updated Balance: " + balance);
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) 
    {
        if (amount <= balance) 
        {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Updated Balance: " + balance);
        } 
        else 
        {
            System.out.println("Insufficient balance or Invalid amount.");
        }
    }
}

public class SingleInheritance 
{
    public static void main(String args[]) 
    {
        // Create an instance of SavingAccount
        SavingAccount savingAccount = new SavingAccount("XYZ Bank", "Main Branch", 12345, 1000.0);

        // Display bank and account details
        savingAccount.account();

        // Deposit and withdraw money
        savingAccount.deposit(500.0);
        savingAccount.withdraw(200.0);
        savingAccount.withdraw(1000.0); // Test insufficient balance
    }
}
