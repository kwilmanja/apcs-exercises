import java.io.*;
public class Elements{
	public static void main(String[] args){
		int[] data = {3, 2, 5, 7, 9, 12, 97, 24, 54};
		int sum = 0;
		for (int i=0; i<data.length; i++){
			sum += data[i];
		}
		System.out.println("Sum: " + sum);

		int sumO = 0;
		for (int i=0; i<data.length; i+=2){
			sumO += data[i];
		}
		System.out.println("Sum: " + sumO);

		int sumE = 0;
		for (int i=1; i<data.length; i+=2){
			sumE += data[i];
		}
		System.out.println("Sum: " + sumE);


	}
}