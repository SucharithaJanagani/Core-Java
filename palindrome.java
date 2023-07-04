import java.util.Scanner;
public class palindrome {
public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("enter any num:");
		int num=input.nextInt();
		int reverse=0,temp;
		temp=num;
		while(num!=0)
		{
		int last=num%10;
		reverse=reverse*10+last;
		num=num/10;
		}
		if(temp==reverse)
		System.out.println("palindrome");
		else  
			System.out.println("not a palindrome");
	}
}
		
		

	


