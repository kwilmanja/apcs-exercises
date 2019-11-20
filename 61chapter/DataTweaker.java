public class DataTweaker{
	public static void main(String[] args){
		double[] data ={
13,
5.6,
6.2,
6.0,
5.5,
5.7,
6.1,
7.4,
5.5,
5.5,
6.3,
6.4,
4.0,
6.9};
	
		double average = average(data);;
		System.out.println(average);
		double difference = 0;
		int psn = 0;
		for (int i = 0; i<data.length; i++){
			if (Math.abs(average - data[i]) > difference){
				difference = Math.abs(average - data[i]);
				psn = i;
			}
		}
		System.out.println(psn);
		int psn2 = 0;
		double[] newData = new double[data.length - 1];
		for (int i = 0; i<data.length; i++){
			if (i != psn){
				newData[psn2] = data[i];
				psn2 += 1;
			}

		}
		System.out.println(average(newData));

	}
	public static double average(double[] data){
		double sum = 0;
		for (int i = 0; i<data.length; i++){
			sum += data[i];
		}
		return sum / data.length;
	}
}