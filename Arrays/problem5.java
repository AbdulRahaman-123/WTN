package com.wipro.Arrays;

public class problem5 
{
	public static void main(String args[])
	{
	int arr[]=new int[] {2,23,45,1,16};
	int max1=arr[0];
	int max2=arr[1];
	int temp;
	if (max1<max2)
	{
	    temp=max1;
		max1=max2;
		max2=temp;
	}

	for (int i=1;i<arr.length;i++)
	{
		if (arr[i]>max1)
		{
			max2=max1;
		    max1=arr[i];
		}
		else if (arr[i]>max2 && arr[i]!=max1)
		{
			max2 = arr[i];
		}
	}

	System.out.println ("The First largest is " +max1);
	System.out.println ("The Second largest is " +max2);
	int min1=arr[0];
	int min2=arr[1];
	int temp1;
	if (min1>min2)
	{
	    temp1=min1;
		min1=min2;
		min2=temp1;
	}

	for (int i=1;i<arr.length;i++)
	{
		if (arr[i]<min1)
		{
			min2=min1;
		    min1=arr[i];
		}
		else if (arr[i]<min2 && arr[i]!=min1)
		{
			min2 = arr[i];
		}
	}

	System.out.println ("The First smallest is " +min1);
	System.out.println ("The Second smallest is " +min2);



}
}