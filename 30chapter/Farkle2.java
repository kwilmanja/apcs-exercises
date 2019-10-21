import java.util.Scanner;
import java.util.Arrays;
public class Farkle2{

	public static void main (String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Farkle (HELL)!");
		String name1 = "Amy";
		String name2 = "Amy";
		System.out.println("Demon 1: " + name1 + "\nDemon 2: " + name2);


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
			int hotDice = 0;
			int savedNumbers = 0;
			boolean farkle = false;
			int keepGoing = 0;
			int[] savedRolls = new int[6];
			int score = 0;
			while (!farkle && hotDice == 0 && keepGoing == 0 && savedNumbers < 6){ //Repeat: (until savedNumbers = 6 or farkle == true)
				System.out.println("\n\nRoll: " + rollNumber);

		//Roll
				rolls = roll(player, 6 - savedNumbers); //Prints out roll
				System.out.println("Is there a Farkle or Hot Dice?");
				farkle = checkFarkle(rolls, savedNumbers); //false to keep going
				if (farkle)
					break;
				hotDice = checkHotDice(rolls); //returns 1 if Hot Dice
			//Bob is a piece of shit
				int bobCheat = 0;
				if (player.equals("Bob")){
					bobCheat = RandomNumber.randomInt(15);
					if (bobCheat == 1)
						hotDice = 2;
				}
				else if (player.equals("Amy"))
					hotDice = 3;


				boolean keepSwitch = true;
				while(keepSwitch){
					switch (hotDice) {
						case 0: {
					//Save what is wanted:
							keepSwitch = false;
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
								System.out.println("Valid or not?");
								valid = checkValid(savedRolls);
								if (!valid){
									System.out.println("Not Valid\nSorry, you can't save those numbers");
									savedNumbers -= times;
								}
								else
									System.out.println("Valid");
							} // end of scoring process
							Arrays.sort(savedRolls);
								//Score the numbers
							System.out.println("Saved Numbers: " + Arrays.toString(savedRolls));
							score = score(savedRolls); //return int of scored
							System.out.println("Current Score: " + score);
							if (savedNumbers >= 6)
								break;
							System.out.println("Would you like to keep rolling? ");
							keepGoing = scan.nextInt(); //0 to keep going
							rollNumber += 1;
							break;
						}
						case 1: {
							while(hotDice == 1){
								hotDice = checkHotDice(rolls);
								System.out.println("You got Hot Dice!");
								System.out.println("Roll again! \nOriginal Roll: " + Arrays.toString(rolls));
								score += score(rolls);
								System.out.println(score);
								rolls = roll(player, 6 - savedNumbers);
								keepSwitch = false;
								break;
							}
						}
						case 2: { //Bob Cheats
							for (int i = 0; i < 6; i++){
								rolls[i] = 1;
							}
						}
							System.out.println(player + " rolled " + Arrays.toString(rolls));
							hotDice = 0;
						case 3: { //Amy

					//Save what is wanted:
							keepSwitch = false;
							valid = false;
							while (!valid){
						//Saving Process:
								int times = 0;
								for (int i = 0; i < 6; i++){
									if (rolls[i] == 1 || rolls[i] == 5){
										savedRolls[i] = rolls[i];
										savedNumbers += 1;
										times += 1;
									}
								}
							} // end of scoring process
							Arrays.sort(savedRolls);
								//Score the numbers
							System.out.println("Saved Numbers: " + Arrays.toString(savedRolls));
							score = score(savedRolls); //return int of scored
							System.out.println("Current Score: " + score);
							if (savedNumbers >= 6)
								break;
							System.out.println("Would you like to keep rolling? ");
							int rando = RandomNumber.randomInt(1);
							if(rando == 0)
								keepGoing = 1; //0 to keep going
							rollNumber += 1;
							break;
						}


							
						
						
	
					}
	
				}
	
			} // end of turrn



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

			if (player.equals("Bob")){
				System.out.println("Amy: WTF Bob! You clearly cheated there!");
				System.out.println("Bob: Fuck you! No I didn't!");
				System.out.println("Amy: God Damnit Bob! You're a piece of shit! I quit!");
				System.out.println("*Amy left the game*");
				System.out.println("Bob: Fucking Bitch");
				System.out.println("*Bob wins*");
				break;
			}

		} // end of game


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
				return true;
			}
		}
		return false;
	}


	public static boolean checkFarkle(int[] rolls, int savedNumbers){
		int[] testRolls = new int[6 - savedNumbers];
		for (int i = 0; i < (6 - savedNumbers); i++){
			testRolls[i] = rolls[i];
		}

	// 1 or 5?
		for (int i = 0; i < (6 - savedNumbers); i++){
			if (testRolls[i] == 1 || testRolls[i] == 5){
				System.out.println("No Farkle");
				return false;
			}
		}

	// 0 or 3 of all the other numbers
		int[] count = {0,0,0,0}; // [2,3,4,6]
		int[] numbers = {2,3,4,6};
		boolean[] good = {false, false, false, false};

		for (int i = 0; i < 4; i++){
			for (int n = 0; n < (6 - savedNumbers); n++){
				if (testRolls[n] == numbers[i])
					count[i] += 1;
			}
			if (count[i] == 0 || count[i] == 3)
				good[i] = true;
		}

		if (good[0] && good[1] && good[2] && good[3]){
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

	public static int checkHotDice(int[] rolls){
		if (rolls.length < 6){
			System.out.println("No Hot Dice!");
			return 0;
		}
		if (checkValid(rolls) == true){
			System.out.println("You got Hot Dice!");
			return 1; // 1 returns hot dice true
		}
		else{
			System.out.println("No Hot Dice!");
			return 0;
		}
	}


}
