class student
{
	String name="pawan";
	static int usn=031;
	String dept="ise";
	static int sem=6;
	public void hi()
	{
		System.out.println("HI");
	}
	public static void hello()
	{
		
		System.out.println("HELLO!!");
	}
	public static void main(String[] args)
	{
		student e=new student();
		System.out.println("Name       :"+e.name);
		System.out.println("USN        :"+usn);
		System.out.println("Department :"+e.dept);
		System.out.println("SEM        :"+sem);
		hi();
		e.hello();
	}
}