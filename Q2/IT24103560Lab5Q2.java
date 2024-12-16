import java.util.Scanner;

public class IT24103560Lab5Q2 {
    public static void main(String[] args) {
     
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number of new members introduced: ");
        int newMemberCount = scanner.nextInt();

     
        if (newMemberCount < 0) {
            System.out.println("Invalid input! The number of new members must be greater than or equal to 0.");
        } else {
            
            String prize;
            switch (newMemberCount) {
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default:
                    prize = "Headphone";
                    break;
            }

            // Display the prize
            System.out.println("The prize you are entitled to is: " + prize);
        }

        // Close the scanner
        scanner.close();
    }
}
