import java.util.Scanner;
import java.util.InputMismatchException;

public class RestaurantChatbot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to our eatery! Hello there I'm Digi How can I assist you today?");
        System.out.println("1. Menu");
        System.out.println("2. Specials");
        System.out.println("3. Order");
        System.out.println("4. Exit");
        System.out.print("Please enter a number (1-4): ");

        while (true) {
            try {
                int choice = input.nextInt();
                input.nextLine();

                switch (choice) {
                    case 1:
                        displayMenu();
                        break;
                    case 2:
                        displaySpecials();
                        break;
                    case 3:
                        placeOrder(input);
                        break;
                    case 4:
                        System.out.println("Thank you for visiting! Have a great day!");
                        return;
                    default:
                        System.out.println("Invalid choice. Please enter a valid number.");
                        break;
                }

                System.out.print("What else can I assist you with? (To order again, press 3 and 4 to exit): ");
            } catch (InputMismatchException e) {
                System.out.println("Invalid input format.");
                input.nextLine();
                System.out.print("Please enter a number (1-4): ");
            }
        }
    }

    public static void displayMenu() {
        System.out.println("Our Menu:");
        System.out.println("1. Burger - ₱89.28");
        System.out.println("2. Pizza - ₱90.99");
        System.out.println("3. Spaghetti - ₱60.17");
        System.out.println("4. Soda - ₱40.00");
    }

    public static void displaySpecials() {
        System.out.println("Today's Specials:");
        System.out.println("1. Special Burger Combo - ₱250.00");
        System.out.println("2. Family Pizza Deal - ₱295.00");
        System.out.println("3. Spaghetti and Soda Combo - ₱110.00");
    }

    public static void placeOrder(Scanner input) {
        System.out.println("Please enter the number of the item you'd like to order: ");
        int itemNumber = input.nextInt();
        input.nextLine();

        switch (itemNumber) {
            case 1:
                System.out.println("You've ordered a Burger. Thank you!");
                break;
            case 2:
                System.out.println("You've ordered a Pizza. Thank you!");
                break;
            case 3:
                System.out.println("You've ordered a Salad. Thank you!");
                break;
            case 4:
                System.out.println("You've ordered a Soda. Thank you!");
                break;
            default:
                System.out.println("Invalid item number. Please try again.");
                break;
        }
    }
}
