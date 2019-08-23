import java.util.Scanner;
public class FunSubstring
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a String: ");
		String original = scan.nextLine();
		System.out.println("Enter Beginning Index: ");
		int begin = scan.nextInt();
		System.out.println("Enter Ending Index: ");
		int end = scan.nextInt();
		System.out.println("Original String: " + original);
		String string = original.substring(begin, end);
		System.out.println("Substring: " + string);
	}
}