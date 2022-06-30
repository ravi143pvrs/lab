package Assignmentss;

import java.util.Scanner;

public class Primeornot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner w = new Scanner(System.in);
System.out.println("enter the number  ");
	int n=w.nextInt();
	int c =0;

for(int i =2; i<=n-1; i++)
{
	if(n%i == 0) 
	{
		c=c+1;
		}
}
if(c==0) {
	System.out.println("the no is prime  "+n);
}
else { 
	System.out.println("the no is not prime  "+n);

}
	}

}
