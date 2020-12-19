package com.xworkz.staticmembers.fields;

public class TrainTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Train yesvanthpurexpress=new Train("yesvanthpurexpress",1205,"sleeper");
		yesvanthpurexpress.displayDetails();
		Train.setTcolor("blue");
		System.out.println("----------------------");
		Train HussanSagar=new Train("HussanSagar",1204,"Ac");
		HussanSagar.displayDetails();
		System.out.println("------------------------------");
		Train ShatabdiExpress=new Train("ShatabdiExpress",1289,"Ac");
		ShatabdiExpress.displayDetails();
		System.out.println("-------------------------------------");
		Train uudyan=new Train("uudyan",1889,"Ac");
		uudyan.displayDetails();
		
		
		
	
		
		

	}

}
