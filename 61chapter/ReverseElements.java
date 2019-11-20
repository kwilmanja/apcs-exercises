import java.io.*;
public class ReverseElements{
	public static void main(String[] args){
		int[] data = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		int[] newData = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		for (int i=0; i<data.length; i++){
			newData[data.length - 1 - i] = data[i];

		}

		for (int i=0; i<data.length; i++){
			System.out.println(newData[i]);
		}

	}
}