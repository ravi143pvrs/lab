package Assignmentss;
  // author ravi kumar
 // program on interests of banks
public class Bankss { 

	public float getRateOfInterest() {
		return 0;
		
	}
}
class SBI extends Bankss {
	
	public float getRateOfInterest() {
		return 7;
	}
	}
class ICICI extends Bankss {
	
	public float getRateOfInterest() {
		return 8;
	}
	}
class AXIS extends Bankss {
	
	public float getRateOfInterest() {
		return 9;
	}
	}
class Interestss {
		public static void main(String[] args) {  //main class
	SBI ob1=new SBI();  // calling objects from above methods
	ICICI ob2=new ICICI();
	AXIS ob3=new AXIS();
	System.out.println("interest of sbi is: "+ob1.getRateOfInterest()); //displayed the results in console
	System.out.println("interest of icici is: "+ob2.getRateOfInterest());
	System.out.println("interest of axis is: "+ob3.getRateOfInterest());

	}

}
