public class Trigonometry
{
	public static void main (String[] args)
	{
		double value = 0.5236;
		double sin = Math.sin(value);
		double cos = Math.cos(value);
		double sum = cos * cos + sin * sin;
		System.out.println("sine: \t\t\t" + sin + "\ncosine: \t\t" + cos + "\nsum of squares: \t" + sum);
	}
}	