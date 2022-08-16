package collectionsconcept;
// program for insertion of element in the first position of a given list
import java.util.LinkedList;

public class Insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedList<String>ss=new LinkedList<>();
ss.add("car");
ss.add("cell");
ss.add("cab");
ss.add("cat");
ss.add("call");
System.out.println(ss);
ss.addLast("coil");
ss.addFirst("code");
System.out.println(ss);
}

}
