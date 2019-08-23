import java.util.Scanner;
public class AnnualApplianceCost
{

	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter cost per kilowatt-hour in cents: ");
		double cost = scan.nextDouble();
		System.out.println("Enter kilowatt-hours used per year: ");
		double usage = scan.nextDouble();
		double annualcost = cost * usage;
		System.out.println("Annual Cost: " + annualcost);
	}

}