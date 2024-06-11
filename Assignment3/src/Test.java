import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        // Create a FileWriter object to write to the file
        FileWriter fw = new FileWriter("D:\\CDAC2024\\Core Java\\240350120028_AritraDas\\Assignment3\\src\\d.txt");
        String str1 = "Welcome Here";
        fw.write(str1); // Write the string to the file
        fw.close(); // Close the FileWriter to save the file

        try {
            // Create a FileReader and BufferedReader to read the file
            FileReader f = new FileReader("D:\\CDAC2024\\Core Java\\240350120028_AritraDas\\Assignment3\\src\\d.txt");
            BufferedReader b = new BufferedReader(f);
            int nLine = 0; // Initialize line count
            int nword = 0; // Initialize word count
            int nChars = 0; // Initialize character count
            String line;
            
            // Loop through each line in the file
            while ((line = b.readLine()) != null) {
                nLine++; // Increment line count
                nChars += line.length(); // Increment character count by the length of the line
                String[] words = line.split("\\s+"); // Split the line into words
                nword += words.length; // Increment word count by the number of words in the line
            }
            b.close(); // Close the BufferedReader

            // Print the counts
            System.out.println("Number of lines: " + nLine);
            System.out.println("Number of characters: " + nChars);
            System.out.println("Number of words: " + nword);
        } catch (Exception e) {
            System.out.println("File not found or cannot be read");
            e.printStackTrace(); // Print the stack trace for debugging
        }

        // Search for a specific word in the file
        String wordToSearch = "Welcome";
        
        try {
            // Create a FileReader and BufferedReader to read the file
            FileReader f = new FileReader("D:\\CDAC2024\\Core Java\\240350120028_AritraDas\\Assignment3\\src\\d.txt");
            BufferedReader b = new BufferedReader(f);
            String line;
            int lineNumber = 0;

            // Loop through each line in the file
            while ((line = b.readLine()) != null) {
                lineNumber++; // Increment line number
                // Check if the line contains the word to search
                if (line.contains(wordToSearch)) {
                    System.out.println("Word \"" + wordToSearch + "\" found at line " + lineNumber);
                    break; // Exit the loop once the word is found
                }
            }
            b.close(); // Close the BufferedReader
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }
    }
}
