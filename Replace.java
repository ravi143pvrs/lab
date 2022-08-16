package collectionsconcept;

import java.util.LinkedList;

// program for replace an element in the given linked list
public class Replace { // main class

	public static void main(String[] args) { // main method
		// TODO Auto-generated method stub
LinkedList<Integer>r=new LinkedList<>();
// adding elements
r.add(10);
r.add(20);
r.add(30);
r.add(35);
r.add(50);
r.add(60);
System.out.println("list of elements:- "+r);
r.set(3,40); //replacement
System.out.println("new list after replacement:- "+r);
	}

}
