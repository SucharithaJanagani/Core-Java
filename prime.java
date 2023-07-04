public class prime {
public static void main(String[] args) {
		primeOrNot(5);
		primeOrNot(87);
		primeOrNot(18);
		primeOrNot(80);
		primeOrNot(182);
	}
	public static void primeOrNot(int n)
	{
		int count=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		if(count==2)
			System.out.println("prime");
		else
			System.out.println("not prime");
			
	}

}
