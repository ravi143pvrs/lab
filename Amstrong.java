package Assignmentss;

public class Amstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 331;
		int temp;
		int ams = 0;
		int org = n;
		while(n>0) {
			temp = n%10;
			temp = temp*temp*temp;
			ams = ams+temp;
			n = n/10;
					}
	if(ams==org) {
		System.out.println("no is amstrong");
		
	}
	else {
		System.out.println("no is not amstrong");
	}
	}

}
