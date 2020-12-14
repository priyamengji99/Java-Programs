package com.xworkz.accessmodifier.protectedmodifier;

public class TvTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv tv=new Tv("sony",50000);
		System.out.println("the brand of Tv is:"+tv.brand);
		System.out.println("the price of Tv is:"+tv.price);
		tv.ChangingChannels();
		

	}

}
