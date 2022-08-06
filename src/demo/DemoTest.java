package demo;

public class DemoTest {

	public static void main(String[] args) {

		System.out.println("G1 is the BEST..............");
		System.out.println("Step something out of a lot");
		
		

		System.out.println(num); // added this line

		// from gitHUB
		// Batch 7

	}

	// add method
	public void add(int a, int b) {
		System.out.println(a + b);
	}

	public void divide(int a, int b) {
		System.out.println(a / b);

		System.out.println("G7...");

	}

	//random code.....
	
	
	public void subtract(int a, int b) {
		System.out.println(a-b);
	}
	
	
	
	public void devBrnachTest() {
		System.out.println("This is coming from dev branch....");
		
	}
															// G0nzal0s CodingBat
//	Start with 2 int arrays, a and b, of any length. 
	//	Return how many of the arrays have 1 as their first element.
		
	public int start1(int[] a, int[] b) {
		
	    int count = 0;
	    
	    if(a.length > 0 && a[0] == 1)		// a.length > 0-- taking care of first array ( a )is any length || and seeing if first index [0] is = 1
	        count++;						// add to the count
	              
	    if(b.length > 0 && b[0] == 1)		// b.length > 0-- taking care of 2nd array ( b )is any length || and seeing if first index [0] is = 1
	        count++;						// add to the count
	                        
	    return count;
	}

	
	
}
