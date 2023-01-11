
class JavaRefresher{ // CircleBasic
    double radius;
    String color;

    JavaRefresher(){
        radius = 10;
    }

    JavaRefresher(double radius){
        this.radius = 3;
    }


    JavaRefresher(double radius,String  color){
        this.radius = radius;
        this.color = color;
    }

double getArea(){
        double area = 0;
        area = 3.14*radius*radius;
        return area;
    }

public static void main(String[] args) {
    JavaRefresher cb = new JavaRefresher();
    JavaRefresher cb1 = new JavaRefresher(11.2);
    JavaRefresher cb2 = new JavaRefresher(12.2,"green");
    double area = cb.getArea();
    double area1 = cb1.getArea();
    double area2 = cb2.getArea();
    System.out.println("Area is : "+area);
    System.out.println("Area is : "+area1);
    System.out.println("Area is : "+area2);
}
}