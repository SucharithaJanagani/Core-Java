import java.util.Scanner;
public class Reverse {
public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("enter a number");
	int n=sc.nextInt();
		int res=reverse(n);
		System.out.println(res);
	}
	public static int reverse(int num)
	{
		int reverse=0;
		while(num!=0)
		{
			int last=num%10;
			reverse=reverse*10+last;
			num= num/10;
		}
		return reverse;
	}
	

}
