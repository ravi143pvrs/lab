package testing;
// author ravi kumar
// program for finding duplicate values in an array
public class Duplicatevalues {

	public static void main(String[] args) { // main method
		// TODO Auto-generated method stub
int arr[]= {1,2,3,4,5,6,4,2,1};
for(int i=0;i<arr.length;i++) 
	for(int j=1+i;j<arr.length;j++) 
		if(arr[i]==arr[j]) { // condition for checking for duplicate values
			System.out.println("the duplicate value is: "+arr[j]);
		}
	}
}
