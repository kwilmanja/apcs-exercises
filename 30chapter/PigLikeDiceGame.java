import java.util.Scanner;
public class PigLikeDiceGame{
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to Pig-Like Dice Game!");
		int computerScore = 0;
		int playerScore = 0;

		while (playerScore < 100 && computerScore < 100){
			
			System.out.println("Computer:");
			int roll1 = RandomNumber.randomInt(5) + 1;
			int roll2 = RandomNumber.randomInt(5) + 1;
			int roll3 = RandomNumber.randomInt(5) + 1;
			System.out.println("Computer rolled: " + roll1 + " and " + roll2 + " and " + roll3);
			computerScore += roll1 + roll2 + roll3;
			System.out.println("Computer Score = " + computerScore);

			System.out.println("Player: ");

			String rollQuestion = "y";
			int roll = 0;

			int playerTurnScore = 0;
			while (rollQuestion.equals("y") && roll != 1){
				roll = RandomNumber.randomInt(5) + 1;
				System.out.println("You Rolled: " + roll);
				playerTurnScore += roll;
				System.out.println("Roll? (y for yes and n for no)");
				rollQuestion = scan.nextLine();

			}
			if (roll != 1)
				playerScore += playerTurnScore;
			System.out.println("Player Score = " + playerScore);
		}

		if (playerScore < 100){
			System.out.println("Computer Wins with " + computerScore + "! Sorry!");
		}
		else
			System.out.println("You Win with " + playerScore + "! Nice Job!");




	}
}