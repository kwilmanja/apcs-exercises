import java.util.Scanner;
public class SumOfDivisors{
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("N: ");
		int n = scan.nextInt();
		
		if (n % 1 != 0){
			System.out.println("Not a perfect number");
		}

		int sum = 0;
		for (int i = (n - 1); i > 0; i--){
			if (n % i == 0){
				sum += i;
				if (i == 1)
				System.out.print(i);
				else
				System.out.print(i + "+");
			}
		}
		System.out.println("\nSum: " + sum);
	}
}