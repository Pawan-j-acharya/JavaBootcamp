package compostion_account_branch;
import java.util.Scanner;
public class Branch {
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
    Branch(String manager_name,long ifsc,Account a)
    {
        this(manager_name,ifsc);
        this.a=a;
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
         if(this.a==null)
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
         else
         {
             System.out.println("Account has already been created!!");
         }
     }

     public void branchAttribute()
     {
         System.out.println("Bank Manager name:"+manager_name);
         System.out.println("Bank IFSC code:"+ifsc);
     }
}
