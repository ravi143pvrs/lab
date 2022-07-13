package Assignmentss;
// program on abstraction demo

abstract class Abstractdemo {
abstract void run();
}
class Child extends Abstractdemo {
	void run() {
		System.out.println("running mode is always on");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Child obj = new Child();
obj.run();
	}

}
