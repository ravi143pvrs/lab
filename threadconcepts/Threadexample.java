package threadconcepts;

public class Threadexample extends Thread {
public void run() {
	for(int i=0;i<5;i++) {
		try {
			Thread.sleep(800);
		}
	catch(InterruptedException e) {
		System.out.println(e);
	}
		System.out.println(i);
	}
	System.out.println(Thread.currentThread().getName());
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Threadexample e=new Threadexample();
Threadexample e1=new Threadexample();
Threadexample e2=new Threadexample();
e2.setPriority(MAX_PRIORITY);
System.out.println(e2.getPriority());
System.out.println(Thread.currentThread().getPriority());
e.start();
e1.start();
e2.start();
//e.setName("thread");
e.setName("ravi");
}
}
