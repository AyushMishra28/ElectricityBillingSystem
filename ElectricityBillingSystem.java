import java.util.*;

//creating customer
class Customer {
    private String name;
    private int unitsConsumed;
    private int CustomerID;
    private String customerAdd;

    public Customer(String name, int unitsConsumed , int CustomerID , String customerAdd) {
        this.name = name;
        this.unitsConsumed = unitsConsumed;
        this.CustomerID = CustomerID;
        this.customerAdd = customerAdd;
    }

    public String getName() {
        return name;
    }

    public int getUnitsConsumed() {
        return unitsConsumed;
    }
    
    public int getCustomerID() {
        return CustomerID;
    }
    
    public String getCustomerAddress() {
        return customerAdd;
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
        System.out.print("Enter customer ID: ");
        int CustomerID = scanner.nextInt();
        System.out.print("Enter customer name: ");
        String CustomerName = scanner.nextLine();
        String CustN = scanner.nextLine();
        System.out.print("Enter customer Address: ");
        String customerAdd = scanner.nextLine();
        System.out.print("Enter units consumed: ");
        int unitsConsumed = scanner.nextInt();

        // Create a customer object
        Customer cust = new Customer(CustN, unitsConsumed, CustomerID , customerAdd);

        // Calculate the bill
        double billAmount = BillCalculator.calculateBill(cust.getUnitsConsumed());

        // Display the bill
        System.out.println("--------------------------------------");
        System.out.println("| Customer ID: " + cust.getCustomerID() + "|" );
        System.out.println("| Customer Name: " + cust.getName() + "|" );
        System.out.println("| Customer Address: " + cust.getCustomerAddress() + "|" );
        System.out.println("| Units Consumed: " + cust.getUnitsConsumed() + "|" );
        System.out.println("| Bill Amount: Rs." + billAmount + "|" );
        System.out.println("--------------------------------------");

        scanner.close();
    }
}
