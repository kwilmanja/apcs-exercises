public class Constructor{
	public static void main(String[] args){
    int[] values = { 98,  99,  98,  99, 100, 101, 102, 100, 104, 105,
                    105, 106, 105, 103, 104, 103, 105, 106, 107, 106,
                    105, 105, 104, 104, 103, 102, 102, 101, 100, 102};
    Weight june = new Weight(values);
    System.out.println(june);
    System.out.println("Average: " + june.average());
    System.out.println("Sub-Average(0 - 5): " + june.subAverage(0, 5));
    System.out.println("1st half: " + june.subAverage(0, 14));
    System.out.println("2nd half: " + june.subAverage(15, 29));
    System.out.println("Difference: " + (june.subAverage(15, 29) - june.subAverage(0, 14)) );
	}
}