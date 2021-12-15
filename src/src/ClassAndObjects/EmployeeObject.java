package ClassAndObjects;

public class EmployeeObject 
{
	//Declaring the variables
	//Employee is a Object
	//Employee has a employee name,employee ID,and Job location
	String Ename;
	String Eid;
	String Location;
	//Constructor
	public EmployeeObject(String ename, String Eid, String Location) {
		super();
		Ename = ename;
		this.Eid = Eid;
		this.Location = Location;
	}
	//Creating method
	void EmployeeDetails()
	{
		//Printing Employee Details
		System.out.println("Employee name is: "+Ename);
		System.out.println("Employee id is: "+Eid);
		System.out.println("Employee Working location is: "+Location);
	}
	public static void main(String[] args) 
	{
		//Creating objects for the class
		EmployeeObject obj1=new EmployeeObject("Nishith","E414626","Mumbai");
		EmployeeObject obj2=new EmployeeObject("Karthik","E415236","Bangalore");
		EmployeeObject obj3=new EmployeeObject("Vikas","E213321","Bangalore");
		System.out.println("=====================================");
		//Method calling with object reference
		obj1.EmployeeDetails();
		System.out.println("=====================================");
		obj2.EmployeeDetails();
		System.out.println("=====================================");
		obj3.EmployeeDetails();
		System.out.println("=====================================");
		
	}

}

