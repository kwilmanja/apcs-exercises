import java.util.Scanner;
public class MilesPerGallon{
	public static void main (String[] args){

		Scanner scan = new Scanner(System.in);

		System.out.println("Miles Per Gallon Program");
		int beg = 1;
		int fin;
		int gallons;
		double rate;

		while (beg > 0){
			System.out.println("Initial Miles: ");
			beg = scan.nextInt();
			if (beg < 0){
				break;
			}
			System.out.println("Final Miles: ");
			fin = scan.nextInt();
			System.out.println("Gallons: ");
			gallons = scan.nextInt();
			rate = (fin - beg) / gallons;
			System.out.println("Miles per Gallon: " + rate);
		}

	}
}