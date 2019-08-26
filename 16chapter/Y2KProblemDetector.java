import java.util.Scanner;
public class Y2KProblemDetector
{
	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Year of Brith: ");
		int birth = scan.nextInt();
		System.out.println("Current Year: ");
		int year = scan.nextInt();
		if ((year - birth) > 0){
			System.out.println("Your Age: " + (year - birth));
		}
		else{
			System.out.println("Your Age: " + ((year +100) - birth));
		}
	}
}