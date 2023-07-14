package org.jsp;

import java.util.Scanner;

public class BinToOctal {
	static int binToOct(int bin)
	{
	int oct=0,pw=1;
			do
			{
				int d=bin%8;
				oct=oct+d*pw;
				pw=pw*2;
				bin=bin/8;
			}while(bin!=0);
			return oct;
			}
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		    System.out.println("Enter bin number");
		    int bin=sc.nextInt();
		    int o=binToOct(bin);
		    System.out.println(o);
	}


	}



