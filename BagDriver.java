import java.util.Scanner;
class Ball
{
	double radius;
	Ball(double radius)
	{
		this.radius=radius;
	}
}

class BasketBall extends Ball
{
	BasketBall(double radius)
	{
		super(radius);
	}
	public double getRadius()
	{
		return radius;
	}
}

class TennisBall extends Ball
{
	double radius;
	TennisBall(double radius)
	{
		super(radius);
	}

	public void getRadius()
	{
		System.out.println(radius);
	}
}

class Bag
{	
	ball b;
	Scannner s=new Scanner(System.out);
	public void addBall()
	{
		System.out.println("Enter the game you want to play");
		System.out.println("1)Basket ball\n2)Tennis ball");
		int choice=s.nextInt();
		if(choice==1)
		{
			this.b=new BasketBall(10.0);
			System.out.println("Basket ball Added");
		}
		else
		{
			this.b=new Tennisball(5.0);
			System.out.println("Tennis ball is added");
		}
	}

	public void isBagEmpty()
	{
		if(this.b==null)
		{
			System.out.println("The bag is empty");
		}
		else
		{
			System.out.println("The bag is full");
		}
	}
	
	public void getRadius()
	{
		if(b instanceof BasketBall)
		{
			BasketBall c=(BasketBall)b;
			c.getRadius();
		}	
		else
		{
			TennisBall t=(TennisBall)b;
			t.getRadius();
		}
	}
	
	public void removeBall()
	{
		if(b instanceof BasketBall)
		{
			this.b=null;
			System.out.println("Basket ball is removed");
		}
		else
		{
			this.b=null;
			System.out.println("Tennis Ball is removed");
		}
	}
}
	
public class BagDriver{

	public static void main(String[] args)
	{

		Ball n=new Ball();
		Scanner s=new Scanner(System.out);
		while(true)
		{
			System.out.println("1)Add Ball\n2)isBagEmpty\n3)removeBall\n4)getRadius\n5)Exit\nEnter your choice:");
			int ch=s.nextInt();
			switch(ch)
			{
				case 1:n.addBall();
					break;
				case 2:n.isBagEmpty();
					break;
				case 3:n.removeBall();
					break;
				case 4:n.getRadius();
					break;
				case 5:System.exit(0);
				default:System.out.println("Enter the correct Input!");
			}
		}
	}
}
				
		