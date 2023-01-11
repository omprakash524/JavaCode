public class Task { 
    double radius ;
    String color;
    
    Task(){
    radius = 10.4;
    }
    // Print circle area of radius 14.5 and its color as Blue
    
    Task(double radius){
    this.radius = radius;
    
    }
    
    Task(double radius, String color){
    this.radius = radius;
    this.color = color;
    }
    
    double getArea(){
    // double area8 = 0;
    double area = 3.14 *radius* radius; 
    return area;
    }
    String getColor(){
         return this.color;
    }
    
    public static void main(String[] args){
    Task cb = new Task();
    Task cb2 = new Task(11.5);
    Task cb3 = new Task(12.5,"blue");
    Task cb4 = new Task(14.5, "red");
    
     double area = cb.getArea();
     double area11 = cb2.getArea();
    double area12 = cb3.getArea();
    // double print1 = cb4.Task();
    String color = cb3.getColor();
    
    System.out.println("Area 10.5 is " + area);
    System.out.println("Area 11.5 is " + area11);
    System.out.println("Area 12.5 is " + area12);
    System.out.println(color);
    }
    
    
}
