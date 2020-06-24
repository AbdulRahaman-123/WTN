package com.wipro.Arrays;
public class problem2 
{
	public static void main(String args[])
	{
		int []arr=new int[] {2,23,45,1,16};
		int max=arr[0];
		  for(int i=1;i<arr.length;i++)
		  {
		    if(arr[i]>max){
		      max= arr[i];
		    }
		  }
		  System.out.println("max is "+max);
		  int min=arr[0];
		  for(int i=1;i<arr.length;i++)
		  {
		    if(arr[i]<min)
		    {
		      min=arr[i];
		    }
		  }
		  System.out.println("min is "+min);
		  
	
	}

}
