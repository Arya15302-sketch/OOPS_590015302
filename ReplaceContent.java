import java.io.*;

public class ReplaceContent {
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String line;
            StringBuilder content = new StringBuilder();

            while ((line = br.readLine()) != null) {
                content.append(line.replace("Hello", "Hi")).append("\n");
            }
            br.close();

            FileWriter fw = new FileWriter("data.txt");
            fw.write(content.toString());
            fw.close();

            System.out.println("Content replaced successfully.");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}