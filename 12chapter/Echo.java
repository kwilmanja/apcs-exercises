import java.util.Scanner;
public class Echo
{
	public static void main ( String[] args)
	{ 
		Scanner scan = new Scanner(System.in);
		System.out.println("enter data");
		String inData = scan.nextLine();
		System.out.println("You entered:" + inData);
	}
}