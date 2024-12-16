import java.util.Scanner;

public class IT24103560Lab5Q3 {
   
    private static final double ROOM_CHARGE_PER_DAY = 48000.00;
    private static final int DISCOUNT_10_PERCENT = 10;
    private static final int DISCOUNT_20_PERCENT = 20;

    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the start date (1-31): ");
        int startDate = scanner.nextInt();
        
        System.out.print("Enter the end date (1-31): ");
        int endDate = scanner.nextInt();

     
        if (startDate < 1 || startDate > 31 || endDate < 1 || endDate > 31) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return;
        }

       
        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than the end date.");
            return;
        }

   
        int daysReserved = endDate - startDate;

     
        double discountRate = 0;
        if (daysReserved >= 3 && daysReserved <= 4) {
            discountRate = DISCOUNT_10_PERCENT;
        } else if (daysReserved >= 5) {
            discountRate = DISCOUNT_20_PERCENT;
        }

       
        double totalAmount = daysReserved * ROOM_CHARGE_PER_DAY;
        double discountAmount = totalAmount * (discountRate / 100);
        double finalAmount = totalAmount - discountAmount;

     
        System.out.println("Number of days reserved: " + daysReserved);
        System.out.println("Discount rate: " + discountRate + "%");
        System.out.println("Total amount before discount: Rs " + totalAmount);
        System.out.println("Discount amount: Rs " + discountAmount);
        System.out.println("Total amount to be paid: Rs " + finalAmount);

      
        scanner.close();
    }
}
