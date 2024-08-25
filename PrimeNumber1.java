import java.io.*;
import java.util.Scanner;
public class PrimeNumber1
{
    public static void main(String args[])
    {
        int n;
        boolean res=true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a +ve integer to check whether it is prime or not : ");
        n=sc.nextInt();
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
             res=false;
             break;
            }
        }
        if(res)
            System.out.println(n+" is a prime number");
        else
            System.out.println(n+" is not a prime number");
    }
}
