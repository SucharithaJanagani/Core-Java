import java.util.Scanner;
public class fiboalternative {

	public static void main(String[] arg){
		Scanner input=new Scanner(System.in);
		System.out.println("enter n value:");
		int n=input.nextInt();
		int a=0,b=1,c=0;
		if(n==1)
			System.out.println(a+""+b);
		for(int i=3;i<=n;i++)
		{
			c=a+b;
			if(i%2!=0)
			{
				System.out.println(c);
			}
			a=b;
			b=c;
		}

	}

}
