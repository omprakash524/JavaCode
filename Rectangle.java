import java.util.*;
public class Rectangle {
    double length;
    double breadth;
    Rectangle(){
        System.out.println("default");
    }

    Rectangle(Double l, double b){
        this.length = l;
        this.breadth = b;
    }
    public void show(){
        double per = length*breadth;
        System.out.println("perimeter of rectangle : "+per);
        // return per;
    }
    double getPerimeter(){
        
        return (2*(length+breadth));
    }
    double GetArea(){
        return (0.5*(length*breadth));
    }
    public static void main(String[] args) {
        // Scanner input = Scanner(System.in);
        // System.out.println("Enter length : ");
        // double input1 = input.nextInt();
        Rectangle r = new Rectangle(2.2,3.3);
        r.show();
        System.out.print("perimeter : ");
        double p =  r.getPerimeter();
        System.out.println(p);
        // System.out.println("java -cp . file name");
        // System.out.println("java -cp . Rectangle"); // in cmd

        
    }
}
