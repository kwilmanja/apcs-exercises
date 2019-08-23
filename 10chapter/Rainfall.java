public class Rainfall
{
	public static void main (String[] args)
	{
		int april = 12;
		int may = 14;
		int june = 8;
		System.out.print("Rainfall for April: \t " + april + "\n");
		System.out.print("Rainfall for May: \t " + may + "\n");
		System.out.print("Rainfall for June: \t " + june + "\n");
		double average = (june + may + april) / 3;
		System.out.print("Average Rainfall: \t " + average);
	}
}