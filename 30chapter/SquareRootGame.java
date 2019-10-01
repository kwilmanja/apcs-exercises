import java.util.Scanner;
public class SquareRootGame{
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("How many rounds:");
		int rounds = scan.nextInt();
		String nothing = scan.nextLine();

		System.out.println("First Player: ");
		String player1 = scan.nextLine();

		System.out.println("Second Player: ");
		String player2 = scan.nextLine();

		int wins1 = 0;
		int wins2 = 0;

		double root;
		for (int i = 0; i < rounds; i++){
			int number = RandomNumber.randomInt(100);
			System.out.println("What is the square root of " + number);
			System.out.println(player1 + " guess: ");
			double guess1 = scan.nextDouble();
			System.out.println(player2 + " guess: ");
			double guess2 = scan.nextDouble();
			root = Math.sqrt(number);
			System.out.println("Correct Square Root: " + root);
			double difference1 = Math.abs(root - guess1);
			double difference2 = Math.abs(root - guess2);

			System.out.println(player1 + " was " + difference1 + " off");
			System.out.println(player2 + " was " + difference2 + " off");

			if (difference1 < difference2){
				System.out.println(player1 + " wins");
				wins1 +=1;
			}
			else{
				System.out.println(player2 + " wins");
				wins2 +=1;
			}



		}
		System.out.println("Final Score:\n" + player1 + ":\t" + wins1 + "\t" + player2 + ":\t" + wins2);


	}
}