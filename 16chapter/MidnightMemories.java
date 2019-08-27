import java.util.Scanner;
public class MidnightMemories
{

	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Movie Time: ");
		int time = scan.nextInt();
		System.out.println("Age: ");
		int age = scan.nextInt();

		int cost = 0;
		if (time <= 2200){
			if (age <= 13){
				if (time <= 1700)
					cost = 2;
				else
					cost = 4;
			} else {
				if (time <= 1700)
					cost = 5;
				else
					cost = 8;
			}
			System.out.println("Cost: " + cost);
		} else {
			if (age <= 13){
				System.out.println("No Ticket Youngster! Go Home!");
			} else {
				System.out.println("Cost: " + 4);
			}
		}

	}

}