public class TwoLargestElements{
	public static void main(String[] args){
		int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
		int psn1 = 0;
		int value1 = 0;
		int psn2 = 0;
		int value2 = 0;

		for (int i=0; i < data.length; i++){
			if (data[i] > value1){
				psn1 = i;
				value1 = data[i];
			} else if (data[i] > value2){
				psn2 = i;
				value2 = data[i];
			}
		}
		System.out.println("Highest Value: " + data[psn1] + "\nSecond Highest Value: " + data[psn2]);

	}
}