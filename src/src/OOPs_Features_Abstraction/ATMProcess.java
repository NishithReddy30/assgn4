package OOPs_Features_Abstraction;
//Abstract class
abstract class bankProcess{
	//abstract methods
	
	public abstract void account();
	//Regular process of bank
     public void credit() {
     System.out.println("Money Creditted");
	 System.out.println("But how???");
 }
}
//subclass
class Accounts extends bankProcess{
	public void Imps() {
		System.out.println("Money credited through IMPS");
	}
 public void NEFT() {
	System.out.println("Money credited through NEFT");
}
public void cash() {
	System.out.println("Money credited through cash");
}
public void cheques() {
	System.out.println("Money credited through cheque");
}
  
   public void account() {
   return;
  }
}
public class ATMProcess {

	public static void main(String[] args) {
     System.out.println();
     Accounts object = new Accounts();
     object.credit();
     object.Imps();
     object.NEFT();
     object.cheques();
     object.cash();
	}

}
