import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class PlayerManager {
    private static ArrayList<Player> players = new ArrayList<>(); // List to store players
    private static Scanner scanner = new Scanner(System.in); // Scanner for user input

    public static void main(String[] args) {
        createPlayers(); // Create initial list of players
        int choice;
        do {
            displayMenu(); // Display the menu
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
            handleChoice(choice); // Handle user choice
        } while (choice != 5); // Exit if choice is 5
    }

    // Method to create initial list of players
    private static void createPlayers() {
        Player player1 = new Player("Virat Kohli", 12000, 10, 200, "India", 15);
        Player player2 = new Player("Rohit Sharma", 10500, 5, 180, "India", 12);
        Player player3 = new Player("Joe Root", 8000, 20, 150, "England", 5);
        Player player4 = new Player("Babar Azam", 6500, 8, 120, "Pakistan", 8);
        Player player5 = new Player("Kane Williamson", 7800, 15, 160, "New Zealand", 9);

        players.add(player1);
        players.add(player2);
        players.add(player3);
        players.add(player4);
        players.add(player5);
    }

    // Method to display the menu
    private static void displayMenu() {
        System.out.println("\nPlayer Manager Menu:");
        System.out.println("1. Display player with maximum runs");
        System.out.println("2. Sort players by name");
        System.out.println("3. Remove players with less than 100 runs");
        System.out.println("4. Update player category");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");
    }

    // Method to handle user choices
    private static void handleChoice(int choice) {
        switch (choice) {
            case 1:
                displayPlayerWithMaximumRuns(); // Display player with max runs
                break;
            case 2:
                sortPlayersByName(); // Sort players by name
                break;
            case 3:
                removePlayersWithLessThan100Runs(); // Remove players with < 100 runs
                break;
            case 4:
                updatePlayerCategory(); // Update player categories
                break;
            case 5:
                System.out.println("Exiting program...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
        }
    }

    // Method to display the player with maximum runs
    private static void displayPlayerWithMaximumRuns() {
        Player playerWithMaxRuns = players.stream()
                .max(Comparator.comparingInt(Player::getTotalRuns))
                .orElse(null);

        if (playerWithMaxRuns != null) {
            System.out.println("Player with maximum runs: " + playerWithMaxRuns);
        } else {
            System.out.println("No players found.");
        }
    }

    // Method to sort players by name
    private static void sortPlayersByName() {
        players.sort(Comparator.comparing(Player::getPlayerName));
        System.out.println("Players sorted by name:");
        for (Player player : players) {
            System.out.println(player);
        }
    }

    // Method to remove players with less than 100 runs
    private static void removePlayersWithLessThan100Runs() {
        players.removeIf(player -> player.getTotalRuns() < 100);
        System.out.println("Players with less than 100 runs removed.");
    }

    // Method to update player categories
    private static void updatePlayerCategory() {
        for (Player player : players) {
            player.updateCategory();
        }
        System.out.println("Player categories updated.");
    }
}
