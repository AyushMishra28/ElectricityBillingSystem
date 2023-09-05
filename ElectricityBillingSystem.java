import java.util.*;

//creating customer
class Customer {
    private String name;
    private int unitsConsumed;

    public Customer(String name, int unitsConsumed) {
        this.name = name;
        this.unitsConsumed = unitsConsumed;
    }

    public String getName() {
        return name;
    }

    public int getUnitsConsumed() {
        return unitsConsumed;
    }

}

//calculate bill based on unit consumed
class BillCalculator {

    public static double calculateBill(int unitsConsumed) {
    if(unitsConsumed <= 200){
        double RATE_PER_UNIT = 4.0;
        return unitsConsumed * RATE_PER_UNIT;
    }
    else if(unitsConsumed > 200 && unitsConsumed < 450){
        double RATE_PER_UNIT = 6.0;
        return unitsConsumed * RATE_PER_UNIT;
    }
    else{
        double RATE_PER_UNIT = 8.0;
        return unitsConsumed * RATE_PER_UNIT;
    }
    }
}

public class ElectricityBillingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Electricity Billing System");

        // Customer registration
        System.out.print("Enter customer name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter units consumed: ");
        int unitsConsumed = scanner.nextInt();

        // Create a customer object
        Customer cust = new Customer(customerName, unitsConsumed);

        // Calculate the bill
        double billAmount = BillCalculator.calculateBill(cust.getUnitsConsumed());

        // Display the bill
        System.out.println("\nCustomer Name: " + cust.getName());
        System.out.println("Units Consumed: " + cust.getUnitsConsumed());
        System.out.println("Bill Amount: Rs." + billAmount);

        scanner.close();
    }
}
