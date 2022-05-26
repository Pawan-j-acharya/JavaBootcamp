class Account
{
	
	long acc_no;
	String acc_hld_name;
	String acc_type;
	int IFSC;
	
	static
	{
		System.out.println("...WELCOME TO ICICI BANK...");
	}
	
	
	
	
	public static void BankDetails()
	{
		Account a1=new Account();
		System.out.println("the account number is "+a1.acc_no);
		System.out.println("the account holader name is "+a1.acc_name);
		System.out.println("the account type is "+a1.acc_type);
		System.out.println("the account IFSC is "+a1.IFSC);
		
	}
	
	public static void BankDetails2()
	{
		Account a1=new Account();
		System.out.println("the account number is "+acc_no);
		System.out.println("the account holader name is "+acc_name);
		System.out.println("the account type is "+acc_type);
		System.out.println("the account IFSC is "+IFSC);
		
	}

	
	public static void main(String[] args)
	{
		Account a=new Account();
		a.acc_no=533563;
		a.acc_hld_name="Pawan";
		a.acc_type="saving bank";
		a.IFSC="carb00000202";
		System.out.println("============================================");
		a.BankDetails1();
	}
	
		
}