import java.util.Scanner;
public class TesterPantry{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
    	Jam goose = new Jam( "Gooseberry", "7/4/86", 12 );
    	Jam apple = new Jam( "Crab Apple", "9/30/99", 8 );
    	Jam rhub  = new Jam( "Rhubarb", "10/31/79", 3 );
    	Jam yuck = new Jam("disgusting stuff", "5/13/19", 5);

    	Pantry hubbard = new Pantry(goose, apple, rhub);

    	//System.out.println("\n"+hubbard);
    	//hubbard.select(1);
    	//hubbard.spread(2);
    	//System.out.println("\n"+hubbard);
    	//hubbard.select(3);
    	//hubbard.spread(4);
    	//System.out.println("\n"+hubbard);
    	
    //Exercise 3:
    	//hubbard.replace(yuck, 3);
    	//System.out.println("\n"+hubbard);
    	//hubbard.select(1);
    	//hubbard.spread(2);
    	//System.out.println("\n"+hubbard);
    	//hubbard.select(3);
    	//hubbard.spread(4);




    	int selection = 0;
    	int wantToSpread;
    //Exercise 1 + 4:
    	while(selection != -1){
    		System.out.println("\n"+hubbard);
    		System.out.println("Enter your selection (1, 2, or 3:");
    		selection = scan.nextInt();
    		if (selection != -1){
    			System.out.println("Enter amount:");
    			wantToSpread = scan.nextInt();
    			hubbard.select(selection);
    			hubbard.spread(wantToSpread);
    		}
    		hubbard.combine();
    	}


    //Exercise 2:
    	//Pantry gardens = new Pantry(goose, apple);
    	//System.out.println("\n" + gardens );
    	//if ( gardens.select(2) )
    	//  gardens.spread(9);
    	//else
      	//	System.out.println("Selection not available");
    	//System.out.println("\n" + gardens );
    	//if ( gardens.select(3) )
      	//	gardens.spread(5);
    	//else
      	//	System.out.println("Selection not available");
    	//System.out.println( "\n" + gardens );



	}
}