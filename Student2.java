//CONSTRUCTOR

class Student2 
{
	String name;
	String ID;
	String branch;
	int sem;

	Student2()
	{
	}
	Student2(String name)
	{
		this.name=name;
	}
	Student2(String name, String ID)
	{
		this.name=name;
		this.ID=ID;
	}
	
	
	Studen2(String name, String ID,String branch)
	{
		this.name=name;
		this.ID=ID;
		this.branch=branch;
	}
	
	Student2(String name, String ,String branch,int sem)
	{
		this.name=name;
		this.ID=ID;
		this.branch=branch;
		this.sem=sem;
	}
	
	
	public  void display()
	{
		System.out.println("student name:"+name);
		System.out.println("the id of the student:"+ID);
		System.out.println("the branch of the student:"+branch);
		System.out.println("the sem of the student:"+sem);
	}
	

}