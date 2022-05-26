import java.util.Scanner;
class MtoN
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the m value:");
		int m=s.nextInt();
		System.out.println("Enter the n value:");
		int n=s.nextInt();
		System.out.println();

		for(int i=m;i<=n;i++)
			System.out.println(i);
	}
}