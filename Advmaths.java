package Assignmentss;
//author ravi kumar
// program on interface
import java.util.Scanner;
public interface Advmaths {  // interface class
int div(int n);
}
class Mycalc implements Advmaths {  //implements interface class
	public int div(int n) {
		int s=0;
		for(int i=1;i<=n;i++) {  // condition
			if(n%i==0)
				s=s+i;
			}
	return s;
	}
}
class solve {
	public static void main(String[] args) {  //main method
		System.out.println("enter number :- ");
Mycalc obj=new Mycalc();  // creating objects
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("I implemented: Advanced Arthematic  ");
System.out.println(obj.div(n)+"\n");
sc.close();
	}

}
