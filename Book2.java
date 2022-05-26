class Book2
{

	 int id=123;
	 String name="Naruto";
	 String author="Kishimoto";
	 String Publisher="Kodansha";
	
	
	public static void book_Details()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(author);
		System.out.println(publisher);
	}	
	public static void main(String[] args)
	
}

class BookDriver
{
	public static void main(String[] args)
	{
		Book2 b=new Book2();
		b.display();
	}
}