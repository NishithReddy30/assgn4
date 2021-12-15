package StaticClass;

public class MultipleStaticBlock {

	static int num;
	static String mystr;
	
	//first static block
	static {
		System.out.println("static block-1");
		num=68;
		mystr="First static block ";
	}
	//Second static block
	static {
		System.out.println("static block-2");
		num=69;
		mystr="Second static block";
	}
	//Third static block
	static {
		System.out.println("static block-3");
		num=70;
		mystr="Third static block";
	}
	//Fourth static block
	static {
		System.out.println("static block-4");
		num=80;
		mystr="Fourth static block";
	}
	public static void main(String[] args) {
    //Multiple Static block
		System.out.println("Value of num : " + num);
		System.out.println("Value of mystr : " + mystr);
	}

}
