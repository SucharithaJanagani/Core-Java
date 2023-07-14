package org.jsp;

import java.util.Scanner;

public class DecimalToBin {
	static String DecToBin(int dec)
	{
	String bin="";
			do
			{
				int d=dec%2;
				bin=d+bin;
				dec=dec/2;
			}while(dec!=0);
			return bin;
}
public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	    System.out.println("Enter decimal number");
	    int d=sc.nextInt();
	   String b=DecToBin(d);
	    System.out.println(b);

}
}
