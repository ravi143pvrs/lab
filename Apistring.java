package stringconcepts;
import java.util.StringTokenizer;
public class Apistring {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s="Welcome to java world";
System.out.println("-------first statement----------");
System.out.println(s.charAt(5));
System.out.println(s.compareToIgnoreCase("Welcome"));
System.out.println(s.concat("--let us learn"));
System.out.println(s.indexOf('a'));
System.out.println(s.replace('a','e'));
System.out.println(s.substring(4,10));
System.out.println(s.toLowerCase());
System.out.println("--------second statement------------");
StringBuffer s1=new StringBuffer("this is string buffer");
System.out.println(s1.append("tis is sample program"));
System.out.println(s1.insert(21,"object"));
System.out.println(s1.replace(14,20,"builder"));
System.out.println(s1.reverse());
System.out.println("-----------third statement-----------");
parseString();
	}
	public static void parseString() {
		StringTokenizer sz=new StringTokenizer("C\\IBM\\DB2\\PROGRAM\\DB2COPY1.EXE","\\");
		System.out.println("Drive:"+sz.nextToken()+"\\"+"\n"+"Folders:"+sz.nextToken()+"||"
		+sz.nextToken()+"||"+sz.nextToken()+"\n"+"Files:"+sz.nextToken());
	}
}