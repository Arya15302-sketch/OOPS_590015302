class Employee {
    String name;   // max 20 chars
    int age;       // > 5
    float salary;

    void setData(String n, int a, float s) {
        try {
            if (n.length() > 20) {
                throw new Exception("Name should be within 20 characters");
            }

            if (a <= 5) {
                throw new Exception("Age must be greater than 5");
            }

            name = n;
            age = a;
            salary = s;

            System.out.println("Data inserted successfully");
        }

        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        finally {
            System.out.println("Operation finished");
        }
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Salary: " + salary);
    }
}

public class Main {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setData("ARYA", 21, 50000.0f);
        e.display();
    }
}
