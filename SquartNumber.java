package Patterns;
import java.util.Scanner;
public class SquartNumber{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any num");
		double n=sc.nextInt();
		double rs=pow(n);
		System.out.println(rs);
}
public static double pow(double n)
{
	double t=0.0,sq=n/2;
	while((t-sq)!=0)
	{
		t=sq;
		sq=(t+(n/t))/2;
	}
	return sq;
}
}