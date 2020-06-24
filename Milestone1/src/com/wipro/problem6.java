package com.wipro.flow_control_statements;

public class problem6
{
	public static void main(String []args)
	{
		String gender=args[0];
		int age=Integer.parseInt(args[1]);
		double interest;
		if(gender=="Female"&&(age>=1 && age<=58))
		interest=8.2;
		else if(gender=="Female"&&(age>=59 && age<=100))
		interest=9.2;
		else if(gender=="male"&&(age>=1 && age<=58))
		interest=8.4;
		else
		interest=10.5;
		System.out.println("percentage of interest is "+" "+interest+"%");
	}
		
}

