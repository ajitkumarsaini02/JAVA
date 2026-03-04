class Student{
    String name;
    int age;

    public void getInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class StudentDemo{
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Aman";
        s1.age = 24;
        s1.getInfo();
    }
}