import java.util.Scanner;
public class CircleArea
{
	public static void main ( String[] args)
	{ 
		Scanner scan = new Scanner(System.in);
		System.out.println("Radius:");
		String input = scan.nextLine();
		int radius = Integer.parseInt(input);
		double area = Math.PI * radius * radius;
		System.out.println("Area:" + area);
	}
}