import java.io.FileWriter;
import java.io.IOException;

public class UpdateFile {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("charfile.txt");
            fw.write("Updated content of the file.");
            fw.close();
            System.out.println("File updated successfully.");
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}