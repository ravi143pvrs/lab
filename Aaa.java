package Assignmentss;
 // author ravi kumar
// program for multilevel inheritance example
public class Aaa {

	void rose() {
		System.out.println("rose is symbole of love");
	}
	}
class B extends Aaa {
	void wrose() {
		System.out.println("white rose is the symbol of purity");
	}
	}
class C extends B {
	void yrose() {
		System.out.println("yellow rose is the symbol of friendship");
	}
	}
class Flowers {
	
	public static void main(String[] args) {
	C f=new C();
	f.rose();
	f.wrose();
	f.yrose();
	

	}

}
