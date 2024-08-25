import java.io.*;
public class A
{
	A()
	{
		System.out.println("Default Constructor\n");
	}
}
public class DefaultConstructorDemo
{
	public static void main(String args[])
	{
		System.out.println("Inside main method");
		A a = new A();
		System.out.println("Object created Successfully");
	}
}
