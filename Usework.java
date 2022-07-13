package Assignmentss;
// program to display details of person
import java.util.Scanner;

interface user12 {
	
	void input();
	void output();
}

class ravi implements user12 {

	String fname1;
	String lname1;
	String uname1;
	String pword1;
	
	public void input()
	{

		Scanner x = new Scanner(System.in);
		System.out.println("enter user firstname....");
		fname1 = x.nextLine();
		System.out.println("enter user lastname..");
		lname1 = x.nextLine();
		System.out.println("enter user usename....");
		uname1 = x.nextLine();
		System.out.println("enter user pasword....");
		pword1 = x.nextLine();
		
	}
	public void output() {
		
		System.out.println(fname1+"  "+lname1+"  "+uname1+"  "+pword1);
		
	}

	public static void main(String[] args) {
		
		user12 a = new ravi();
		a.input();
		a.output();
		
	}
}
