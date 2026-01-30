import java.util.Scanner;

class static1 {

    int n;

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        static1 m = new static1();

        m.n = s.nextInt();
        System.out.println(m.n);

        s.close();
    }
}
