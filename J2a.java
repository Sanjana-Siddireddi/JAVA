import java.util.Scanner;
import java.lang.Math;
class J2a {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter coefficients a, b, c:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double d=b*b-4*a*c;
        double x=Math.sqrt(d);
        double r1=(-b+x)/(2*a);
        double r2=(-b-x)/(2*a);
        if(d==0)
        {
            System.out.println("Roots are real and equal");
            System.out.println("Roots are: "+r1+" and "+r2);
        }
        else if(d<0)
            System.out.println("The roots are imaginary");
        else
        {
            System.out.println("The roots are real and distinct");
            System.out.println("Roots are: "+r1+" and "+r2);
        }
        sc.close();
    }
}
