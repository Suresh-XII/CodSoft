import java.util.Scanner;
public class currency{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Example static exchange rates
        double usdToInr = 83.0;
        double eurToInr = 90.0;
        System.out.println("💱 Currency Converter");
        System.out.println("1. USD to INR");
        System.out.println("2. EUR to INR");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();
        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();
        double result = 0;
        switch (choice) {
            case 1 -> result = amount * usdToInr;
            case 2 -> result = amount * eurToInr;
            default -> System.out.println("Invalid choice!");
        }
        if (result > 0) {
            System.out.println("Converted amount:" + result);
        }
        sc.close();
    }
}
