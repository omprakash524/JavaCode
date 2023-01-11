import java.util.*;
public class Average {

    public static void main(String[] args) {
        // int arr[] = new int[5];
        // arr[0] = 10;
        // arr[1] = 20;
        // arr[2] = 20;
        // arr[3] = 30;

        // for(int i=0; i<arr.length; i++){
        //     System.out.println(arr[i]);
        // }
        
        Scanner in = new Scanner(System.in);

        // System.out.println("How many data : ");
        // int d = in.nextInt();
        // int arr1[] = new int[d];
        // double sum=0;
        // for (int i = 0; i < arr1.length; i++) {
        //     sum = in.nextInt();
        // }sum+=sum;
        // System.out.println("sum : "+sum);
        // System.out.println("Average : " +sum/d);

        System.out.println("Enter how many data : ");
        int n = in.nextInt();
        double numm = 0;
        double x = 1;
        while (x<=n) {
            System.out.println("Enter no."+(int)x+" : ");
            numm += in.nextInt();
            x+=1;            
        }
        // double avg = (numm/n);
        System.out.println("Average : "+(numm)/n);
        System.out.println("Sum : "+numm);
        

        // System.out.println("Enter 1st number : ");
        // int num1  = in.nextInt();

        // System.out.println("Enter 2nd number : ");
        // int num2 = in.nextInt();

        // System.out.println("Enter 3rd num");
        // int num3 = in.nextInt();

        // System.out.println("Average : "+(num1+num2+num3)/3);

    }
}