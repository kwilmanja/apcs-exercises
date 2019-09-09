import java.util.Scanner;
public class FantasyGame
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to Yertle's Quest:\nEnter the name of your character: ");
		String name = scan.nextLine();
		System.out.println("Enter Strength (1-10): ");
		int strength = scan.nextInt();
		System.out.println("Enter Health (1-10): ");
		int health = scan.nextInt();
		System.out.println("Enter Luck (1-10): ");
		int luck = scan.nextInt();
		int totalPoints = luck + health + strength;
		String endStatement = "";
		if (strength < 2){
			endStatement += (name + " is a coward! ");
		}
		if (name.indexOf("caden") != -1) {
			endStatement += (name + " is a coward! ");
		}


		if (totalPoints <= 15){
			System.out.println(name + " has " + strength + " strength " + health + " health " + luck + " luck! " + endStatement);
		}
		else{
			System.out.println("You have give your character too many points! Default values have been assigned: \nChortle, strength: 5, health: 5, luck: 5");
		}
		
	}
}