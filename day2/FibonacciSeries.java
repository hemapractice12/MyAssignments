package week1.day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		int n =8;
		int firstnumber=0;
		int secondnumber=1;
		int nextnumber = 1;
	    for(int i =0; i<n; i++) {
	    	System.out.print(firstnumber + " ");
	    	nextnumber = firstnumber + secondnumber;
	    	firstnumber = secondnumber;
	    	secondnumber = nextnumber;
	    }
	}
}
