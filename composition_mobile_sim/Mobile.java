package composition_mobile_sim;

public class Mobile {
    String brand;
    String color;
    float price;
    int ram;
    Sim s;

    Mobile(String brand,String color,float price,int ram,Sim s)
    {
        this.brand=brand;
        this.color=color;
        this.price=price;
        this.ram=ram;
        this.s=s;
    }

    public void displayM()
    {
        System.out.println("Mobile brand:"+brand);
        System.out.println("Mobile color:"+color);
        System.out.println("Mobile price:"+price);
        System.out.println("Mobile ram:"+ram);

    }

    public void displayS()
    {
        System.out.println("Sim talktime:"+s.talktime);
        System.out.println("Sim Service Provider::"+s.serviceProvider);
        System.out.println("Sim phone no:"+s.phoneNO);

    }

}
