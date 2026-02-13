class Student {
    int rollNo;
    String name;
    int m1, m2, m3;

    Student(int rollNo, String name, int m1, int m2, int m3) {
        this.rollNo = rollNo;
        this.name = name;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    int getTotal() {
        return m1 + m2 + m3;
    }

    double getPercentage() {
        return getTotal() / 3.0;
    }

    void displayResult() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name   : " + name);
        System.out.println("Total  : " + getTotal());
        System.out.println("Percent: " + getPercentage());

        if (m1 >= 40 && m2 >= 40 && m3 >= 40) {
            System.out.println("Result : PASS");
        } else {
            System.out.println("Result : FAIL");
        }
    }
}

public class StudentApp {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Parth", 78, 85, 69);

        System.out.println("----- Student Result -----");
        s1.displayResult();
    }
}
