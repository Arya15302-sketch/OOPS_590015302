class A {
    A() {
        System.out.println("Class A constructor");
    }
}

class B extends A {
    B() {
        super();   // calls parent class constructor
        System.out.println("Class B constructor");
    }
}

public class Test {
    public static void main(String[] args) {
        B obj = new B();
    }
}
