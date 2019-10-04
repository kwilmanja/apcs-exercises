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
		boolean turn1 = true;

//Layout:
			//Game played while both have less than 10000 points
		while(score1 < 10000 && score2 < 10000 && round < 2){
				//switch between player turns
			if (turn1){
				player = player1
			}
			else {
				player = player2
			}

					//Turn:
			System.out.println("\n\nRoll: " + rollNumber);
			int savedNumbers = 0;
			
					//Roll initial
			rolls = roll(player1, 6 - savedNumbers);

					//Save what is wanted
			System.out.println("\nHow many dice would you like to save?");
			int saveNumber = scan.nextInt();
			int[] savedRolls = new int[6];
						//Check what must be scored
			boolean valid = checkValid()
					//Score the numbers
			if (valid)
			//Repeat: (until savedNumbers = 6 or farkle == true)
					//Roll remaining blank spots
					//Check for Farkle
					//Save what is wanted
						//Check what must be scored
					//Score Numbers
			//End of Turn:
				// if Farkle: add no score
				// else: add score

			//Final Setup:
			if (turn1)
				turn1 = false
			else
				trun1 = true


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









}
