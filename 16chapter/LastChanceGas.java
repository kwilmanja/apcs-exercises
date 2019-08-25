import java.util.Scanner;
public class LastChanceGas
{

  public static void main (String[] args)
  {
    Scanner scan = new Scanner(System.in);
    System.out.println("Tank Capacity: ");
    int capacity = scan.nextInt();
    System.out.println("Gage Reading: ");
    int gage = scan.nextInt();
    System.out.println("Miles per Gallon: ");
    int rate = scan.nextInt();
    int miles = ((capacity * gage) / 100) * rate;

    if (miles < 200)
      System.out.println("Get Gas!");
    else
      System.out.println("Good to Go!");
  }

}
