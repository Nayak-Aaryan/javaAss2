package Q3pack;

public class Account {
    public String accountHolderName;
    public double balance;

    public void showDetails() {
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }
}
-----------------------------------------------------------------------------
package Q3pack;

public class SavingsAccount extends Account {
    public double interestRate;

    public void showDetails() {
        super.showDetails();
        if (balance >= 5000) {
            double interest = balance * interestRate / 100;
            System.out.println("Interest: " + interest);
        } else {
            System.out.println("No Interest (Balance < 5000)");
        }
    }
}
------------------------------------------------------------------------------
package Q3pack;

public class CurrentAccount extends Account {
    public double withdrawalAmount;

    public void showDetails() {
        super.showDetails();
        if (balance >= withdrawalAmount) {
            balance = balance - withdrawalAmount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
----------------------------------------------------------------------------
import java.util.Scanner;
import Q3pack.SavingsAccount;
import Q3pack.CurrentAccount;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        SavingsAccount sa = new SavingsAccount();
        CurrentAccount ca = new CurrentAccount();

        System.out.print("Enter Name (Savings): ");
        sa.accountHolderName = sc.nextLine();
        System.out.print("Enter Balance: ");
        sa.balance = sc.nextDouble();
        System.out.print("Enter Interest Rate: ");
        sa.interestRate = sc.nextDouble();

        System.out.println("\nSavings Account Details:");
        sa.showDetails();

        sc.nextLine();

        System.out.print("\nEnter Name (Current): ");
        ca.accountHolderName = sc.nextLine();
        System.out.print("Enter Balance: ");
        ca.balance = sc.nextDouble();
        System.out.print("Enter Withdrawal Amount: ");
        ca.withdrawalAmount = sc.nextDouble();

        System.out.println("\nCurrent Account Details:");
        ca.showDetails();

        sc.close();
    }
}
