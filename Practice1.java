import java.util.*;
public class Practice1{
static int count = 0;
Practice1(String i){
count++;
System.out.println(i+"object "+count+" is called");
}
public static void main(String[] args){
Practice1 o1 = new Practice1 ("calling");
Practice1 o2 = new Practice1 ("calling");
Practice1 o3 = new Practice1 ("calling");
}
}