package Ineritanceconcepts;

public class Aggrigation {  // class 1

	int squre(int n) {
		return n*n;
	}
}
class circle {  // class 2
	Aggrigation ag;  // object entity ref line 1
	double pi=3.14;
	double area(int radius) {
		ag = new Aggrigation();  // line 2
		int psqure = ag.squre(radius);
		return pi*psqure;
	}
	public static void main(String[] args) {  //  main method
		circle c = new circle();
		double result=c.area(5);  // pi*radius*radius
		System.out.println(result);
	}
}