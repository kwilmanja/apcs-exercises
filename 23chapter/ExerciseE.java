import java.util.Scanner;
public class ExerciseE{
	public static void main (String[] args){

		//Setup:
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter X: ");
		int x = scan.nextInt();
		double term = 1;
		double sum = 0;
		int n = 0;


		//Action:
		while (term > 1.0E-12){



			//Factorial / Numerator: 
			double factorial = 1;
			double numerator = 1;

			for (int i = n; i > 0; i--){
				factorial *= i;
				numerator *= x;
			}

			// Term: 
			term = numerator / factorial;

			//Sum:
			sum += term;

			System.out.print("n: " + n + "\tterm: " + term + "\tsum: " + sum + "\n");
			n += 1;
		}
		System.out.println("my e^x: " + sum);
		System.out.println("my e^x: " + Math.exp(x));

	}
}