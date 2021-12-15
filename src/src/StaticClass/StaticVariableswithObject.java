package StaticClass;

public class StaticVariableswithObject {
     //Static variables are shared among all instances of the class
	//Static integer variable
	static int variable_num=71;
	//non-static string variable
	String name;
	
	public static void main(String[] args) {
    // Create an object for the non-static variable
	//However, we do not need to create an object for static variable
	//Since they can be accessed directly.
		StaticVariableswithObject object = new StaticVariableswithObject();
		StaticVariableswithObject object = new StaticVariableswithObject();
		
		//Assigning the value to static variable using the "object"
		object.name="I am non-static variale";
		object.variable_num=100; //This value is going to be overwrite
		System.out.println("==========================================");
		Object.name="I am also a non-static variable";
		Object.variable_num=200; // This value is going to be overwrite
		System.out.println("====Below values are coming from first object i.e., 'object' ");

	}

}
