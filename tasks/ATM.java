import java.util.Scanner;
class BankAccount {
    private double balance;
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(" Deposited: " + amount);
        } else {
            System.out.println(" Invalid amount!");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println(" Insufficient balance or invalid amount!");
        }
    }
    public void checkBalance() {
        System.out.println("💰 Current Balance: " + balance);
    }
}
public class ATM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount(1000);
        while (true) {
            System.out.println("\n=== ATM MENU ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Choose option: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> account.checkBalance();
                case 2 -> {
                    System.out.print("Enter deposit amount: ");
                    double dep = sc.nextDouble();
                    account.deposit(dep);
                }
                case 3 -> {
                    System.out.print("Enter withdrawal amount: ");
                    double wit = sc.nextDouble();
                    account.withdraw(wit);
                }
                case 4 -> {
                    System.out.println("👋 Thank you for using the ATM!");
                    sc.close();
                    return;
                }
                default -> System.out.println(" Invalid option!");
            }
        }
    }
}
