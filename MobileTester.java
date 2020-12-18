package com.xworkz.InitialisingBlocks;

public class MobileTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile m=new Mobile("apple","red");
		System.out.println("the name of the Mobile is:"+m.brand);
		System.out.println("the color of the Mobile"+m.color);
		System.out.println("the price of mobile is"+m.price);
		Mobile m2=new Mobile("one plus","black");
		m2.price=50000.00;
		
		
		System.out.println("the name of the Mobile is:"+m2.brand);
		System.out.println("the color of the Mobile"+m2.color);
		System.out.println("the price of mobile is"+m2.price);

	}

}
