class test_nested_if
{                                                        
	public static void main(String[] args)
	{
		int a=10,b=20,c=40;
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("a is the greatest");
			}
			else
			{
				System.out.println("c is the greatest");
			}
			
		}
		else if(b>a)
		{
			
			if(b>c)
			{
				System.out.println("b is the greatest");
			}
			else
		     {
			System.out.println("c is the greatest");
			}	
			
		}
		
	}
}

		
		
		