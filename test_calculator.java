import java.util.Scanner;


class test_calculator		
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
		

		Scanner s=new Scanner(System.in);

		while(true)
		{
			
			System.out.println("\n1)Add\n2)Sub\n3)Mul\n4)Div\n5)exit\nstatEnter your choice:");
			int ch=s.nextInt();
			
			switch(ch)
			{
				case 1:add();
				break;
				case 2:sub();
				break;
				case 3:mul();
				break;
				case 4:div();
				break;
				case 5:System.exit(0);
			}

		}

		
	}
}