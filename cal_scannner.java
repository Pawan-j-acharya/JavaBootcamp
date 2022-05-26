import java.util.Scanner;
class cal_scanner		
{
	public static void add()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first value:")
		int num1=s.nextInt();
		System.out.println("Enter the second value:")
		int num2=s.nextInt();
		
		System.out.println(num1+num2);
	}
	public static void sub()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first value:")
		int num1=s.nextInt();
		System.out.println("Enter the second value:")
		int num2=s.nextInt(num1-num2);
		
	
		System.out.println(num1-num2);
	}
	public static void div()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first value:")
		int num1=s.nextInt();
		System.out.println("Enter the second value:")
		int num2=s.nextInt();
				
		System.out.println(num1/num2);
	}
	public static void mul()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first value:")
		int num1=s.nextInt();
		System.out.println("Enter the second value:")
		int num2=s.nextInt();
		System.out.println(num1*num2);
	}
		
	public static void main(String[] args)
	{
		add();
		sub();
		div();
		mul();
			
		
	}
}