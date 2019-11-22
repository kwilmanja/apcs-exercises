public class Weight{
	private int[] data;

	public Weight(int[] init){
		data = new int[init.length];
		for (int i = 0; i<init.length; i++){
			data[i] = init[i];
		}
	}

	public String toString(){
		String str = "";
		for (int i = 0; i<data.length; i++){
			str += Integer.toString(i);
			str += ": ";
			str += Integer.toString(data[i]);
			str += "\n";
		}
		return str;
	}

	public int average(){
		int sum = 0;
		for (int i = 0; i<data.length; i++){
			sum += data[i];
		}
		return sum /  data.length;
	}

	public int subAverage(int start, int end){
		int sum = 0;

		for (int i = start; i<=end; i++){
			sum += data[i];
		}
		return sum / (end - start + 1);
	}
}