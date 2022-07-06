package Ineritanceconcepts;

public class Simpleineritance {
String x="ravi";
int a=50;

}
class anu extends Simpleineritance {
	String y ="dhanu";
	int b=40;
	int c=a+b;
	public static void main(String[] args) {
		anu obj=new anu();
		System.out.println("addition of a+b is "+obj.c);
	    System.out.println("the string name is "+obj.y);
	}
	
}

	