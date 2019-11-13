public class TesterBox{
	public static void main(String[] args) {
		
     Box box = new  Box( 2.5, 5.0, 6.0 );
     System.out.println( "Area: "  + box.area() + " volume: " + box. volume() );
     System.out.println( "length: " + box.length + " height: " + box.height + " width:  " + box.width )  ;		
		
     Box box1 = new  Box(box);
     System.out.println( "Area: "  + box1.area() + " volume: " + box1. volume() );
     System.out.println( "length: " + box1.length + " height: " + box1.height + " width:  " + box1.width )  ;	

     Box bigBox = box.biggerBox();
     System.out.println( "Area: "  + bigBox.area() + " volume: " + bigBox.volume() );
     System.out.println( "length: " + bigBox.length + " height: " + bigBox.height + " width:  " + bigBox.width );

     System.out.println(bigBox.nesting(box));
	}
}