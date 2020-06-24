package com.wipro.flow_control_statements;

public class problem17 
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int o;
		o=n;
		int r=0, rev=0;
		while(n>0)
		{
			r=n%10;
			rev=rev*10+r;
			n=n/10;
		}
		if(o==rev)
		{
			System.out.println(o+" is a palindrome");
		}
		else
		{
			System.out.println(o+" is not a palindrome");
		}
	}

}
