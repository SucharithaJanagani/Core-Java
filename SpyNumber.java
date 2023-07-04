public class SpyNumber {
	public static void main(String[] args)
	{
		int n=1234;
		int sum=0,prod=1;
		
		while(n!=0)
		{
			int d=n%10;
			sum=sum+d;
			prod=prod*d;
			n=n/10;
		}
		if(sum==prod)
			System.out.println("Spy");
		else
			System.out.println("not spy");
	}

}

