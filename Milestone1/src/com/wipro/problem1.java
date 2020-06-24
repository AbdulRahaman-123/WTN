package com.wipro.Arrays;

public class problem1 
{
	public static void main(String args[]) 
	{
        int []arr=new int[] {1,32,23,4,15};  
        int sum=0,avg;  
        for (int i=0;i<arr.length;i++) 
        {  
           sum=sum+arr[i];  
        }  
        avg=sum/5;
        System.out.println("Sum of the array "+sum);
        System.out.println("the average is "+avg);
    }  
}
