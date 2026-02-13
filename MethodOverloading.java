class A{
    int sum(int a , int b){
        return a + b;
    }

    double sum(double c, double  d){
        return c + d;
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        A obj = new A();

        System.out.println(obj.sum(3, 6));
        System.out.println(obj.sum(3.3, 6.8));
    }
}
