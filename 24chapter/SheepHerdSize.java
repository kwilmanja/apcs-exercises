import java.util.Scanner;
public class SheepHerdSize{
	public static void main (String[] args){
//		Scanner scan = new Scanner(System.in);
//		System.out.println("Number of Sheep: ");
//		int n = scan.nextInt();
//		System.out.println("Years: ");
//		int years = scan.nextInt();
		double power = 1;
		double number = 0;
		for (int t = 0; number < 80; t++){
			number = 220/(1+10 * (power));
			power *= 0.83;
			System.out.println("Years: " + t + "\tNumber of Sheep: " + number);
		}
	}
}