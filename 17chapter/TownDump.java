import java.util.Scanner;
public class TownDump{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Pounds of Trash: ");
		int pounds = scan.nextInt();
		int charge = 0;
		if (pounds >= 200){
			charge = 8 * (pounds - 200) / 100 + 20; 
		}
		System.out.println("Charge: " + charge);
	}
}