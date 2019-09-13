import java.util.Scanner;
public class RunOfIntegers
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Start: ");
		int start = scan.nextInt();
		System.out.println("Enter End: ");
		int end = scan.nextInt();
		for (int i = start; i <= end; i++){
			System.out.println(i);
		}
	}
}