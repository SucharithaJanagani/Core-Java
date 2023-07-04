package programming;
import java.util.Scanner;
public class SumOfDivisors {
	static int num(int n)
	{
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				sum=sum+i;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value:");
		int n=sc.nextInt();
		int rs=num(n);
		
	
		System.out.println(rs);
	}

}
