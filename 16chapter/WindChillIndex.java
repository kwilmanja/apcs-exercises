import java.util.Scanner;
import java.lang.Math;

public class WindChillIndex
{

	public static void main (String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Wind Speed: ");
		double v = scan.nextDouble();
		System.out.println("Enter Temperature: ");
		double temp = scan.nextDouble();
		double chill;
		if (v < 3){
			chill = 0;
		}
		else if (temp > 50){
			chill = 0;
		}
		else {
			chill = 35.74 + 0.6215 * temp - 35.75 * Math.pow(v, 0.16) + 0.4275 * temp * Math.pow(v, 0.16);
		}
		System.out.println("Wind Chill: " + chill);

	}

}