import java.util.Scanner;
class BookMyShow
{
	static
	{
		System.out.println("...WELCOME TO THE BOOK MY SHOW ...");
		System.out.println("...BOOK YOUR FAV SHOW HERE...");
	}
	
	String movieName;
	String language;
	String address="City centre,mangalore";
	String timing="10:00-12:25pm";
	
	public void bookTickets()
	{
		
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the movie name:");
	      movieName=s.nextLine();
		System.out.println("Enter the movie language:");
		language=s.nextLine();
		
	}
	public static void displayTicket(BookMyShow b)	//className object
	{
		
		System.out.println("MOVIE NAME :"+b.movieName);
		System.out.println("MOVIE LANGUAGE :"+b.language);
		System.out.println("THEATRE ADDRESS:"+b.address);
		System.out.println("SHOW TIMINGS:"+b.timing);
	}
		

	public static void main(String[] args)
	{
		BookMyShow b=new BookMyShow();
		b.bookTickets();
		displayTicket(b);		//passing an object as actual argument
		
	}
	
}