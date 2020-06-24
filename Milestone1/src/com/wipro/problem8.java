package com.wipro.Arrays;

public class problem8 
{
	public static void main(String []args)
	{
		int sum=0,f1=0,f=0;
		int nosum=0;
		int a[]=new int [] {22,2,6,43,5,2};
		if(a.length<1)
		{
			System.out.println(a[0]);
		}
		else
		{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==6)
			{
				f1=i;
			}
			else if(a[i]==7)
			{
				f=i;
			}
			else
				continue;
			}
	}
		if((f>f1)&&(f!=0)&&(f1!=0))
		{
		for(int k=0;k<f1;k++)
		{
			sum=sum+a[k];
		}
		for(int l=f+1;l<a.length;l++)
		{
			nosum=nosum+a[l];
		}
		System.out.println(sum+nosum);
		}
		else
		{
			for(int b=0;b<a.length;b++)
			{
				sum=sum+a[b];
			}
			System.out.println(sum);
		}
}
}