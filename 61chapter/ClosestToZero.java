import java.io.*;

public class ClosestToZero{
	public static void main(String[] args){
		int[] data = {3, 1, 5, 7, 4, 12, -3, 8, -2};
		int value = data[0];
		int psn = 0;
		for (int i = 0; i<data.length; i++){
			if (Math.abs(data[i]) < value){
				psn = i;
				value = data[i];
			}
		}
		System.out.println("Closest to Zero: " + data[psn]);
	}
}