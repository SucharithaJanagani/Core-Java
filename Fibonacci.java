
public class Fibonacci {
public static void main(String[] args) {
		int f=0,s=1,t;
		int n=19;
		System.out.println(f);
		System.out.println(s);
	
		for(int i=1;i<=n;i++)
		{
		
			t=f+s;
			System.out.println(t);
			f=s;
			s=t;
			
		}
		
	}

}
