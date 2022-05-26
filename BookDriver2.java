class Book23
{

	private int id=123;
	 String name="Naruto";
	 String author="Kishimoto";
	 String publisher="Kodansha";
	
	
	 public void book_Details()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(author);
		System.out.println(publisher);
	}	
	
	//public static  void book_Details2()
	{	
		Book23 b=new Book23();
		System.out.println(b.id);
		System.out.println(b.name);
		System.out.println(b.author);
		System.out.println(b.publisher);
	}//	
	
	
	
}

class BookDriver2
{
	public static void main(String[] args)
	{
		Book23 b=new Book23();
		//b.book_Details();
		b.book_Details2();//
			System.out.println(b.id);
	}
}