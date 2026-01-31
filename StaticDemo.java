class StaticDemo {
    static int a = 100;
    int b = 50;

    public static void main(String[] args) {
        System.out.println(a);

        StaticDemo obj = new StaticDemo();
        System.out.println(obj.b);
    }
}
