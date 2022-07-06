package overloadingconcepts;
 // method overloading--changing the no of arguments
public class Addition {  // class
	static int add(int a, int b) {  // no.of arguments are 2 to add in this method
		return(a+b);
	}
static int add(int a, int b, int c) {  // arguments are 3 to add in this method
	return(a+b);
}
class overloading {
	
}
	public static void main(String[] args) {  // main class
		// TODO Auto-generated method stub
System.out.println(Addition.add(15,18));
System.out.println(Addition.add(10, 7,12));
	}

}
