package org.jsp;

import java.util.Scanner;

public class DecimalToHexa {
	static String DecToHexa(int dec)
	{
	String hx="";
			do
			{
				int d=dec%16;
				switch(d)
				{
				case 10:
					hx='A'+hx;
			          break;
				case 11:
					hx='B'+hx;
			          break;
				case 12:
					hx='C'+hx;
			          break;
				case 13:
					hx='D'+hx;
			          break;
				case 14:
					hx='E'+hx;
			          break;
				case 15:
					hx='F'+hx;
			          break;
				default:
					hx=d+hx;
				}
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
