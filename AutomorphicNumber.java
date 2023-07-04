package Patterns;
import java.util.Scanner;
public class AutomorphicNumber {
 public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sc.nextInt();
		boolean rs=check(n);
		if(rs)
			System.out.println("Automorphic");
		else
			System.out.println("not automorphic");
	}
	static boolean check(int n)
	{
		int sq=n*n;
		while(n>0&&sq>0)
		{
			int r=n%10;
			int s=sq%10;
			if(r!=s) {
		}
				
			n=n/10;
			sq=sq/10;
		}
		return n==0;
			
			}
		}
		

	


