import java.util.Scanner;
public class PasswordCracker{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);
		System.out.println("Password: ");
		String password = scan.nextLine();

//		String str = RandomString.randomString(5);
//		System.out.println(str);

		boolean notGuessed = true;
		int tries = 0;
		String str = "";
		while (notGuessed){
			str = RandomString.randomString(5);
			if (password.equals(str)){
				notGuessed = false;
			}
			tries += 1;
		}
		System.out.println("Here is your password: " + str +"\nIt took " + tries + " attempts");

	}
}