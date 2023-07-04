import java.util.Scanner;
public class NeonNumber {
	static boolean neon(int n)
	{
		int sq=n*n,t=n;
		int sum=0;
		while(sq>0)
		{
			int r=sq%10;
			sum=sum+r;
			sq=sq/10;
		}
		return t==sum;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		boolean rs=neon(n);
		if(rs)
			System.out.println(n+"neon");
		else
			System.out.println(n+"not neon");
	}

}
