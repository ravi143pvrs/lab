package Assignmentss;
//  program on abstract class
abstract class Abstractiontrig {
abstract void show();
}
class Circle extends Abstractiontrig {
	void show() {
		System.out.println("this is circle");
	}
	}
class Triangle extends Abstractiontrig {
	void show() {
		System.out.println("triangle");
	}
	}
class Tester {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Abstractiontrig obj;
obj=new Circle();
obj.show();
obj=new Triangle();
obj.show();
	}

}
