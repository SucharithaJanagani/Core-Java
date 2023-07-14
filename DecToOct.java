package org.jsp;

import java.util.Scanner;

public class DecToOct {
	static String DecToOct(int dec)
	{
	String oct="";
			do
			{
				int d=dec%8;
				oct=d+oct;
				dec=dec/8;
			}while(dec!=0);
			return oct;
}
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	    System.out.println("Enter decimal number");
	    int d=sc.nextInt();
	   String b=DecToOct(d);
	    System.out.println(b);

}

}
