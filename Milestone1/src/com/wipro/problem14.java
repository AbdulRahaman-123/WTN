package com.wipro.flow_control_statements;

public class problem14 
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int sum=0,r=0;
		while(n>0)
		{
			r=n%10;
			sum+=r;
			n=n/10;
		}
		System.out.println(sum);
	}

}
