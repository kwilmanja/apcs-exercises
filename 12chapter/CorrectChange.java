import java.util.Scanner;
public class CorrectChange
{
	public static void main ( String[] args)
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Total Change: ");
		int data = scan.nextInt();
		int dollars = data / 100;
		int data2 = data - dollars * 100;
		int quarters = data2 /25;
		int data3 = data2 - quarters * 25;
		int dimes = data3 / 10;
		int cents = data3 - dimes * 10;

		System.out.println("Your change is: " + dollars + " dollars " + quarters + " quarters " + dimes + " dimes " + cents + " cents");
	}	
}