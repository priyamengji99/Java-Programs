package com.xworkz.encapsulation;

public class Bank {
	public String name;
	public String AccNo;
	private double balance;
	public Bank(String iAccNo,String iname)
	{
		AccNo=iAccNo;
		name=iname;
		balance=15000.00;
		
	}
	void withdraawal(double ammount)
	{
		if(ammount>0 && ammount<balance)
		balance=balance-ammount;
		else
			System.out.println("enter ammount greater than 0");
		
	}
	void deposit(double ammount)
	{
		balance=balance+ammount;
	}
	void checkbalance()
	{
		System.out.println("acno   "+AccNo+"\nbalance "+balance);
	}
	

}
