class Book
{

	static int id=123;
	static String name="Naruto";
	static String author="Kishimoto";
	
	public static void book_Details()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(author);
	}	
	public static void main(String[] args)
	{
		
		book_Details();
		System.out.println("Dattebayo");

	}
}