import java.util.Scanner;
public class LogarithmBaseTwo
{

	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Double: ");
		double number = scan.nextDouble();
		double product = Math.log(number) / Math.log(2);
		System.out.println("Base 2 log of " + number + "is " + product);
	}

}