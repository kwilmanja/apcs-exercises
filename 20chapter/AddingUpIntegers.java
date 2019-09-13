import java.util.Scanner;
public class AddingUpIntegers
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("How many integers will be added: ");
		int amount = scan.nextInt();

		int[] integers = new int[amount];
		int sum = 0;

		while (amount > 0){
			System.out.println("Enter an Integer: ");
			int number = scan.nextInt();

			integers[amount - 1] = number;
			amount -= 1;
			sum += number;
		}
		System.out.println(sum);

	}
}