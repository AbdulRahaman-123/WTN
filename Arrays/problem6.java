package com.wipro.Arrays;

public class problem6
{
	public static void main(String args[])
	{
		int arr[]=new int [] {22,2,1,43,5};
		int temp;
		 for (int i=0;i<arr.length;i++) 
	        {
	            for (int j=i+1;j<arr.length;j++) 
	            {
	                if (arr[i]>arr[j]) 
	                {
	                    temp=arr[i];
	                    arr[i]=arr[j];
	                    arr[j]=temp;
	                }
	            }
	        }
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(" "+arr[i]);
		}
		
	}

}
