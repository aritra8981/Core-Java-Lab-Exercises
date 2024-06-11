import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordSearch {
    public static void main(String[] args) {
        // The word to search for
        String wordToFind = "Welcome"; 
        // The file to search in
        File file = new File("D:\\CDAC2024\\Core Java\\240350120028_AritraDas\\Assignment3\\src\\d.txt");

        try {
            // Create a Scanner object to read the file
            Scanner scanner = new Scanner(file);
            boolean found = false; // Flag to track if the word is found

            // Loop through each line in the file
            while (scanner.hasNextLine()) {
                String line = scanner.nextLine(); // Read the next line

                // Check if the line contains the word to search for
                if (line.contains(wordToFind)) {
                    System.out.println("Word found: " + wordToFind);
                    found = true; // Set the flag to true if the word is found
                    break; // Exit the loop once the word is found
                }
            }

            // If the word is not found in the entire file, print a message
            if (!found) {
                System.out.println("Word not found: " + wordToFind);
            }

            // Close the Scanner
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
