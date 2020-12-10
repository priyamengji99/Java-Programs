
public class CarTypeTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarType Toyata=new CarType("Toyata",150000,"petrol");
		Toyata.color="black";
		Toyata.mileage=17.5;
		System.out.println("the model of the car is: "+Toyata.model);
		System.out.println("the cost of the car is: "+Toyata.cost);
		System.out.println("the fueltype of the car is: "+Toyata.fueltype);
		System.out.println("the color of the car is: "+Toyata.color);
		System.out.println("the mileage of the car is: "+Toyata.mileage);
		
		CarType Maruti=new CarType("Maruti",600000,"petrol","white");
		Toyata.mileage=12;
		System.out.println("the model of the car is: "+Maruti.model);
		System.out.println("the cost of the car is: "+Maruti.cost);
		System.out.println("the fueltype of the car is: "+Maruti.fueltype);
		System.out.println("the color of the car is: "+Maruti.color);
		System.out.println("the mileage of the car is: "+Maruti.mileage);
		
	}

}
