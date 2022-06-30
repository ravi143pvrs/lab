package Assignmentss;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
int fact = 1;
System.out.println("enter your number  ");
Scanner f = new Scanner(System.in);
n = f.nextInt();
for(int i=1;i<=n;i++) {
	fact = fact*i;
	}
	
	System.out.println("factorial number is  "+fact);
	}

}
