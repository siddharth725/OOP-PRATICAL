class Calculator {

    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    double add(double a, double b) {
        return a + b;
    }

    class Student {
        String name;
        int age;

        Student() {
            name = "unknown";
            age = 0;
        }

        Student(String n, int a) {
            name = n;
            age = a;
        }

        Student(Student s) {
            this.name = s.name;
            this.age = s.age;
        }

        void display() {
            System.out.println("Name: " + name + ", Age: " + age);
        }

        Student getStudent() {
            return this;
        }
    }
}

public class functionDemo {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        System.out.println("Add two integers: " + calc.add(4, 9));

        System.out.println("Add three integers: " + calc.add(2, 12, 15));

        System.out.println("Add two doubles: " + calc.add(5.0, 4.9));

        Calculator.Student s1 = calc.new Student();

        Calculator.Student s2 = calc.new Student("Siddharth", 18);

        Calculator.Student s3 = calc.new Student(s2);

        s1.display();
        s2.display();
        s3.display();

        Calculator.Student s4 = s2.getStudent();

        System.out.println("Student s4 details (reference to s2):");
        s4.display();
    }
}