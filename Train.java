package com.xworkz.staticmembers.fields;

public class Train {
	 String Tname;
	int Tno;
	String coach;
	static String Tcolor;
	static {
		System.out.println("In static block");
		Tcolor="blue";
	}
	Train()
	{
		System.out.println("No argument constructor");
	}
	
	Train(String iTname,int iTno,String icoach)
	{
		Tname=iTname;
		Tno=iTno;
		coach=icoach;
		
	}
	static void setTcolor(String Tcolor)
	{
		System.out.println("in static method");
		Tcolor="blue";
	}
 void displayDetails()
	{
	System.out.println("Tname="+Tname+"\n Tno="+Tno+"\n coach="+coach+" \nTcolor="+Tcolor);
	}

	// TODO Auto-generated method stub
	
}
