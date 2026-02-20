import java.io.*;

public class MergeFiles {
    public static void main(String[] args) {
        try {
            BufferedReader br1 = new BufferedReader(new FileReader("file1.txt"));
            BufferedReader br2 = new BufferedReader(new FileReader("file2.txt"));
            FileWriter fw = new FileWriter("merged.txt");

            String line;

            while ((line = br1.readLine()) != null) {
                fw.write(line + "\n");
            }

            while ((line = br2.readLine()) != null) {
                fw.write(line + "\n");
            }

            br1.close();
            br2.close();
            fw.close();

            System.out.println("Files merged successfully.");

        } catch (IOException e) {
            System.out.println(e);
        }
    }
}