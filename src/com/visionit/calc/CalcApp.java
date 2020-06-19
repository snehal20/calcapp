package com.visionit.calc;
/**
 * 
 * @author snehal
 *
 */
public class CalcApp {
	
	static int num1;
	static int num2;
	static int result;
	
	public static void addition()
	{
		result=num1+num2;
	}
	
	
	public static void subtraction()
	{
		result=num1-num2;
		
	}
	
	public static void multiplication()
	{
		result=num1*num2;
		
	}
	
	public static void division()
	{
		result=num1/num2;
		
	}
	
	
	public static void main(String[]args)
	{
		num1=20;
		num2=10;
		
		addition();
		System.out.println("addition :" + result);
		
		subtraction();
		System.out.println("subtraction :" + result);
		
		multiplication();
		System.out.println("multiplication :" + result);
		
		division();
		System.out.println("division :" + result);
		
	}

}
