import java.util.Scanner;
public class YourAgeInSeconds
{

	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Years: ");
		int years = scan.nextInt();
		System.out.println("Months: ");
		int months = scan.nextInt();
		System.out.println("Days: ");
		int days = scan.nextInt();


		int monthDays = 0;
		int[] monthData = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		//				   0   1   2   3   4   5   6   7   8   9   10 

		int count;
		for ( count = months; count > 0; count--) {
			monthDays = monthDays + monthData[count - 1];
		}

		int totalDays = days + years * 365 + monthDays;

		System.out.println("Total Seconds: " + (totalDays * 24 * 60 * 60));
	}

}