import java.util.Scanner;
public class HarmonicSum
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter N: ");
		double n = scan.nextDouble();
		
		double sum = 0;
		while (n > 0){
			sum += 1.0/n;
			n -= 1;
		}
		System.out.println("Sum: " + sum);
	}
}