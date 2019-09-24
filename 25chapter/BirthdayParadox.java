import java.util.Scanner;
public class BirthdayParadox{
	public static void main (String[] args){
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Number of Guests: ");
//		double n = scan.nextDouble();
//
		double probability = 1;
//		for (double i = n; i > 0; i--){
//			probability *= ((365 - i)/365);
//		}
//		System.out.println("Probability: " + probability);
//
		double guests = 0;
		for (double i = 1; probability > 0.5; i++){
			probability *= ((365 - i)/365);
			guests = i;
		}
		System.out.println("Probility lower than 50% at " + guests + " guests with a probability of " + probability);

	}
}