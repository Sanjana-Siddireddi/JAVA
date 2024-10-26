import java.io.*;
class Trycatch3 {
    public static void main(String args[]) {
        int a=5,b=0,c;
        try{
            c=a/b;
            System.out.println("The value of c:"+c);
        }
        catch(Exception e){
            System.out.println("Exception caught: "+e);
        }
        catch(ArithmeticException ae){
            System.out.println("ArithmeticException caught: "+ae);
        }
    }
}
