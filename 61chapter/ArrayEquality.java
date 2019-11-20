import java.util.Arrays;
public class ArrayEquality{
	public static void main(String[] args){

		int[] arrayA = { 1, 2, 3, 4 };
    	int[] arrayB = { 1, 2, 3, 4 };

    	System.out.print("Arrays says: ");

    	if ( Arrays.equals( arrayA, arrayB ) )
    	  System.out.println( "Equal" );
    	else
    	  System.out.println( "NOT Equal" );      
	}

	public static boolean equals(int[] arrayA, int[] arrayB){
		boolean[] allGood = new boolean[arrayA.length];
		for (int i = 0; i<arrayA.length; i++){
			if (arrayA[i] == arrayB[i]) allGood[i] = true;
		}
		boolean good = true;
		for (int i = 0; i<allGood.length; i++){
			if (!allGood[i]) good = false;
		}
		return good; 
	}
}