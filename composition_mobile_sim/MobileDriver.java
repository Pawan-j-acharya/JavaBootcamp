package composition_mobile_sim;

public class MobileDriver {
    public static void main(String[] args)
    {
        Mobile m=new Mobile("IQOO","black",17000,16,new Sim(199,"jio",937937593));
                m.displayM();
                m.displayS();
    }
}
