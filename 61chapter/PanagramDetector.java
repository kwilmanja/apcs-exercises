import java.util.Scanner;

public class PanagramDetector{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);

		char[] alphebet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		boolean[] allGood = new boolean[26];
		String sentence = "the quick brown fox jumps over the lazy dog";

		for (int i = 0; i<sentence.length(); i++){
			for (int n = 0; n<alphebet.length; n++){
				if (sentence.charAt(i) == alphebet[n]) allGood[n] = true;
			}
		}
		boolean good = true;
		for (int n = 0; n<alphebet.length; n++){
			if (!allGood[n]) good = false;
		}
		if (good) System.out.println("It is a Panagram!");
		else System.out.println("Not a Panagram!");

	}
}