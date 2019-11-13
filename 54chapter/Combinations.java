import  java.util.Scanner;

public class Combinations{
  public static void main (String[] args ) {
    Scanner scan = new Scanner( System.in );

    long fact; 
    int N;
    int R;

    System.out.println( "To exit, enter a negative value for N" );
    System.out.print( "Enter N (total number of things): " );
    N = scan.nextInt();
    System.out.print("\nEnter R (number of things in each combination): ");
    R = scan.nextInt();

    while ( N >= 0 )
    {
      System.out.println("Possible Combinations: " + combos(N, R));

      System.out.print( "Enter N (total number of things): " );
      N = scan.nextInt();
      System.out.print("\nEnter R (number of things in each combination): ");
      R = scan.nextInt();
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

  public static long combos(int N, int R){
    return factorial(N) / (factorial(R) * (factorial(N-R)));
  }

}