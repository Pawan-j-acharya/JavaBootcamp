//GETTER & SETTER method

class Account2
{
	int e;
	long a;
	String b,c,d;
	private long acc_no;
	private String acc_hld_name;
	private String acc_type;
	private String bankName;
	private int IFSC;
	
	//for only executing getter method
	/*count2(long acc_no,String acc_hld_name,String acc_type,String bankName,int IFSC)
	{
		this.acc_no=acc_no;
		this.acc_hld_name=acc_hld_name;
		this.acc_type=acc_type;
		this.bankName=bankName;
	}
	*/

	public long getacc_no()
	{
		return acc_no;
	}

	public String getacc_hld_name()
	{
		return acc_hld_name;
	}

	public String getacc_type()
	{
		return acc_type;
	}
	
	public String getbankName()
	{
		return bankName;
	}
	
	public int getIFSC()
	{
		return IFSC;
	}



	public void setacc_no(long a)
	{
	     acc_no=a;
	}

	public void setacc_hld_name(String b)
	{
		     acc_hld_name=b;
	}

	public void setacc_type(String c)
	{
		     acc_type=c;
	}
	
	public void setbankName(String d)
	{
	      bankName=d;
	}
	
	public void setIFSC(int e)
	{
		     IFSC=e;
	}
	
	
}
	
class AccountDriver2
{
	public static void main(String[] args)
	{
		Account2 a=new Account2();
		a.setacc_no(031); 
	     a.setacc_hld_name("pawan");
	     a.setacc_type("saving bank"); 
	     a.setbankName("IOB"); 
	     a.setIFSC(9880);
		System.out.println(a.getacc_no());
		System.out.println(a.getacc_hld_name());
		System.out.println(a.getacc_type());
		System.out.println(a.getbankName());
		System.out.println(a.getIFSC());
	}
}