import  java.util.Scanner;

public class Factorial {
  public static void main (String[] args ) {
    Scanner scan = new Scanner( System.in );

    long fact; 
    int N;

    System.out.println( "To exit, enter a negative value" );
    System.out.print( "Enter N: " );
    N = scan.nextInt();

    while ( N >= 0 )
    {
      fact = factorial( N );
      if (fact<=0) System.out.println("Error");
      else System.out.println( "factorial is " + fact );
      System.out.print( "Enter N: " );
      N = scan.nextInt();
    }  
  }

    // Calculate num factorial
  public static long factorial( int num ) {
  	if (num >= 21 || num < 0) return -1;
    long fct = 1;
    for ( int j=1; j<=num; j++ )
      fct *= j;
    return fct;
  }

}