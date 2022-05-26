package composition_car_engine;

public class CarDriver {
    public static void main(String[] args)
    {
        Car c=new Car("Black",2000000.00,"Audi",new Engine(500,2000));
        c.display();
        c.e.display();
    }
}
