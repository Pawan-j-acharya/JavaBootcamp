import java.util.Scanner;
class ConstructorEx
{
	
	
	int a;
	int b;
	ConstructorEx()
	{
		this.a=a;
		this.b=b;
	}

	ConstructorEx(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	
		

	public static void main(String[] args)
	{
		ConstructorEx e=new ConstructorEx(2,3);
		System.out.println(e.a+" "+e.b);
		
	}
	
}