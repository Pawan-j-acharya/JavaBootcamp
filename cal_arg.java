class cal_arg		//  method with formal argument
{
	public static void add(int a,int b)
	{
		
		System.out.println(a+b);
	}
	public static void sub(int a,int b)
	{
		
	
		System.out.println(a-b);
	}
	public static void div(int a,int b)
	{
				
		System.out.println(a/b);
	}
	public static void mul(int a,int b)
	{
		
				System.out.println(a*b);
	}
		
	public static void main(String[] args)
	{
		add(10,20);			//without using class_name
		sub(20,10);		     //with using class_name
		div(100,20);
		mul(10,20);
	}
}