import java.util.Scanner;
import java.util.Arrays;
public class Farkle2{

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
		boolean turn1 = true;
		boolean valid;

//Layout:
//Game played while both have less than 10000 points
		while(score1 < 10000 && score2 < 10000){
		//switch between player turns
			String player = "";
			if (turn1){
				player = player1;
			}
			else {
				player = player2;
			}

	//Turn:
			int rollNumber = 1;
			int savedNumbers = 0;
			boolean farkle = false;
			boolean keepGoing = true;
			int[] savedRolls = new int[6];
			int score = 0;
			while (!farkle && keepGoing && savedNumbers < 6){ //Repeat: (until savedNumbers = 6 or farkle == true)
				System.out.println("\n\nRoll: " + rollNumber);

		//Roll
				rolls = roll(player, 6 - savedNumbers); //Prints out roll
				farkle = checkFarkle(rolls, savedNumbers); //false to keep going

		//Save what is wanted:
				valid = false;

				while (!valid){
			//Number of Saved:
					System.out.println("\nHow many dice would you like to save?");
					int saveNumber = scan.nextInt();

			//Saving Process:
					int times = 0;
					for (int i = 0; i < saveNumber; i++){
						System.out.println("Which spot would you like to score?");
						int spot = scan.nextInt();
						savedRolls[i] = rolls[spot];
						savedNumbers += 1;
						times += 1;
					}
			//Check what must be scored
					valid = checkValid(savedRolls);
					if (!valid){
						System.out.println("Sorry, you can't save those numbers");
						savedNumbers -= times;
					}
				}
				Arrays.sort(savedRolls);
					//Score the numbers
				System.out.println("Saved Numbers: " + Arrays.toString(savedRolls));
				score = score(savedRolls); //return int of scored
				System.out.println("Current Score: " + score);

				System.out.println("Would you like to keep rolling? ");
				keepGoing = scan.nextBoolean(); //true to keep going
				rollNumber += 1;
			}

		//Score Numbers:
			// if Farkle: add no score && else: add score
			if (!farkle){
				if (turn1)
					score1 += score;
				else
					score2 += score;
			}
					//Score Numbers
			//End of Turn:
				// if Farkle: add no score
				// else: add score

			//Final Setup:
			if (turn1)
				turn1 = false;
			else
				turn1 = true;

			System.out.println(player1 + " score: " + score1);
			System.out.println(player2 + " score: " + score2);

		}


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

	public static boolean checkValid(int[] savedRolls){
		System.out.println("Valid or not?");
		int[] testRolls = new int[6];
		for (int i = 0; i < 6; i++){
			testRolls[i] = savedRolls[i];
		}

		for (int i = 0; i < 6; i++){
			if (testRolls[i] == 1 || testRolls[i] == 5){
				testRolls[i] = 0;
			}
		}
		Arrays.sort(testRolls);
		if (testRolls[5] == testRolls[4] && testRolls[4] == testRolls[3]){
			if (testRolls[0] == testRolls[1] && testRolls[1] == testRolls[2]){
				System.out.println("valid");
				return true;
			}
		}
		System.out.println("not valid");
		return false;
	}


	public static boolean checkFarkle(int[] rolls, int savedNumbers){
		System.out.println("Is there a farkle?");
		int[] testRolls = new int[6 - savedNumbers];
		for (int i = 0; i < (6 - savedNumbers); i++){
			testRolls[i] = rolls[i];
		}

		for (int i = 0; i < (6 - savedNumbers); i++){
			if (testRolls[i] == 1 || testRolls[i] == 5){
				System.out.println("No Farkle");
				return false;
			}
		}

		int twoCount = 0;
		int threeCount = 0;
		int fourCount = 0;
		int sixCount = 0;
		for (int i = 0; i < (6 - savedNumbers); i++){
			if (testRolls[i] == 2)
				twoCount += 1;
			if (testRolls[i] == 3)
				threeCount += 1;
			if (testRolls[i] == 4)
				fourCount += 1;
			if (testRolls[i] == 6)
				sixCount += 1;
		}
		boolean twoGood = false;
		boolean threeGood = false;
		boolean fourGood = false;
		boolean sixGood = false;
		if (twoCount == 0 || twoCount == 3)
			twoGood = true;
		if (threeCount == 0 || threeCount == 3)
			threeGood = true;
		if (fourCount == 0 || fourCount == 3)
			fourGood = true;
		if (sixCount == 0 || sixCount == 3)
			sixGood = true;
		if (twoGood && threeGood && fourGood && sixGood){
			System.out.println("No Farkle");
			return false;
		}
		System.out.println("Sorry! You got a Farkle! Loser!");
		return true;

	}


	public static int score(int[] savedRolls){
		System.out.println("Score?");
		int subScore = 0;
		int[] testRolls = new int[6];
		for (int i = 0; i < 6; i++){
			testRolls[i] = savedRolls[i];
		}

		int oneCount = 0;
		int twoCount = 0;
		int threeCount = 0;
		int fourCount = 0;
		int fiveCount = 0;
		int sixCount = 0;

		for (int i = 0; i < 6; i++){
			if (testRolls[i] == 1)
				oneCount += 1;
			if (testRolls[i] == 2)
				twoCount += 1;
			if (testRolls[i] == 3)
				threeCount += 1;
			if (testRolls[i] == 4)
				fourCount += 1;
			if (testRolls[i] == 5)
				fiveCount += 1;
			if (testRolls[i] == 6)
				sixCount += 1;
		}

		while(oneCount > 0){
				if (oneCount % 3 == 0){
					subScore += 1000;
					oneCount -= 3;
				}
				else{
					subScore += 100 * oneCount;
					oneCount = 0;
				}
		}

		while(fiveCount > 0){
				if (fiveCount % 3 == 0){
					subScore += 500;
					fiveCount -= 3;
				}
				else{
					subScore += 50 * fiveCount;
					fiveCount = 0;
				}
		}

		while (twoCount > 0){
			subScore += 200;
			twoCount -= 3;
		}
		while (threeCount > 0){
			subScore += 300;
			threeCount -= 3;
		}
		while (fourCount > 0){
			subScore += 400;
			fourCount -= 3;
		}
		while (sixCount > 0){
			subScore += 600;
			sixCount -= 3;
		}
		return subScore;
	}








}
