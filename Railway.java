class Railway
{

	static int ticketNO=123;
	static String name="Eren";
	static String source="mangalore";
	static String destination="bangalore";
	static String timing="2:00 pm";
	static double ticketPrice=999;
	static
	{
		System.out.println("...WELCOME TO INDIAN RAILWAY...");
	}
	
	
	public static  void railwayDetails()
	{
		System.out.println(" Ticket no    :"+ticketNO);
		System.out.println(" Name         :"+name);
		System.out.println(" source       :"+source);
		System.out.println(" destination  :"+destination);
		System.out.println(" Timings      :"+timing);
		System.out.println(" Ticket price :"+ticketPrice);
	}	
	public static void main(String[] args)
	{
		
		railwayDetails();

	}
	
}