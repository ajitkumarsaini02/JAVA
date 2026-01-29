public class Person{
    String name;
    int age;

    public Person(String n, int a){
        name=n;
        age=a;
    }
    
    public void display(){
        System.out.println("Name :"+ name);
        System.out.println("Age :"+ age);
    }
    
    public static void main(String[] args){
        Person p1 = new Person("John", 25);
        Person p2 = new Person("Jane", 30);
        p1.display();
        p2.display();
    }
}

