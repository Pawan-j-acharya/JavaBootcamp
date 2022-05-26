class Zoo
{
	static
	{
		System.out.println("...WELCOME TO THE ZOO...");
	}
	String name="pilikula";
	String place="mangalore";
	int animalCount=969;
	String timing="10-5 pm";
	
	public void zooAddress()
	{
		Zoo z=new Zoo();
		System.out.println("ZOO ADDRESSS:"+place);
	}

	public void zooTimings()
	{
		Zoo z=new Zoo();
		System.out.println("ZOO TIMINGS:"+timing);
	}
	public static void noOfAnimals()
	{
		Zoo z1=new Zoo();
		System.out.println("Total number of animals:"+z1.animalCount);
	}
	public static void main(String[] args)
	{
		Zoo z=new Zoo();
		System.out.println("ZOO NAME :"+z.name);
		
		z.zooAddress();
		z.zooTimings();
		noOfAnimals();
	}
	static
	{
		System.out.println("**PLEASE DON'T HARM ANY ANIMALS**");
	}
		
}