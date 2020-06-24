package com.wipro.flow_control_statements;

public class problem7
{
	public static void main(String []args){

		int ch='z';
		int temp=ch;
		if(ch>64 && ch<91)
		ch=ch+32;
		else if(ch>96 && ch<123)
		ch=ch-32;

		System.out.println((char)temp+"->"+(char)ch);
	}

}
