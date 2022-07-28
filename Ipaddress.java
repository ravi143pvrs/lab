package regexconcepts;
// author ravi kumar
// program for checking IP address
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Ipaddress {
	public static void main(String[] args) { // main method
// taking the values of IP addresses
		String a[]= {"000.12.12.034","121.234.12.12","23.45.12.56",
		"000.12.12.134","121.234.12.12","23.45.12.56","Hello.IP",
		"255.1.0.256","123.45","Iam not IP address","999.999.999.999"};
// loop for iteration of the elements
for(int i=0;i<a.length;i++) 
System.out.println(checkIPAdd(a[i]));
	}
	public static boolean checkIPAdd(String s) {
		final String zeroto255="([01]?[0-9]{1,2}|2[0-4][0-9]|25[0-5])";
		final String IP_REGEXP=zeroto255+"\\."+zeroto255+"\\."+zeroto255+"\\."+zeroto255;
		// compile the regex
		Pattern p=Pattern.compile(IP_REGEXP);
		// finding the matching using matcher
		Matcher m=p.matcher(s);
		//condition for matchers to checking
		if(m.matches()) {
			return true;
		}
		return false;
	}
}
