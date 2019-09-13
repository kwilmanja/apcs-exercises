import java.util.Scanner;
public class CheckCharge
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Checkings Account: ");
		int check = scan.nextInt();
		System.out.println("Savings Account: ");
		int save = scan.nextInt();
		double fee;
		if (save > 1500 || check > 1000)
			fee = 0;
		else
			fee = 0.15;
		System.out.println("Total Service Charge: " + fee);

	}
}