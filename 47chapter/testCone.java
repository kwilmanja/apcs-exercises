public class testCone{
	public static void main(String[] args){
		Cone cone = new Cone(2, 4);
		System.out.println(cone.volume());
		System.out.println(cone.surfaceArea());
		System.out.println(cone.slantHeight());
		System.out.println(cone.angle());
	}
}