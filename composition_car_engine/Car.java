package composition_car_engine;

import com.sun.source.doctree.SystemPropertyTree;

public class Car {
    String color;
    double price;
    String brand;
    Engine e;

    Car(String color,double price,String brand,Engine e)
    {
        this.color=color;
        this.price=price;
        this.brand=brand;
        this.e=e;
    }
    public void display()
    {
        System.out.println("Car color:"+color);
        System.out.println("Car price:"+price);
        System.out.println("Car brand:"+brand);

    }
}
