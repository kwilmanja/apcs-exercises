public class Cylinder{

	private double radius;
	private double height;


	//Contstructer:
	public Cylinder(int radius, int height){
		this.radius = radius;
		this.height = height;
	}

	public Cylinder(){
	}



	public void setRadius(int radius){
		if (radius > 0)
			this.radius = radius;
	}

	public void setHeight(int height){
		if (height > 0)
			this.height = height;
	}


	public double getRadius(){
		return this.radius;
	}

	public double getHeight(){
		return this.height;
	}

	//Methods:
	public double area(){
		return Math.PI * this.radius * this.radius;
	}

	public double volume(){
		return area() * this.height;
	}
	
	public double surfaceArea(){
		return 2 * area() + 2 * Math.PI * this.radius * this.height;
	}




}