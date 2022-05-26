class ShopDriver
{
	public static void main(String[] args)
	{
		Shop s=new Shop("moodubidri","janani","lathesh","general store",999872761);
		System.out.println("====before update=====");
		System.out.println("location: "+s.getloc());
		System.out.println("name: "+s.getname());
		System.out.println("phone number: "+s.getphone());
		System.out.println("type: "+s.gettype());
		System.out.println("owner: "+s.getowner());
		System.out.println("====after update=====");
		s.setloc("kerala");
		s.setname("rakshith");
		s.setphone(998800377);
		s.settype("textile");
		s.setowner("swasthik");
		System.out.println("location: "+s.getloc());
		System.out.println("name: "+s.getname());
		System.out.println("phone number: "+s.getphone());
		System.out.println("type: "+s.gettype());
		System.out.println("owner: "+s.getowner());
	}
}
class Shop
{
	private String loc;
	private String name;
	private long phoneno;
	private String type;
	private String owner;
	public Shop(String l,String n,String o,String t,long p)
	{
		loc=l;
		name=n;
		phoneno=p;
		type=t;
		owner=o;
	}
	public String getloc()
	{
		return loc;
	}
	public String getname()
	{
		return name;
	}
	public String gettype()
	{
		return type;
	}
	public String getowner()
	{
		return owner;
	}
	public long getphone()
	{
		return phoneno;
	}
	public void setloc(String l)
	{
		loc=l;
	}
	public void setowner(String o)
	{
		owner=o;
	}
	public void settype(String t)
	{
		type=t;
	}
	public void setname(String n)
	{
		name=n;
	}
	public void setphone(long p)
	{
		phoneno=p;
	}
}
	
