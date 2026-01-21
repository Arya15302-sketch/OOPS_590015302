import java.util.*;

public class FirstClas {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String str[] = new String[5];

        for (int i = 0; i < 5; i++) {
            str[i] = sc.nextLine();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(str[i]);
        }
    }
}