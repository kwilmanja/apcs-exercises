public class Substring
{
	public static void main (String[] arsg)
	{
		String str = new String("Caden is a dirty dirty dog");
		String sub1 = str.substring(9); // cuts off the first 8 characters
		int value1 = 0;
		int value2 = 6;
		String sub2 = str.substring(value1, value2);
		System.out.println( sub1 );
		System.out.println( sub2 );
	}
}