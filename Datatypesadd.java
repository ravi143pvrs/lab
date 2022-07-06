package overloadingconcepts;
// method overloading---changing the data types of arguments
public class Datatypesadd {

	static int add(int a, int b) {  // no.of arguments are 2 to add in this method
		return(a+b);
	}
static double add(double a, double b, double c) {  // arguments are 3 to add in this method
	return(a+b+c);
}
class overloading {
	
}
	public static void main(String[] args) {  // main class
		// TODO Auto-generated method stub
System.out.println(Addition.add(15,18));
System.out.println(Addition.add(10, 7,12));
	}

}
