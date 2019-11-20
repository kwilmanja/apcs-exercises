public class ReverseOrder{
	public static void main ( String[] args ) {
	    int[] val = {0, 1, 2, 3}; 
	    int[] valR = {0, 1, 2, 3}; 

	    int temp;
	 
	    System.out.println( "Original Array: " 
	        + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
	 
	    // reverse the order of the numbers in the array
	 	for (int i = 0; i<4; i++){
	 		valR[i] = val[3-i];
	 	}
	 
	    
	 
	    System.out.println( "Reversed Array: " 
	        + valR[0] + " " + valR[1] + " " + valR[2] + " " + valR[3] );
	}
}