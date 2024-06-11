import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Destination {
    public static void main(String[] args) throws IOException {
        // Write initial content to des.txt
        try {
            FileWriter fw = new FileWriter("D:\\CDAC2024\\Core Java\\240350120028_AritraDas\\Assignment3\\src\\des.txt");
            String str1 = "Good Evening";
            String str2 = "Nice to meet you all";
            fw.write(str1 + '\n');
            fw.write(str2 + '\n');
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read from src.txt and write to des.txt
        try {
            // Read from src.txt
            FileReader fr = new FileReader("D:\\CDAC2024\\Core Java\\240350120028_AritraDas\\Assignment3\\src\\src.txt");
            BufferedReader br = new BufferedReader(fr);
            String st = br.readLine();
            String st2 = br.readLine();

            // Write to des.txt (overwriting previous content)
            FileWriter fw = new FileWriter("D:\\CDAC2024\\Core Java\\240350120028_AritraDas\\Assignment3\\src\\des.txt");
            fw.write(st + '\n');
            fw.write(st2 + '\n');

            // Print the content read from src.txt
            System.out.println(st);
            System.out.println(st2);

            // Close readers and writers
            br.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
