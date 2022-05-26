package compostion_account_branch;

public class Account {
    private String account_holder_name;
    private long acc_no;
    private int bal;

    Account()
    {
    }

    Account(String account_holder_name)
    {
        this.account_holder_name=account_holder_name;
    }
    Account(String account_holder_name,long acc_no)
    {
        this(account_holder_name);
        this.acc_no=acc_no;
    }
    Account(String account_holder_name,long acc_no,int bal)
    {
        this(account_holder_name,acc_no);
        this.bal=bal;
    }

    public String getAccount_holder_name()
    {
        return account_holder_name;
    }
    public long getAcc_no()
    {
        return acc_no;
    }
    public int getBal()
    {
        return bal;
    }
    public void setAccount_holder_name(String account_holder_name)
    {
        this.account_holder_name=account_holder_name;
    }
    public void setBal(int bal)
    {
        this.bal=bal;
    }
	
	public String toString()
	{
		return "Account holder name :"+account_holder_name+"\n"Account holder name :"+account_holder_name+"\n"Account balance     :"+bal;
	}

    public void accDetails(Account a)
    {
	 
        /*System.out.println("Account holder name :"+account_holder_name);
        System.out.println("Account number      :"+acc_no);
        System.out.println("Account balance     :"+bal);*/
	  System.out.println(a);

    }

}
