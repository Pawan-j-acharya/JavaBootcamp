package composition_aeroplane_airport;

public class AirportDriver
{
    public static void main(String[] args)
    {
        Airport a1=new Airport("mangalore",200,70,new Aeroplane("white","king fisher",200));
        a1.display();
        a1.displayA();
    }
}
