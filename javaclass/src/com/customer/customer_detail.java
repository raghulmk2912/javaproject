package com.customer;
import java.util.Scanner;
public class customer_detail {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value:");
		
		int n=s.nextInt();
		int c=0;
		while(n!=0)
		{
			n=n/10;
			c++;
		}
		System.out.println("the no.of.digit are:"+c);
	}

}
