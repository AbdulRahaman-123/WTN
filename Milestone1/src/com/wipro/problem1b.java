package com.wipro.flow_control_statements;

public class problem1b 
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		int n1=Integer.parseInt(args[1]);
		int k=n%10;
		int y=n1%10;
		if(k==y)
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
	}

}
