 // This code is belongs to Ajit Kumar Saini (2400320100114)
public class Person {
    private String name;
    private int age;
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Student extends Person {
    private String studentId;
    private String major;

    public Student(String name, int age, String studentId, String major) {
        super(name, age);
        this.studentId = studentId;
        this.major = major;
    }
    public void displayStudentDetails() {
        displayDetails(); // Inherited method
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
    }
    public static void main(String[] args) {
        System.out.println("This code is belongs to Ajit Kumar Saini (2400320100114)");
        Student student = new Student("Ajit", 20, "2024B0101315", "Computer Science and Science");
        student.displayStudentDetails();
    }
}