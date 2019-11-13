import java.util.Scanner;
class Numeric{
  public static void main ( String[] args ) {

    int numberA, numberB;
    Scanner scan = new Scanner( System.in );

    System.out.print("Enter first number: ");
    numberA = scan.nextInt();

    System.out.print("Enter second number: ");
    numberB = scan.nextInt();

    System.out.println( numberA + numberB );
  
  }
}