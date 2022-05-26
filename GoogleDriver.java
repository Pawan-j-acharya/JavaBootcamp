import java.util.Scanner;
class Shopping 
{
	int belt;
	int shoe;
	int dress;
	Shopping(int belt)
	{
		this.belt=belt;
	}
	Shopping(int belt,int shoe)
	{
		this(belt);
		this.shoe=shoe;
	}
	Shopping(int belt,int shoe,int dress)
	{
		this(belt,shoe);
		this.dress=dress;
	}
}

class Flipkart extends Shopping
{
	Flipkart(int belt,int shoe,int dress)
	{
		super(belt,shoe,dress);
	}
	public int getbelt()
	{
		return belt;
	}
	public int  getshoe()
	{
		return shoe;
	}
	public int  getdress()
	{
		return dress;
	}
	
}

class Myntra extends Shopping
{
	
	Myntra(int belt,int shoe,int dress)
	{
		super(belt,shoe,dress);
	}
	public int getbelt()
	{
		return belt;
	}
	public int  getshoe()
	{
		return shoe;
	}
	public int  getdress()
	{
		return dress;
	}
}


class Amazon extends Shopping
{
	
	Amazon(int belt,int shoe,int dress)
	{
		super(belt,shoe,dress);
	}
	public int getbelt()
	{
		return belt;
	}
	public int  getshoe()
	{
		return shoe;
	}
	public int  getdress()
	{
		return dress;
	}
}


class Google
{	
	Shopping sh;
	Scannner s=new Scanner(System.out);
	public void addOrders()
	{
		System.out.println("Enter the shopping website :");
		System.out.println("1)Flipkart\n2)Myntra\n3)Amazon");
		int choice=s.nextInt();
		if(choice==1)
		{
			this.sh=new Flipkart(1,3,2);
			System.out.println("Flipkart order Added");
		}
		else if(choice==2)
		{
			this.sh=new Myntra(2,1,3);
			System.out.println("Myntra order added");
		}
		else
		{
			this.sh=new Amazon(1,1,2);
			System.out.println("Amazon order added");
		}
	}

	
	
	public void showShoppingDetails()
	{
		if(sh instanceof Flipkart)
		{
			Flipkart f=(Flipkart)sh;
			f.getShoppingDetails();
		}	
		else if(sh insatnceof Myntra)
		{
			Myntra m=(Myntra)sh;
			m.getShoppingDetails();
		}
		else
		{
			Amazon a=(Amazon)sh;
			a.getShoppingDetails();
		}
	}
	
	public void cancleOrders()
	{
		if(sh instanceof Flipkart)
		{
			this.sh=null;
			System.out.println("Flipkart order has been cancelled");
		}
		else if(sh instanceof Myntra)
		{
			this.sh=null;
			System.out.println("Myntra order has been cancelled");
		}
		else
		{
			this.sh=null;
			System.out.println("Amazon order has been cancelled");
		}
	}

	public void getShoppingDetails()
  	{
		if(sh instanceof Flipkart)
		{
			Flipkart f=(Flipkart)sh;
			f.getshoppingdetails();
		}
		else if(sh instanceof Myntra)
		{
			Myntra m=(Myntra)sh;
			m.getshoppingdetails();
		}
		else
		{
			Amazon a=(Amazon)sh;
			m.getshoppingdetails();
		}
	}

}

	
public class GoogleDriver
{
	public static void main(String[] args)
	{
		Google c=new Google();
    		Scanner s=new Scanner(System.in);
		while(true)
		{
			System.out.println("Choose the option");
			System.out.println("1.add order\n2.Show shopping details\n3.Cancel \n4.getShopdetails\n5.Exit");
			int choice=s.nextInt();
			switch(choice)
			{
				case 1:c.addOrders();
					break;
				case 2:c.showShoppingDetails();
					break;
				case 3:c.cancleOrders();
					break;
				case 4:c.getShoppingDetails();
					break;
				case 5:System.exit(0);
					
				default:System.out.println("Choose the correct option");

			}
		}
	}
}
				
		