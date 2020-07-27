package com.wipro.classandobject;

public class Example2 
{
		public static void main(String[] args) {
			  System.out.println(Calculate.powerDouble(7.8, 3));
			    System.out.println(Calculate.powerInt(5,2));
			    }

			
		}
			class Calculate
			{
			    static double powerInt(int num1,int num2)
			    {
			        return Math.pow(num1,num2);
			    }
			static double powerDouble(double num1,int num2)
			{
			    return Math.pow(num1,num2);
			}
			}
