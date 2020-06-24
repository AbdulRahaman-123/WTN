package com.wipro.flow_control_statements;

public class problem12 
{
	public static void main(String args[])
	{
		int n=Integer.parseInt(args[0]);
		boolean flag=false;
		for(int i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                flag = true;
                break;
            }
        }
		if(n>0)
		{

        if (flag==false)
            System.out.println( "prime number");
		}
        else if(n==0) 
            System.out.println("not a prime number");
        else 
            System.out.println("not a prime number");
		
		
	}

}
