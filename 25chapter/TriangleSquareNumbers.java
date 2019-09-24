public class TriangleSquareNumbers{
	public static void main (String[] args){

		boolean square = false;
		boolean triangle = false;
		int limit = 100000;

		for (int i = 0; i < limit; i++){


		//Square:
			for (int iSquare = i; iSquare > 0; iSquare--){
				if ((iSquare * iSquare) == i)
					square = true; 
			}
		//Triangle:
			int number = i;
			for (int iTriangle = 0; number >= 0; iTriangle++){
				number -= iTriangle;
				if (number == 0)
					triangle = true;
			}


		//Final:
			if (square && triangle)
				System.out.println(i);

		//Reset:
		square = false;
		triangle = false;
		}



	}
}