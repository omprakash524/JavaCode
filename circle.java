
class circle{ // CircleBasic
    double radius=9.5;

double getArea(){
        double area = 0;
        area = 3.14*radius*radius;
        return area;
    }

public static void main(String[] args) {
    circle cb = new circle();
    double area = cb.getArea();
    System.out.println("Area is : "+area);
}
}