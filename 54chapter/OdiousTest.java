import java.util.Scanner;

public class OdiousTest{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int number;
		do{
			System.out.println("Type in a Number: ");
			number = scan.nextInt();
			System.out.println(number + " in binary is: " + binary(number));
			System.out.println("Odious: " + odious(binary(number)));
		} while (number >= 0);
		System.out.println("Thanks homie! See ya soon!");


	}

	public static String binary(int number){
		String binary = "";
		for (int i = number; i > 0; i = i / 2){
			if (i % 2 == 1) binary += "1";
			if (i % 2 == 0) binary += "0";
		}
		String binaryFixed = "";
		for (int i = binary.length(); i>0; i--){
			binaryFixed += binary.charAt(i - 1);
		}
		return binaryFixed;
	}

	public static boolean odious(String numberBinary){
		int ones = 0;
		for (int i = numberBinary.length() - 1;  i>=0; i--){
			if (numberBinary.charAt(i) == '1') ones += 1;
		}
		if (ones % 2 == 0) return false;
		else return true;
	}

}

