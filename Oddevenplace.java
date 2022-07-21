package testing;
// author ravi kumar
// program for finding index position even and odd for given characters in an array
public class Oddevenplace {

	public static void main(String[] args) { // main method
		// TODO Auto-generated method stub
char s[]= {'a','d','e','f','g','t'}; // characters declaring
for(int i=0;i<=s.length-1;i++) {
	if(i%2==0) // condition for checking even or odd
	System.out.println("the index position is even "+i+" and the caracter is: "+s[i]);
	else 
	System.out.println("the index position is odd "+i+" and the caracter is: "+s[i]);
}	}
}


