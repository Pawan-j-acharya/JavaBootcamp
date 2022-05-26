 class A {
    int a=10;
    static int b=20;

}

class B extends A{
        int a=30;
        static int  b=70;

}
class Driver{
    B x=new B();
    System.out.println(x.a);
    System.out.println(x.b);

}
