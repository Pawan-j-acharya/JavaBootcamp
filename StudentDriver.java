
 class StudentDriver {
	public static void main(String[] args)
	{
		Student2 s1=new Student2();
		s1.display();
		System.out.println("<<<<<<------------------------------->>>>>>>");
		Student2 s2=new Student2("eren");
		s2.display();
		System.out.println("<<<<<<------------------------------->>>>>>>");
		Student2 s3=new Student2("thor","4AL19IS062");
		s3.display();
		System.out.println("<<<<<<------------------------------->>>>>>>");
		Student2 s4=new Student2("loki","4AL19IS020","ISE");
		s4.display();
		System.out.println("<<<<<<------------------------------->>>>>>>");
		Student2 s5=new Student2("bjorn","4AL19IS031","AI",6);
		s5.display();
		System.out.println("<<<<<<------------------------------->>>>>>>");	
	}
}
