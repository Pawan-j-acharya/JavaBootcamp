package Upcasting;

public class Driver {
    public static void main(String[] args) {
        Parent p = new Child();
        Child a = (Child) p;
        System.out.println(a.a);
        a.m1();
        System.out.println(a.b);
        a.m2();

    }


}
