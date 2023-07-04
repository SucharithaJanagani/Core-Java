import java.util.Scanner;
public class Fact {
    public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int n=sc.nextInt();
		int res=fact(n);
		System.out.println(res);
	}
	public static int fact(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
		fact=fact*i;
	}
		return fact;
	}
}

	


