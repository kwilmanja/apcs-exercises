import java.util.Scanner;
public class PieEatingContest
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Weight: ");
		int weight = scan.nextInt();
		if ((weight > 30) && (weight < 250))
		{
			System.out.println("All Clear!");
		}
		else
		{
			System.out.println("Sorry, you're either anorexic or a fatty so you can't compete!");
		}

	}
}