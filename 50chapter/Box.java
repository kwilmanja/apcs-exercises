public class Box{
	
	public double width;
	public double length;
	public double height;

	private double bigWidth;
	private double bigLength;
	private double bigHeight;



	//Constructers:

	public Box(double width, double length, double height){
		this.width = width;
		this.length = length;
		this.height = height;
	}

	public Box(Box oldBox){
		this.width = oldBox.width();
		this.length = oldBox.length();
		this.height = oldBox.height();
	}


	//Accessors:
	public double length(){
		return this.length;
	}
	public double width(){
		return this.width;
	}
	public double height(){
		return this.height;
	}



	//Methods:
	public double volume(){
		return this.width * this.length * this.height;
	}

	public double area(){
		return (faceArea() + topArea() + sideArea()) * 2;
	}

	private double faceArea(){
		return this.length * this.height;
	}

	private double topArea(){
		return this.width * this.length;
	}

	private double sideArea(){
		return this.width * this.height;
	}

	public Box biggerBox(){
		bigWidth = 1.25 * width;
		bigLength = 1.25 * length;
		bigHeight = 1.25 * height;
		return new Box(bigWidth, bigLength, bigHeight);
	}


	public boolean nesting(Box outsideBox){
		if (outsideBox.length() > length() && outsideBox.width() > width() && outsideBox.height() > height()) return true;
		return false;

	}


}