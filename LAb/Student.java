class Student{
    String name;
    int rollNo;
    String branch;
    Student(String n, int r, String b){
        name = n;
        rollNo = r;
        branch = b;
    }
    void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Branch: " + branch);
    }
    public static void main(String[] args) {
        Student s1 = new Student("Aditya", 103, "CSE");
        Student s2 = new Student("Ansh", 135, "ECE");
        System.out.println("Student 1 Information:");
        s1.displayInfo();
        System.out.println("\nStudent 2 Information:");
        s2.displayInfo();
    }
}