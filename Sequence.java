package regexconcepts;

// author ravi kumar

// program for checking sequence of letters
import java.util.regex.Matcher; // import regex from java util package
import java.util.regex.Pattern;
public class Sequence {
	public static void main(String[] args) {
String s1="java_exercises";
String s2="Java_Exercises";
// calling the method to see output and checking
checkRegex(s1);
checkRegex(s2);
	}
	public static void checkRegex(String s1) {
		String regex="^[a-z]+_[a-z]+$";
		// compile the pattern
		Pattern p=Pattern.compile(regex);
		// finding the matches for  given strings 
		Matcher m=p.matcher(s1);
		// checking condition for match find or not
		if(m.matches()) System.out.println("its matches ");
		else System.out.println("its not matches");
	}
}
