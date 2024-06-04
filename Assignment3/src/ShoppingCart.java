import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    ArrayList<Item> cart; // List to store items in the cart
    ArrayList<Item> shop; // List to store items in the shop
    Scanner scanner; // Scanner object for user input

    // Constructor to initialize the shopping cart and shop
    public ShoppingCart() {
        cart = new ArrayList<>();
        shop = new ArrayList<>();
        scanner = new Scanner(System.in);
        initializeShop();
    }

    // Method to initialize the shop with some items
    public void initializeShop() {
        shop.add(new Item("T-shirt", 250.99));
        shop.add(new Item("Jeans", 649.99));
        shop.add(new Item("Sneakers", 748.99));
        shop.add(new Item("Backpack", 948.99));
        shop.add(new Item("Sunglasses", 600.99));
    }

    // Method to start the shopping cart system
    public void start() {
        int choice;
        do {
            displayMenu();
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            handleChoice(choice);
        } while (choice != 6);
        scanner.close(); // Close the scanner after use
    }

    // Method to display the shopping cart menu
    public void displayMenu() {
        System.out.println("\nShopping Cart Menu:");
        System.out.println("1. View items in shop");
        System.out.println("2. Add item to cart");
        System.out.println("3. Remove item from cart");
        System.out.println("4. View cart");
        System.out.println("5. Empty cart");
        System.out.println("6. Checkout");
        System.out.print("Enter your choice: ");
    }

    // Method to handle user choices in the shopping cart menu
    public void handleChoice(int choice) {
        switch (choice) {
            case 1:
                viewShop();
                break;
            case 2:
                addToCart();
                break;
            case 3:
                removeFromCart();
                break;
            case 4:
                viewCart();
                break;
            case 5:
                emptyCart();
                break;
            case 6:
                checkout();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    // Method to display items in the shop
    public void viewShop() {
        System.out.println("\nItems in the shop:");
        for (int i = 0; i < shop.size(); i++) {
            System.out.println((i + 1) + ". " + shop.get(i));
        }
    }

    // Method to add an item to the cart
    public void addToCart() {
        viewShop();
        System.out.print("Enter the item number to add to cart: ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        if (itemNumber > 0 && itemNumber <= shop.size()) {
            Item item = shop.get(itemNumber - 1);
            cart.add(item);
            System.out.println(item.getName() + " added to cart.");
        } else {
            System.out.println("Invalid item number.");
        }
    }

    // Method to remove an item from the cart
    public void removeFromCart() {
        viewCart();
        System.out.print("Enter the item number to remove from cart: ");
        int itemNumber = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        if (itemNumber > 0 && itemNumber <= cart.size()) {
            Item item = cart.remove(itemNumber - 1);
            System.out.println(item.getName() + " removed from cart.");
        } else {
            System.out.println("Invalid item number.");
        }
    }

    // Method to display items in the cart
    public void viewCart() {
        System.out.println("\nItems in your cart:");
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
        } else {
            for (int i = 0; i < cart.size(); i++) {
                System.out.println((i + 1) + ". " + cart.get(i));
            }
        }
    }

    // Method to empty the cart
    public void emptyCart() {
        cart.clear();
        System.out.println("Cart emptied.");
    }

    // Method to proceed to checkout
    public void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty. Nothing to checkout.");
        } else {
            double total = 0;
            System.out.println("\nItems in your cart:");
            for (Item item : cart) {
                System.out.println(item);
                total += item.getPrice();
            }
            System.out.println("Total: ₹" + total);
            System.out.println("Thank you for your purchase!");
            cart.clear(); // Clear the cart after checkout
        }
    }

    // Main method to create an instance of ShoppingCart and start the shopping cart system
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.start();
    }
}
