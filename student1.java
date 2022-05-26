class student1
{	
	int a;
	int b;
	student1(int a,int b){
		this.a=a;
		this.b=b;
	}
	{
	System.out.println("NSMIES");
	}
	public static void main(String [] args)
{
	System.out.println("program started");
	student1 s=new student1(10,20);
	student1 s1=new student1(20,30);
	System.out.println("program ended");
}
}