import java.util.Scanner;
class cal_scanner		
{
	public static void add()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first value:");
		int num1=s.nextInt();
		System.out.println("Enter the second value:");
		int num2=s.nextInt();
		System.out.println("addition of two number:"+(num1+num2));
	}
	public static void sub()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first value:");
		int num1=s.nextInt();
		System.out.println("Enter the second value:");
		int num2=s.nextInt();
		System.out.println("substraction of two number:"+(num1-num2));
	}
	public static void div()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first value:");
		int num1=s.nextInt();
		System.out.println("Enter the second value:");
		int num2=s.nextInt();
		System.out.println("division of two number:"+(num1/num2));
	}
	public static void mul()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first value:");
		int num1=s.nextInt();
		System.out.println("Enter the second value:");
		int num2=s.nextInt();
		System.out.println("multiplication of two number:"+(num1*num2));
	}
		
	public static void main(String[] args)
	{
		add();
		sub();
		div();
		mul();
			
		
	}
}