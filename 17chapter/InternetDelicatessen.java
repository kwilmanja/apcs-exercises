import java.util.Scanner;

public class InternetDelicatessen
{
		public static void main (String[] args)
		{
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the item: ");
			String item = scan.nextLine();
			System.out.println("Enter the Price: ");
			double price = scan.nextDouble();
			System.out.println("Overnight Delivery (0 == no, 1 == yes): ");
			int overnight = scan.nextInt();

			double fee;
			if (price < 10){
				fee = 2.00;
			}
			else{
				fee = 0.00;
			}

			if (overnight != 0) {
				fee += 3.00;
			}
			System.out.println("Invoice: \n" + item + "\t" + price + "\ndelivery\t" + fee + "\ntotal\t\t" + (fee + price));


		}
}