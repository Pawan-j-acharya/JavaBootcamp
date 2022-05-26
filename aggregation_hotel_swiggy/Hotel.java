package aggregation_hotel_swiggy;

public class Hotel {
    int capacity;
    String hotel_name;
    String owner_name;
    Swiggy s;

    Hotel(int capacity,String hotel_name,String owner_name)
    {
        this.capacity=capacity;
        this.hotel_name=hotel_name;
        this.owner_name=owner_name;
    }
	
	public String toString()
	{
		return "Hotel capacity:"+capacity+"\n"Hotel name:"+hotel_name+"\n"Order name:"+owner_name;
	}

    public void bookOrder()
    {
      this.s=new Swiggy(125,200.0f,"Bangalore");
      System.out.println("Object created successfully");
    }
     public void showSwiggyDetails()
    {
        System.out.println("Order No:"+s.order_no);
        System.out.println("Order price:"+s.price);;
        System.out.println("Order location:"+s.location);
	  System.out.println();
    }
    public void showHotelDetails()
    {
	  
        System.out.println("Hotel capacity:"+capacity);
        System.out.println("Hotel name:"+hotel_name);;
        System.out.println("Order name:"+owner_name);
    }
    public void cancleOrder()
    {
        this.s=null;
        System.out.println("Order is canceled successfully");

    }
}
