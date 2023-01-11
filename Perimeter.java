public class Perimeter {
    int l;
    int b;
    double per;
    public Perimeter(){
        System.out.println("Default");
    }
    public Perimeter(int length, int breadth){
        this.l = length;
        this.b = breadth;
    }
    public double dataRectangle(){
      per = 2*(l+b);
        System.out.println("Perimeter of rectangle : "+per);
        return per;
    }
    public double dataTriangle(){
      per = l+b;
        System.out.println("Perimeter of tringle : "+per);
        return per;
    }
    public static void main(String[] args) {
        Perimeter p = new Perimeter(2,3);
        
        p.dataRectangle();
        p.dataTriangle();
    }
}

