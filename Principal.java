

class Principal
{
	String name;
	int  ID;
	String ClgName;
	int  age;


	Principal()
	{
	}
	Principal(String name)
	{
		this.name=name;
	}
	Principal(String name, String ID)
	{
		this.name=name;
		this.ID=ID;
	}
	
	
	Principal(String name, String ID,String ClgName)
	{
		this.name=name;
		this.ID=ID;
		this.ClgName=ClgName;
	}
	
	Principal(String name, String ID,String ClgName,int age)
	{
		this.name=name;
		this.ID=ID;
		this.ClgName=ClgName;
		this.age=age; 
	}
	
	public static void display()
	{
		System.out.println("Principal Name:"+name);
		System.out.println("Principal id:"+ID);
		System.out.println("Principal Collage Name:"+Clgname);
		System.out.println("Principal Age :"+age);
	}
		
		


	public static void main(String[] args)
	{
		Principal p=new Principal();
		p.display();
		Principal p1=new Principal("pawan");
		p1.display();
		Student p2=new Principal("Varshith",062);
		p2.display();
		Principal p3=new Principal("Lathesh",020,"ALvas");
		p3.display();
		Principal p4=new Principal("rakshith",031,"SMC",30);
		p4.display();
	}
}