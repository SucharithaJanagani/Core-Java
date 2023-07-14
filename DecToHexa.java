package org. jsp;

import java. util.Scanner;

public class DecToHexa {
	static String DecToHexa(int dec)
	{
	String hx="";
			do
			{
				int d=dec%16;
				if(d<10)
					hx=d+hx;
				else if(d==10)
					hx='A'+hx;
				else if(d==11)
					hx='B'+hx;
				else if(d==12)
					hx='C'+hx;
				else if(d==13)
					hx='D'+hx;
				else if(d==14)
					hx='E'+hx;
				else if(d==15)
					hx='F'+hx;
				dec=dec/16;
			}while(dec!=0);
			return hx;
}
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	    System.out.println("Enter decimal number");
	    int d=sc.nextInt();
	   String h=DecToHexa(d);
	    System.out.println(h );

}

}
