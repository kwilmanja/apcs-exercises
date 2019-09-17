import java.util.Scanner;
public class PowerOfANumber
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter X: ");
		double x = scan.nextDouble();
		System.out.println("Enter N: ");
		int n = scan.nextInt();

		if (n > 0){
			int i = n;
			double solution = x;
			while (i > 1){
				solution *= x;
				i -= 1;
			}
			System.out.println("Solution: " + solution);
		}
		
		else{
			System.out.println("N must be a positive integer");
		}
	}
}