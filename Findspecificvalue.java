package Assignmentss;
// author ravi kumar
// program for finding specific value in an array
public class Findspecificvalue {
	public static void main(String[] args) {// main method
		// TODO Auto-generated method stub
int arr[]= {1789,2035,1899,1456,2013,2022};// initializing an array
int a=2013;// value of finding in an array
boolean x=true,y=false;

for(int i=0;i<arr.length;i++) {
	if(arr[i]==a) // condition for checking
		System.out.println("the value is found in the array: "+a+" "+x);
		else System.out.println("the value is not there in the array "+y);
		
	}

	}
}
