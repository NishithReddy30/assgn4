package StaticClass;

class JavaStaticExample{
	//Let us deal with the static variable
	
	//Declare the static variables
	static int num;
	static String name;
	
	static {
		num=65;
		name="Nishith, this is static keyword in java";
	}
public class SingleStaticBlock {

	public static void main(String[] args) {
     // Single static block
		System.out.println("Value of a number is : " + num);
		System.out.println("Value of a string is : " + name);
	}

}
}
