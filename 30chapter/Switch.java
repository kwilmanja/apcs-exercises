public class Switch{
	public static void main(String[] args){
		int var = 2;
		boolean keepSwitch = true;
		while(keepSwitch)
			switch (var){
				case 0:
					System.out.println("true");
					keepSwitch = false;
					break;
				case 1:
					System.out.println("false");
					keepSwitch = false;
					break;
				case 2: {
					System.out.println("other option");
					var = 1;
				}
		}
	}
}