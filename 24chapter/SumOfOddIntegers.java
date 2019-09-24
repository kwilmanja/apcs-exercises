import java.util.Scanner;
public class SumOfOddIntegers{
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.println("N: ");
		int n = scan.nextInt();
		
		int sum = 0;
		int square = n * n;

		for (int i = n; i > 0; i--){
			sum += i;
		}
		System.out.println("Sum: " + sum + "\tSquare: " + square);
	}
}