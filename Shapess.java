package Assignmentss;
// author ravi kumar
// program for finding area and circumference of circle using constructor
import java.util.Scanner;
  //creation of class
public class Shapess {
float rad;
float pi=3.5f;
public Shapess() {
	rad=1.5f;
}
public Shapess(float rad) {
	this.rad=rad;
}
public Shapess(float rad,float pi) {
	this.rad=rad;
	this.pi=3.5f;
}
public float Area(float rad) {
	return pi*rad*rad;
}
public float Circum(float rad) {
	return 2*pi*rad;
}
public static void main(String[] args) {
	Shapess obj=new Shapess();
	Scanner sca=new Scanner(System.in); // creation and assign value using scanner object
	System.out.println("enter value for radius:- ");
	float rad=sca.nextFloat();
	sca.close();
	System.out.println("area of circle is:- "+obj.Area(rad));
	System.out.println("circumference of circle is:- "+obj.Circum(rad));
}
}
