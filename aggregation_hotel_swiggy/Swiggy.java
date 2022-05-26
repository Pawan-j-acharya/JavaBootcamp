 class Swiggy {
        int  order_no;
        float price;
        String location;

        Swiggy(int order_no,float price,String location)
        {
            this.order_no=order_no;
            this.price=price;
            this.location=location;
        }

	 public String toString()
	 {
		return "Order No:"+order_no+"\nOrder price:"+price+"\nOrder location:"+location;
	 }
}
