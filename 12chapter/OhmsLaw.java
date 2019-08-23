import java.util.Scanner;
public class OhmsLaw
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Voltage: ");
		int voltage = scan.nextInt();
		System.out.println("Resistance: ");
		int resistance = scan.nextInt();
		double current = (voltage + 0.0) / resistance;
		System.out.println("The current is: " + current);

	}
}