package Assignmentss;

public class Teacerr {
	String cname="CBIT";
	String desig="HOD";
	void pro() {
		System.out.println("head of the department");
	}
	}
class Iteacer extends Teacerr {
	void pro1() {
		System.out.println("info teacer is best");
	}
	}
class Maths extends Iteacer {
	void pro2() {
		System.out.println("maths is very simple subject");
	}
	}
class Teachers {
	
	public static void main(String[] args) {
	Maths tea=new Maths();
	tea.pro();
	tea.pro1();
	tea.pro2();
	System.out.println("the college name is : "+tea.cname);
	System.out.println("the designation of dept is : "+tea.desig);

	}

}
