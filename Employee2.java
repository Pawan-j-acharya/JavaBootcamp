class Employee2
{
	String name="pawan";
	public void play()
	{
		System.out.println("Employee is working");
	}
	public static void main(String[] args)
	{
		Employee2 e=new Employee2();
		System.out.println(e.name);
		e.play();
	}
}