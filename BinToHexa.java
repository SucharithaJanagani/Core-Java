package org.jsp;

import java.util.Scanner;
public class BinToHexa {
	static int binToHexa(int bin)
	{
	int Hex=0,pw=1;
		do
		{
			int d=bin%16;
			Hex=Hex+d*pw;
			pw=pw*2;
			bin=bin/16;
		}while(bin!=0);
		return Hex;
		
	}
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		    System.out.println("Enter bin number");
		    int bin=sc.nextInt();
		    int h=binToHexa(bin);
		    System.out.println(h);
	}

}
