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
	Apple a=new Apple();

	System.out.println(a instanceof Apple);
	System.out.println(a instanceof Fruit);
	//System.out.println(a instanceof Mango);
	System.out.println(a instanceof GreenApple);
}
}