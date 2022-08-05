package threadconcepts;

public class Threadwithrunnablestring implements Runnable {
public void run() {
	System.out.println("thread is running ");
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r=new Threadwithrunnablestring();
		Thread obj=new Thread("first thread");
		obj.start();
		String s=obj.getName();
		System.out.println(s);

	}

}
