
import java.util.Scanner;


//--------------------------------------class ticket------------------------------------

class Ticket{

    private int ticketNo;
    private String arrPlace;
    private String deptPlace;
    private int noOfTickets;

    Ticket()
    {
    }


    Ticket(int ticketNo)
    {
        this.ticketNo=ticketNo;
    }

    Ticket(int ticketNo,String arrPlace)
    {
        this(ticketNo);
        this.arrPlace=arrPlace;
    }

    Ticket(int ticketNo,String arrPlace,String deptPlace)
    {
        this(ticketNo,arrPlace);
        this.deptPlace=deptPlace;
    }

    Ticket(int ticketNo,String arrPlace,String deptPlace,int noOfTickets)
    {
        this(ticketNo,arrPlace,deptPlace);
        this.noOfTickets=noOfTickets;
    }

    public int getTicketNo()
    {
        return ticketNo;

    }

    public String getArrPlace()
    {
        return arrPlace;
    }

    public String getDeptPlace()
    {
        return deptPlace;
    }

    public int getNoOfTickets()
    {
        return noOfTickets;
    }

    public void setTicketNo(int ticketNo)
    {
        this.ticketNo=ticketNo;
    }

    public void setArrPlace(String arrPlace)
    {
        this.arrPlace=arrPlace;
    }

    public void setDeptPlace(String deptPlace)
    {
        this.deptPlace=deptPlace;
    }

    public void setNoOfTickets(int noOfTickets)
    {
        this.noOfTickets=noOfTickets;
    }
}

//------------------------------class redbus-------------------------------------------

 class RedBus{

    String busName;
    int  busNo;
    Ticket t;

    RedBus()
    {
    }

    RedBus(String busName)
    {
        this.busName=busName;
    }

    RedBus(String busName,int busNo)
    {
        this(busName);
        this.busNo=busNo;
    }

    public void bookTicket()
    {
        if(this.t==null)
        {
            Scanner s=new Scanner(System.in);
            System.out.println("\nEnter the ticket no      :");
            int a=s.nextInt();
            System.out.println("\nEnter the Arrival plcae  :");
            String b=s.next();
            System.out.println("\nEnter the departure place:");
            String c=s.next();
            System.out.println("\nEnter the no of tickets  :");
            int d=s.nextInt();
		System.out.println("\nEnter the name of bus    :");
            busName=s.next();
		System.out.println("\nEnter the bus no         :");
            busNo=s.nextInt();
            this.t=new Ticket(a,b,c,d);
            System.out.println("\nticket has been booked successfully\n");
        }
        else
        {
            System.out.println("\nticket is already booked!\n");
        }
    }

    public void ticketDetails()
    {
       if(this.t!=null)
	 {
        System.out.println("\nticket no      :"+t.getTicketNo());
        System.out.println("arrival place  :"+t.getArrPlace());
        System.out.println("departure place:"+t.getDeptPlace());
        System.out.println("no of tickets  :"+t.getNoOfTickets());
	}
	else
	{
		System.out.println("\nNO TICKET HAS BEEN BOOKED\n");
	}

    }

    public void busDetails()
    {
	 if(this.t!=null)
	 {
        System.out.println("Bus name :"+busName);
        System.out.println("Bus No   :"+busNo);
	}
	else
	{
		System.out.println("\nNO TICKET HAS BEEN BOOKED\n");
	}
    }

    public void updateArr()
    {
       if(this.t!=null)
	 {
        Scanner s1=new Scanner(System.in);
        System.out.println("Enter the new arrival place:");
        String a=s1.nextLine();
        t.setArrPlace(a);
        System.out.println("\nSuccessfully updated!\n");
	 }
	else
	{
		System.out.println("\nNO TICKET HAS BEEN BOOKED\n");
	}
    }

    public void updateDept()
    {
	 if(this.t!=null)
	 {
        Scanner s2=new Scanner(System.in);
        System.out.println("Enter the new departure place:");
        String b=s2.nextLine();
        t.setDeptPlace(b);
        System.out.println("\nSuccessfully updated!\n");
	}
	else
	{
		System.out.println("\nNO TICKET HAS BEEN BOOKED\n");
	}
    }

    public void cancleTicket()
    {
        if(this.t!=null)
        {
            this.t=null;
            System.out.println("\nTicket has been cancelled!\n");
        }
        else
        {
            System.out.println("\nNo booking has been done!\n");
        }
    }

}

//--------------------------------class RedBusDriver-------------------------------------



public class RedBusDriver {

    public static void main(String[] args)
    {
        RedBus r=new RedBus();
        Scanner s=new Scanner(System.in);
        while(true)
        {
            System.out.println("1)Book Ticket\n2)Ticket details\n3)Bus details\n4)update arrival\n5)update departure\n6)cancel ticket\n7)Exit\nEnter your choice:");
            int ch=s.nextInt();
            switch(ch)
            {
                case 1:r.bookTicket();
                         break;
                case 2:r.ticketDetails();
                         break;
                case 3:r.busDetails();
                        break;
                case 4:r.updateArr();
                        break;
                case 5:r.updateDept();
                        break;
                case 6:r.cancleTicket();
                        break;
                case 7:System.exit(0);
			default:System.out.println("\nEnter the correct input!!\n");
            }
        }

    }
}