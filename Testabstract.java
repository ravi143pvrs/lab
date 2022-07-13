package Assignmentss;
// basic abstraction class program
abstract class Testabstract {

	void bike() {
		System.out.println("Bike is ctreated");
	}
	abstract void run();
		
	
	void changeSpeed() {
		System.out.println("speed changed ");
	}
}
class Child1 extends Testabstract {
	void run() {
		System.out.println("Running safely ");
	}
}
class Testabstraction1 {
	public static void main(String[] args) {
		Testabstract obj=new Child1();
		obj.run();
		obj.changeSpeed();
	}
}
