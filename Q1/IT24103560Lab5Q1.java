import java.util.Scanner;

public class IT24103560Lab5Q1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter three different integers:");

        System.out.print("First integer: ");
        int num1 = scanner.nextInt();

        System.out.print("Second integer: ");
        int num2 = scanner.nextInt();

        System.out.print("Third integer: ");
        int num3 = scanner.nextInt();

      
        int smallest = Math.min(num1, Math.min(num2, num3));

      
        int largest = Math.max(num1, Math.max(num2, num3));

      
        System.out.println("The smallest number is: " + smallest);
        System.out.println("The largest number is: " + largest);

      
        scanner.close();
    }
}
