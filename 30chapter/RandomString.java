import java.util.Random;
public class RandomString{
	public static String randomString(int length){
		Random rand = new Random();
		String choices = " abcdefghijklmnopqrstuvwxyz";
		String str = "";
		for (int i = 0; i < length; i++){
		str += choices.charAt(RandomNumber.randomInt(27));
		}
		return str;

	}
}