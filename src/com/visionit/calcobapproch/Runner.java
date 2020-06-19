package com.visionit.calcobapproch;

public class Runner {
	
	
	public static void main(String[]args)
	{
	//Add
		
	 Add addition=new Add(10,5);
	 addition.addop();
	 int resofadd=addition.getResult();
	 System.out.println("Addition result  :"  +resofadd);
	 
	 
	 //sub
	 sub substraction=new sub(10,5);
	 substraction.subop();
	 int resofsub=substraction.getResult();
	 System.out.println("Substraction result  :"  +resofsub);
	 
	 //mul
	 mul multiplication=new mul(10,5);
	 multiplication.mulop();
	 int resofmul=multiplication.getResult();
	 System.out.println("Multiplication result  :"  +resofmul);
	 
	 
	 //div
	Div division=new Div(10,5);
	division.divop();
	int resofDiv=division.getResult();
	System.out.println("Divison Result  :"  +resofDiv);
	 
	 
	}
	

}
