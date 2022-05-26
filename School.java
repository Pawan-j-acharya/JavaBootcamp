import java.util.Scanner;
class School
{

	static int rollNO=21;
	static String name="pawan";
	static int age=16;
	static String schoolName="Kumbhashree English Medium School";
	
	static
	{
		System.out.println("...Student Details...");
	}
	
	
	public static  void schoolDetails()
	{
		System.out.println(" Name         :"+name);
		System.out.println(" Roll NO      :"+rollNO);
		System.out.println(" Age          :"+age);
		System.out.println(" School name  :"+schoolName);
		
	}
	public static void principalDetails(String pname,String pQualification,int pSalary)
	{
		
		System.out.println("principal Name:"+pname);
		System.out.println("principal Qualifications:"+pQualification);
		System.out.println("principal Salary:"+pSalary);
		
	}
			
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the principal name:");
		String pname=s.nextLine();
		System.out.println("Enter the principal Qualification:");
		String pQualification=s.nextLine();
		System.out.println("Enter the principal Salary:");
		int pSalary=s.nextInt();
		schoolDetails();
		principalDetails(pname,pQualification,pSalary);
		

	}
	
}