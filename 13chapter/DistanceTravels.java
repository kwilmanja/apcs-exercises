import java.util.Scanner;
public class DistanceTravels
{

	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of seconds: ");
		double seconds = scan.nextDouble();
		double distance = (0.5) * 32.174 * seconds * seconds;
		System.out.println("Distance: " +distance);
	}

}