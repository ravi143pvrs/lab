package Assignmentss;
// simply polymorphism program
public class Polyusedata {
int speed=50;
}
class Speeds extends Polyusedata {
	int speed=30;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Speeds obj=new Speeds();
System.out.println(obj.speed);
	}

}
