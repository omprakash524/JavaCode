// 2. Add GetArea() method, and call both getPerimeter adn getArea()  method in main and print the returned values.
// Both ans
// 3. Create Triangle and Circle classes and put getArea() method in them and call getArea() in main and print the result.

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
    double getPerimeterT(){
        return length+breadth;
    }
    double getAreaT(){
        return 0.5*length*breadth;
    }

    double getPerimeter(){
        
        return (2*(length+breadth));
    }
    double GetArea(){
        return (0.5*(length*breadth));
    }
    public static void main(String[] args) {
        Rectangle r = new Rectangle(2.2,3.3);
        // r.show();
        // System.out.print("perimeter : ");
        double p =  r.getPerimeter();
        System.out.println("perimeter of Rectangle : "+p);
        double ar = r.GetArea();
        System.out.println("Area of rectangle : "+ar);
        double pt = r.getPerimeterT();
        System.out.println("perimeter of Triangle : "+pt);

        double at = r.getAreaT();
        System.out.println("Area of Triangle : "+at);
    }
}
