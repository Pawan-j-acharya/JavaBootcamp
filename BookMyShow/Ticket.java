package BookMyShow;

public class Ticket {
    private int ticketNo;
    private float price;
    private String movieName;
    private String date;


    public int getticketNo()
    {
        return ticketNo;
    }

    public float getprice()
    {
        return price;
    }

    public String getmovieName()
    {
        return movieName;
    }

    public String getdate()
    {
        return date;
    }

    public void setticketNo(int ticketNo)
    {
        this.ticketNo=ticketNo;
    }

    public void setprice(float price)
    {
        this.price=price;
    }

    public void setmovieName(float movieName)
    {
        this.movieName=movieName;
    }
    public void date(float date)
    {
        this.date=date;
    }
}
