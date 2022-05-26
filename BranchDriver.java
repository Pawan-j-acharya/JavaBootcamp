import java.util.Scanner;
//--------------------------------class Account---------------------------------------
class Account{
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

    public void accDetails()
    {
        System.out.println("Account holder name :"+getAccount_holder_name());
        System.out.println("Account number      :"+getAcc_no());
        System.out.println("Account balance     :"+getBal());

    }

}

//--------------------------class branch-------------------------------

 class Branch {
    private String manager_name;
    private long ifsc;
    Account a;

    Branch()
    {
    }
    Branch(String manager_name)
    {
        this.manager_name=manager_name;
    }
    Branch(String manager_name,long ifsc)
    {
        this(manager_name);
        this.ifsc=ifsc;
    }
 

    public String getManager_name()
    {
        return manager_name;
    }
    public long getIfsc()
    {
        return ifsc;
    }
    public void setManager_name(String manager_name)
    {
       this.manager_name=manager_name;
    }
     public void createAccount()
     {
         if(this.a!=null)
         {
             
             System.out.println("Account has already been created!!");
         }
         else
         {
		Scanner s=new Scanner(System.in);
             System.out.println("Enter the account holder name:");
             String a=s.nextLine();
             System.out.println("Enter the account acc no:");
             long b=s.nextLong();
             System.out.println("Enter the account balance:");
             int c=s.nextInt();
             this.a=new Account(a,b,c);
             System.out.println("Account has been created successfully!!");
         }
     }

     public void branchAttribute()
     {
         System.out.println("Bank Manager name :"+manager_name);
         System.out.println("Bank IFSC code    :"+ifsc);
     }
	
	public void deleteAcc()
	{
		if(this.a!=null)
		{
			this.a=null;
			System.out.println("Deleted successfully!");
		}
		else
		{
			System.out.println("No account has been created!");
		}
	}
}

//----------------------------------class Branch driver-----------------------------


public class BranchDriver {
    public static void main(String[] args)
    {

        Branch b=new Branch("peter",35200002);
        Scanner s=new Scanner(System.in);
        while(true)
        {
            System.out.println("1)create an account\n2)Account details\n3)Branch Attributes\n4)Delete account\n5)Exit\n\nEnter your choice:");
            int ch= s.nextInt();
            switch(ch)
            {
                case 1:b.createAccount();
                    break;
                case 2:b.a.accDetails();
                    break;
                case 3:b.branchAttribute();
                    break;
                case 4:b.deleteAcc();
			break;
		case 5:System.exit(0);				
                default:System.out.println("Enter the correct input!");
            }
        }

    }
}
