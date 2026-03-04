// Single Inheritence
class Shape {
   public void area() {
       System.out.println("Displays Area of Shape");
   }
}
class Triangle extends Shape {
   public void area(int h, int b) {
       System.out.println(0.5*b*h);
   }
   public static void main(String[] args) {
        Triangle t = new Triangle();
         
        t.area();
        t.area(10, 20);
   }
}


