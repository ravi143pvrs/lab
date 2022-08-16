package collectionsconcept;

import java.util.ArrayList;
import java.util.List;

// program for extraction of portion in the given list of elements
public class Extractelements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<String>lst=new ArrayList<>();
lst.add("red");
lst.add("green");
lst.add("orange");
lst.add("white");
lst.add("black");
System.out.println("list of elements:- "+lst);
System.out.println("the extraction of first three elements are:- ");
for(int i=0;i<3;i++) {
	System.out.println(lst.get(i));
	}
}

}
