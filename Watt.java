import java.util.Scanner;

public class Watt {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter customer type (silver/gold/platinum): ");
        String customerType = scanner.nextLine();

        
        System.out.print("Enter purchase amount: ");
        double purchaseAmount = scanner.nextDouble();

        
        double finalAmount = myMethod(customerType, purchaseAmount);

   
        System.out.println("Final amount after discount: " + finalAmount);
        
        scanner.close();
    }

    public static double myMethod(String customerType, double purchaseAmount) {
        double discount = 0.0;

        if (customerType.equalsIgnoreCase("silver") && purchaseAmount > 1000) {
            discount = 0.02; // 2% discount for silver
        } else if (customerType.equalsIgnoreCase("gold") && purchaseAmount > 1000) {
            discount = 0.03; // 3% discount for gold
        } else if (customerType.equalsIgnoreCase("platinum")) {
            discount = 0.05; // 5% discount for platinum
        }

        double finalAmount = purchaseAmount - (purchaseAmount * discount);
        return finalAmount;
    }
}