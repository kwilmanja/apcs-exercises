import java.util.Scanner;
public class OrderChecker
{

  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Number of bolts: ");
    final int bolts = scan.nextInt();
    System.out.println("Number of nuts: ");
    final int nuts = scan.nextInt();
    System.out.println("Number of washers: ");
    final int washers = scan.nextInt();

    boolean valid = true;
    String error = new String(" ");

    if (nuts < bolts)
    {
      valid = false;
      error = "too few nuts";
      System.out.println("too few nuts");
    }

    if (washers < (2 * bolts))
    {
      valid = false;
      error = "too few washers";
      System.out.println("too few washers");
    }

    if (valid == true)
    {
      System.out.println("Order is OK");
    }
    else
    {
      System.out.println("Check the Order: " + error);
    }


    int cost = bolts * 5 + nuts * 3 + washers * 1;
    System.out.println("Total Cost: " + cost);
  }

}
