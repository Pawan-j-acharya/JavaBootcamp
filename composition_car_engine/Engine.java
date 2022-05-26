package composition_car_engine;

public class Engine {
    int cc;
    int eng_no;

    Engine(int cc,int eng_no)
    {
        this.cc=cc;
        this.eng_no=eng_no;
    }
    public  void display()
    {

        System.out.println("Engine cc:"+cc);
        System.out.println("Car eng_no:"+eng_no);
    }
}
