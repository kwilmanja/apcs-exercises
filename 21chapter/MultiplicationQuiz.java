import java.util.Scanner;
import java.util.Random;
public class MultiplicationQuiz{
	public static void main (String[] args){

		//Setup:
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();

		for (int i = 10; i >0; i--){

			//Question:
			int one = rand.nextInt(+10);
			int two = rand.nextInt(+10);
			System.out.println("What is " + one + " * " + two + "? \t");

			//Answer:
			int answer = scan.nextInt();

			//Grade:
			if (answer == (one * two)){
				System.out.println("Right!");
			}
			else
				System.out.println("Wrong! The right answer is: " + (one * two));
		}

	}
}