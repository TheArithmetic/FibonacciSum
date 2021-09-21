import java.lang.Math; 
import java.util.* ;
public class Fibbonacci{

     public static void main(String Args[]) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Hello");
     System.out.println("Enter the number of numbers to be added.");
     double x = sc.nextDouble();
     double v = x - 1;
     double n = v + 2; 
     double a_op = 1 + Math.sqrt(5);
     double b_op = 1 - Math.sqrt(5);
     double a = Math.pow(a_op, n);
     double b = Math.pow(b_op, n);
     double c = a - b;
     double d = Math.pow(2, n);
     double e = Math.sqrt(5);
     double f = d * e;
     double f_no = c / f;
     double sum = f_no - 1;
     double roundedsum = Math.round(sum);
    System.out.println("The sum of the numbers are :-  "+ roundedsum);

}
}
