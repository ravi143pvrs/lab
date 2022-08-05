package threadconcepts;

public class Threadclasswitstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// this is of thread class where we using constructor string name
Thread obj=new Thread("first thread");
obj.start();
String s=obj.getName();
System.out.println(s);
	}

}
