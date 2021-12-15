package ClassAndObjects;

public class CarObject 
{
	String Carname;
	String model;
	double price;
	public CarObject(String carname, String model, double price) {
		super();
		this.Carname = carname;
		this.model = model;
		this.price = price;
	}
	void CarDetails()
	{
		System.out.println("Car name is: "+Carname);
		System.out.println("Car model is: "+model);
		System.out.println("Car price is: "+price);
	}
	public static void main(String[] args)
	{
		CarObject obj1=new CarObject("MercedesBenz","2021",2100000);
		CarObject obj2=new CarObject("Chevorlet","2021",1400000);
		CarObject obj3=new CarObject("Bentley","2021",1800000);
		System.out.println("=======================");
		obj1.CarDetails();
		System.out.println("=======================");
		obj2.CarDetails();
		System.out.println("=======================");
		obj3.CarDetails();
		System.out.println("=======================");
		
		
	}

}


	


