import java.util.Scanner;
import java.util.Arrays;
public class Farkle{


	public static int score(int roll1, boolean three){
		if (three){
			if (roll1 == 1)
				return 1000;
			else
				return (100 * roll1);
		}
		if (roll1 == 1)
			return 100;
		if (roll1 == 5)
			return 50;
		return 0;
	}

	public static int[] roll(String player, int times){
		Scanner scan = new Scanner(System.in);
		int[] rolls = new int[times];
		System.out.println(player + " roll!");
		String nothing = "";
		nothing = scan.nextLine();
		for (int i = 0; i < times; i++){
			rolls[i] = RandomNumber.randomInt(5) + 1;
		}
		Arrays.sort(rolls);
		System.out.println(player + " rolled " + Arrays.toString(rolls));
		return rolls;
	}




	public static void main (String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Farkle (HELL)!");
		System.out.println("Demon 1: ");
		String name1 = scan.nextLine();
		System.out.println("Demon 2: ");
		String name2 = scan.nextLine();


		
		//Who goes first:
		int roll1 = 0;
		int roll2 = 0;
		while (roll1 == roll2){
			roll1 = RandomNumber.randomInt(5) + 1;
			roll2 = RandomNumber.randomInt(5) + 1;
			System.out.println(name1 + " rolled: " + roll1 + "\n" + name2 + " rolled: " + roll2);
		}
		String player1 = "";
		String player2 = "";
		if (roll1 > roll2){
			player1 = name1;
			player2 = name2;
		}
		else{
			player1 = name2;
			player2 = name1;

		}
		System.out.println(player1 + " goes first!");
		


		String nothing = "important";
		//Game:
		int score1 = 0;
		int score2 = 0;
		int round = 1;
		int[] rolls = new int[6];

		while(score1 < 10000 && score2 < 10000 && round < 2){

			System.out.println("\n\nRound: " + round);

			rolls = roll(player1, 6);
			Arrays.sort(rolls);
			System.out.println("\nHow many dice would you like to save?");
			int saveNumber = scan.nextInt();
			int[] savedRolls = new int[6];
			for (int i = 0; i < saveNumber; i++){
				System.out.println("Which spot would you like to save?");
				int spot = scan.nextInt();
				savedRolls[i] = rolls[spot];
				
			}


			System.out.println(Arrays.toString(savedRolls));


































//
//
//
//
//
//			System.out.println("What would you like to score?");
//			
//
//
//
//			//Three?
//			System.out.println("(type 'true' if you'd like to try to score three)");
//			three == scan.nextBoolean();
//			if (three)
//				System.out.println("what number?");
//				number = scan.nextInt();
//				score (number )
//
//
//
//
//
//
			round += 1;
		}



	}
}