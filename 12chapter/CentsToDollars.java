import java.util.Scanner;
public class CentsToDollars
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Input the cents:");
		String data = scan.nextLine();
		String cents_str = data.substring(1);
		
		int cents = Integer.parseInt(cents_str);
		int dollars = Integer.parseInt(data) / 100;


		System.out.println("That is " + dollars + " dollars and " + cents + " cents.");
	}
}