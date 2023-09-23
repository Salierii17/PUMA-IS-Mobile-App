
package trapezoid;
import java.util.Scanner;

public class trapezoid  {
    public static double getCircumference(double a,double b,double c,double d) {
        return  a+b+c+d;
    }
    public static double getArea(double a,double b, double h) {
        return (a+b)/2*h;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter bottom bases trapezoid =  ");  
        double a= sc.nextInt();  
        System.out.print("Enter upper bases of trapezoid =  ");  
        double b= sc.nextInt();
        System.out.print("Enter leg left of trapezoid =  ");  
        double c= sc.nextInt();
        System.out.print("Enter leg right of trapezoid =  ");  
        double d= sc.nextInt();
        System.out.print("Enter height of trapezoid = ");  
        double h= sc.nextInt();
        sc.close();
        
        System.out.println("Circumference: " + getCircumference(a,b,c,d)+ " m");
        System.out.println("Area: "+getArea(a,b,h)+ " m^2");
    }
}