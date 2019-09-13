import java.util.Scanner;
public class WordsSeparatedByDots
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Word: ");
		String first = scan.nextLine();
		System.out.println("Enter Second Word: ");
		String second = scan.nextLine();		

		String dotString = "";
		int length =  first.length() + second.length();

		while (length < 30){
			length += 1;
			dotString += '.';
		}


		System.out.println(first + dotString + second);
	}
}