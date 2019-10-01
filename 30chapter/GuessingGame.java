import java.util.Scanner;
public class GuessingGame{
	public static void main (String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("I'm thinking of a number from 1 to 10. \nYou must guess what it is in three tries.");
		int number = RandomNumber.randomInt(10);

		for (int i = 0; i < 3; i++){
			System.out.println("Enter a guess: ");
			int guess = scan.nextInt();
			if (guess == number){
				System.out.println("Right!");
				i = 3;
			}
			else
				System.out.println("Wrong!");
		}

		System.out.println(number);
	}

}