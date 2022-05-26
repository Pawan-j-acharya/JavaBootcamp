package composition_aeroplane_airport;

public class Airport {
        String location;
        int capacity;
        int no_of_flights;
        Aeroplane a;

        Airport(String location,int capacity,int no_of_flights,Aeroplane a)
        {
                this.location=location;
                this.capacity=capacity;
                this.no_of_flights=no_of_flights;
                this.a=a;
        }

        public void display()
        {
                System.out.println("Airport location:"+location);
                System.out.println("Airport capacity:"+capacity);
                System.out.println("Airport no of flights:"+no_of_flights);
        }

        public void displayA()
        {
                System.out.println("Aeroplane color:"+a.color);
                System.out.println("Airport Brand:"+a.brand);
                System.out.println("Airport capacity:"+a.capacity);
        }

}
