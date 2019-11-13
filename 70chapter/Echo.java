import java.util.Scanner;
public class Echo{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.err.println("Enter your input: ");
		String input = scan.nextLine(); // java Echo < input.txt
		System.out.println(input);
	}
}