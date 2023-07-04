package programming;
import java.util.Scanner;
public class DuckNumber
{
	static boolean isDuckNumber(int x)
	{
		while(x!=0)
		{
       int d=x%10;
       if(d==0)
			
				return true;
       x=x/10;
			
			}
			return false;
		}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		boolean rs=isDuckNumber(n);
		if(rs)
			System.out.println(n+"is Duck Number");
		else
			System.out.println(n+"is not a duck number");
	
	}
}