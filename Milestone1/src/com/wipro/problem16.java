package com.wipro.flow_control_statements;

public class problem16 
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int r=0;
		while(n>0)
		{
			r=n%10;
			System.out.print(r);
			n=n/10;
		}
	}

}
