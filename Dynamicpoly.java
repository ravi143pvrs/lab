package Assignmentss;

public class Dynamicpoly {
	void run() {
		System.out.println("method is not private");
	}
}
	class Dynamo extends Dynamicpoly {
		void run() {
			System.out.println("method implementation is changed");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dynamo obj=new Dynamo();
		obj.run();
	}

}
