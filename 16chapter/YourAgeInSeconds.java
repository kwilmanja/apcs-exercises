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

		int month1 = 31;
		int month2 = 28;
		int month3 = 31;
		int month4 = 30;
		int month5 = 31;
		int month6 = 30;
		int month7 = 31;
		int month8 = 31;
		int month9 = 30;
		int month10 = 31;
		int month11 = 30;

		if (months <= 0)
		{
			monthDays = month1
		}
		if (months < 1)
		{
			monthDays = month1
		}
		if (months < 3)
		{
			monthDays = month1
		}
		if (months < 4)
		{
			monthDays = month1
		}
		if (months < 5)
		{
			monthDays = month1
		}
		if (months < 6)
		{
			monthDays = month1
		}
		if (months < 7)
		{
			monthDays = month1
		}
		if (months < 8)
		{
			monthDays = month1
		}
		if (months < 9)
		{
			monthDays = month1
		}
		if (months < 10)
		{
			monthDays = month1
		}
		if (months < 11)
		{
			monthDays = month1
		}
		if (months < 12)
		{
			monthDays = month1
		}


		int totalDays = days + years * 365 + monthDays
		System.out.println("Total Seconds: " + (totalDays * 24 * 60 * 60));
	}

}