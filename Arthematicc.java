package Assignmentss;
 // author ravi kumar
// program for addition of values using single inheritance
public class Arthematicc {  // parent class

	public int add(int a, int b) {  //values are returning
		return a+b;
		
	}
}
class Add extends Arthematicc {  // child class inherit arguments from parent class
	
	public static void main(String[] args) {  // main class
	
		Arthematicc a=new Arthematicc();
		System.out.println("the addition of two values is ");
		System.out.println(a.add(20, 30));  //values are doing operation and displayed in the console 

	}

}
