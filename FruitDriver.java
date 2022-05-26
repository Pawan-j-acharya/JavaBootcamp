class Fruit
{
}
class Apple extends Fruit
{
}
class Mango extends Fruit
{
}
class GreenApple extends Apple
{
}

class FruitDriver
{
public static void main(String[] args)
{
	/*
	Apple a=new Apple();
	Mango m=new Mango();
	GreenApple g=new GreenApple();
	Fruit f=new Fruit();
	
	System.out.println("-----Apple instance---");
	System.out.println(a instanceof Apple);
	System.out.println(a instanceof Fruit);
	//System.out.println(a instanceof Mango);
	System.out.println(a instanceof GreenApple);

	System.out.println("-----Mango instance---");
	//System.out.println(m instanceof Apple);
	System.out.println(m instanceof Fruit);
	System.out.println(m instanceof Mango);
	//System.out.println(m instanceof GreenApple);

	System.out.println("-----GreenApple instance---");
	System.out.println(g instanceof Apple);
	System.out.println(g instanceof Fruit);
	//System.out.println(g instanceof Mango);
	System.out.println(g instanceof GreenApple);

	System.out.println("-----Fruit instance---");
	System.out.println(f instanceof Apple);
	System.out.println(f instanceof Fruit);
	System.out.println(f instanceof Mango);
	System.out.println(f instanceof GreenApple);  */

	System.out.println("------------------------------------Upcasting-----------------------------");

	//Fruit f=new Mango();
	Fruit f=new Apple();
	System.out.println(f instanceof Apple);
	System.out.println(f instanceof Fruit);
	System.out.println(f instanceof Mango);
	System.out.println(f instanceof GreenApple);

	
	
	
	
}
}