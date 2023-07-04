import java.util.Scanner;
public class StrongNumber {
	public static boolean strong(int n)
	{
		int temp=n;
		int sum=0;
		while(n>0)
		{
			int r=n%10;
			int fact=1;
			for(int i=1;i<=r;i++)
			{
				fact=fact*i;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(sum==temp)
		{
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value");
		int a=sc.nextInt();
		boolean rs= strong(a);
		if(rs)		
		System.out.println(a+"is strong");
		else
			System.out.println(a+"is not strong");
		

	}

}
