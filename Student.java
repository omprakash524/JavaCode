public class Student {
    public String name;
    public int id;
    public String major;

    public Student(String name, int id, String major){
        this.name = name;
        this.id = id;
        this.major = major;
    }

    public String getName(){
        return name;
    }

    public int getStudentId(){
        return id;
    }

    public String getMajor(){
        return major;
    }

    static class Employee{
        public String name;
        public int id;
        public String major;

        public Employee(String name, int id, String major){
            this.name = name;
            this.id = id;
            this.major = major;
        }

        public String getName(){
            return name;
        }

        public int getEmployeeId(){
            return id;
        }

        public String getMajor(){
            return major;
        }
    }

    static class Book{
        public String title;
        public int isbn;
        public String Author;

        public Book(String title, int isbn, String Author){
            this.title = title;
            this.isbn = isbn;
            this.Author = Author;
        }
    }

    static class Calculator{
        public String brand;
        public int price;
        public String model;

        public Calculator(String brand, int price, String model){
            this.brand = brand;
            this.price = price;
            this.model = model;
        }
    }

    public static void main(String[] args) {
        Student st = new Student("omprakash", 12010348, "CSE");
        Employee em = new Employee("mahesh", 432, "Marketing");
        Book bk = new Book("Think and grow rich", 34920455, "john");
        Calculator c = new Calculator("Texas", 113, "TI-84 Plus");

        System.out.println("Student: " + st.getName() + " - " + st.getStudentId() + " - " + st.getMajor());
        System.out.println("Employee: " + em.getName() + " - " + em.getEmployeeId() + " - " + em.getMajor());
        System.out.println("Book: " + bk.title + " - " + bk.isbn + " - " + bk.Author);
        System.out.println("Calculator: " + c.brand + " - " + c.price + " - " + c.model);
    }
}
