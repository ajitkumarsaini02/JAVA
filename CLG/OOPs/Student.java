public class Student {
    int rollNo;
    String name;
    double marks;
    
    Student(String n, int r, double m){
        this.name = n;
        this.rollNo = r;
        this.marks = m;
    }
    public void display(){
        System.out.println("Name :" +name);
        System.out.println("Roll No :"+rollNo);
        System.out.println("Marks :"+marks);
    }

    public static void main(String[] args) {
        Student s1 = new  Student("Ajit", 114, 8.75);
        s1.display();
    }
}
