class Employee3
{	
	String  ename;
	int eid;
	String dept;
	float salary;
	
	Employee3(){}

	Employee3(String ename)
	{
		this.ename=ename;
	}
	
	Employee3(String ename,int eid)
	{
		this(ename);
		this.eid=eid;
	}	
	
	Employee3(String ename,int eid,String dept)
	{
		this(ename,eid);
		this.dept=dept;
	}	
	
	Employee3(String ename,int eid,String dept,float salary)
	{
		this(ename,eid,dept);
		this.salary=salary;
	}
		
	public  void display()
	{
		System.out.println("Employee name:"+ename);
		System.out.println("Employee id:"+eid);
		System.out.println("Employee department:"+dept);	
		System.out.println("Employee salary:"+salary);
	}
	
	
	public static void main(String [] args)
	{
		System.out.println("program started");
		System.out.println();
		Employee3 e1=new Employee3();
		e1.display();
		System.out.println();
		Employee3 e2=new Employee3("pawan");
		e2.display();
		System.out.println();
		Employee3 e3=new Employee3("pawan",123);
		e3.display();
		System.out.println();
		Employee3 e4=new Employee3("pawan",123,"research");
		e4.display();
		System.out.println();
		Employee3 e5=new Employee3("pawan",123,"research",2000);
		e5.display();
		System.out.println();
		System.out.println("program ended");
	}
}