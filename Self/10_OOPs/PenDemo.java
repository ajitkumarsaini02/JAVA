class Pen{
    String color;
    String type;

    public void write(){
        System.out.println("Write something");
    }
    public void getInfo(){
        System.out.println("Color of pen is: "+ this.color);
        System.out.println("Type of pen is: "+ this.type);
    }
}
public class PenDemo {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.color  = "Blue";
        p1.type = "Ball";
        
        p1.write();
        p1.getInfo();
    }
    
}
