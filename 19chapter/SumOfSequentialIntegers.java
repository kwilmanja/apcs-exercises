import java.util.Scanner;
public class SumOfSequentialIntegers
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N: ");
		int n = scan.nextInt();

		int i = 0;
		int sumLoop = 0;
		while (i < n){
			i += 1;
			sumLoop += i;
		}

		double sumFormula = (n*(n+1))/2;

		System.out.println("Loop Sum: " + sumLoop);
		System.out.println("Formula Sum: " + sumFormula);
	}
}