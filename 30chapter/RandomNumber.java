import java.util.Random;
public class RandomNumber{
	public static int randomInt (int limit){

		Random rand = new Random();
		int number = rand.nextInt(limit);
		return number;

	}

//	public static double randomDouble (double limit){
//
//		Random rand = new Random();
//		double number = rand.nextDouble(limit);
//		return number;
//
//	}


	public static void main (String[] args){
		System.out.println(randomInt(10));
	}
}