import java.io.FileWriter;
import java.io.IOException;

public class Source {
    public static void main(String[] args) throws IOException {
        // Create a FileWriter object to write to the file
        FileWriter fw = new FileWriter("D:\\CDAC2024\\Core Java\\240350120028_AritraDas\\Assignment3\\src\\src.txt");

        // Strings to be written to the file
        String str1 = "Welcome to Coding World";
        String str2 = "Hello Everyone";

        // Write the strings to the file, each followed by a newline character
        fw.write(str1 + '\n');
        fw.write(str2 + '\n');

        // Close the FileWriter to save the file
        fw.close();
    }
}
