public class RandomWalk{
	public static void main(String[] args){
		double x = RandomNumber.randomInt(100);
		double y = RandomNumber.randomInt(100);
		double xMove = x;
		double yMove = y;

		System.out.println("(" + x + "," + y + ")");
		for (int i = 0; i < 100; i++){
			xMove += Math.random();
			yMove += Math.random();
			System.out.println("(" + xMove + "," + yMove + ")");
		}
		double distance = Math.sqrt((xMove - x) * (xMove - x) + (yMove - y) * (yMove - y));
		System.out.println(distance);

	}
}