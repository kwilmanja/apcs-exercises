import java.util.Random;
import java.util.Scanner;
public class AverageOfSample{
	public static void main (String[] args){

		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		System.out.println("N: ");
		int n = scan.nextInt();
		System.out.println("Limit: ");
		int limit = scan.nextInt();

		int sum = 0;
		int count = 0;

		int number = 0;

		for (int i = n; i >= 0; i--){
			number = rand.nextInt(limit);
			System.out.println(number);
			sum += number;
			count += 1;
		}
		double average = sum / count;
		System.out.println(average);

	}
}