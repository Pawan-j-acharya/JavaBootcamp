class calci
{
	public static void add()
	{
		int a=10,b=10,c=a+b;
		//int b=20;
		//int c=a+b;
		System.out.println(c);
	}
	public static void sub()
	{
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println(c);
	}
	public static void div()
	{
		int a=10;
		int b=2;
		int c=a/b;
		System.out.println(c);
	}
	public static void mul()
	{
		int a=10;
		int b=20;
		int c=a*b;
		System.out.println(c);
	}
		
	public static void main(String[] args)
	{
		add();			//without using class_name
		calci.sub();		//with using class_name
		div();
		calci.mul();
	}
}