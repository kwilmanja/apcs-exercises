import java.util.Scanner;
public class DiscountPrices
{

  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter amount of purchase: ");
    double purchase = scan.nextDouble();
    double price = purchase;
    double discount = 0;
    if (purchase > 100)
    {      
      discount = purchase * 0.1;
      price = purchase - discount;
    }

    System.out.println("Final Price: " + price);
  }

}
