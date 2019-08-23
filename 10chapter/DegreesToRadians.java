public class DegreesToRadians
{
	public static void main (String[] args)
	{
		double deg = 30;
		double rad = deg * Math.PI / 180;
		double sin = Math.sin(rad);
		double cos = Math.cos(rad);
		double sum = cos * cos + sin * sin;
		System.out.println("sine: \t\t\t" + sin + "\ncosine: \t\t" + cos + "\nsum of squares: \t" + sum);
	}
}