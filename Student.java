// public class Student {

//     class employee{

//     }
//     public static void main(String[] args) {
        
//     }
// }

// 1. Create class Student, Employee, Book, Calculator.
// this will have just the name and attributes no methods.

// 2. Add GetArea() method, and call both getPerimeter adn getArea()  method in main and print the returned values.
 
// 3. Create Triangle and Circle classes and put getArea() method in them and call getArea() in main and print the result.


class triangle{
    double h,b;
    
    triangle(double x,double y)
    {
        this.h=x;
        this.b=y;
    }
    
    void getArea()
    {
        System.out.println("\nTriangle area = "+(0.5*b*h));
    }
    
}

class circle
{
    double getArea(double r)
    {
        return (3.14*r*r);
    }
    
    double getperimeter(double r)
    {
        return 2*3.14*r;
    }
}
class shape
{
    public static void main(String args[])
    {
        circle obj = new circle();
       System.out.println("\nCircle Area = "+obj.getArea(4.0)+"\t"+"\nCircle Perimeter = " +obj.getperimeter(4.0));
        
        triangle obj1=new triangle(5.0,4.0);
        obj1.getArea();
        
    }
}