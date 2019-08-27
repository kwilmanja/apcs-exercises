import java.util.Scanner;
public class MatineeMovie
{

	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Movie Time: ");
		int time = scan.nextInt();
		System.out.println("Age: ");
		int age = scan.nextInt();

		boolean child = false;
		boolean matinee = false;

		if (age < 13){
			child = true;
		} 
		if (time < 1700){
			matinee = true;
		}

		int cost = 0;
		
		if (child){
			if (matinee)
				cost = 2;
			else
				cost = 4;
		} else {
			if (matinee)
				cost = 5;
			else
				cost = 8;
		}

		System.out.println("Cost: " + cost);
	}

}