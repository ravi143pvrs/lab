package collectionsconcept;

import java.util.ArrayList;

// program for comparing two array lists
public class Comparing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String>a1=new ArrayList<>();
a1.add("red");
a1.add("green");
a1.add("black");
a1.add("white");
a1.add("pink");
ArrayList<String>a2=new ArrayList<>();
a2.add("red");
a2.add("black");
a2.add("white");
a2.add("pink");
System.out.println("First list:- "+a1);
System.out.println("Second list:- "+a2);
System.out.println("comparing lists first to second:-  ");
for(String s: a1) {
	if(a2.contains(s)) {
		System.out.println("yes");
	}else {
		System.out.println("no");
	}
}
	}

}