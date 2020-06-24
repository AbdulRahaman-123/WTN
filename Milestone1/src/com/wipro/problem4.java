package com.wipro.Arrays;

public class problem4 
{
	public static void main(String args[])
	{
		int []arr=new int[] {68,73,69,76,82};
		String s=null;
		for(int i:arr)
		{
			s=Character.toString((char)i);
			System.out.println(s);
		}
		
	}

}
