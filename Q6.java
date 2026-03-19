package Q6pack;

public class Account {
    public int accountNumber;
    public double balance;

    public void showAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
------------------------------------------------------------------
package Q6pack;

public class Transaction extends Account {
    public double withdrawAmount;

    public void withdraw() {
        if (withdrawAmount <= balance) {
            balance = balance - withdrawAmount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
}
-----------------------------------------------------------------------
import java.util.Scanner;
import Q6pack.Transaction;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Transaction t = new Transaction();

        System.out.print("Enter Account Number: ");
        t.accountNumber = sc.nextInt();

        System.out.print("Enter Balance: ");
        t.balance = sc.nextDouble();

        System.out.print("Enter Withdraw Amount: ");
        t.withdrawAmount = sc.nextDouble();

        t.showAccount();
        t.withdraw();

        sc.close();
    }
}
