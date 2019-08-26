import java.util.Scanner;

public class GroundBeefCalculator
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Price per pound package A: ");
		double rateA = scan.nextDouble();
		System.out.println("Percent lean package A: ");
		double percentA = scan.nextDouble();
		System.out.println("Price per pound package B: ");
		double rateB = scan.nextDouble();
		System.out.println("Percent lean package B: ");
		double percentB = scan.nextDouble();
		double costA = rateA / (percentA * 0.01);
		double costB = rateB / (percentB * 0.01);
		System.out.println("Package A cost per pound of lean: " + costA);
		System.out.println("Package B cost per pound of lean: " + costB);
		if (costA > costB){
			System.out.println("Package B is the best value");
		}
		else{
			System.out.println("Package A is the best value");
		}
	}

}