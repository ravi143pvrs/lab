package Assignmentss;
// autor ravi kumar
// program for finding area of rectanle using encapsulation
import java.util.Scanner;
public class Rectangles {
private int length,breadth;  //private variables
Rectangles(int length,int breadth) {
	this.length=length;
	this.breadth=breadth;
}
void run() {
	System.out.println("area of rectangle is:- "+length*breadth);
}
public void setLength(int length) {  // setter method-1
	this.length=length;
}
public void setBreadth(int breadth) {  //setter method-2
	this.breadth=breadth;
}}

class RectangleTest {
public static void main(String[] args) {  //main method
			
	Rectangles re=new Rectangles(12,24);  //values creation of objects
Scanner sc=new Scanner(System.in);
re.run();
System.out.println("updated area of rectangle:- ");
re.setLength(12);// new values setter
re.setBreadth(15);  //new values setting
re.run();
	}
   }
