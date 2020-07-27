package com.wipro.Arrays;

public class problem3 
{
	public static void main(String args[])
	{
		int arr[]=new int[] {22,23,43,54,53};
		int i;
		int f=-1;
		int flag=Integer.parseInt(args[0]);
		for(i=0;i<arr.length;i++)
		{
			if(flag==arr[i])
			{
                 f=i;  				
			}
			else
				continue;
		}
		System.out.println(f);
	}

}
