class Shape{

	 private double area;



	public Shape(){
		System.out.println("I am in shape");
	}

	public Shape(double a){
		this.area = a;
	}


	 public double getArea(){
		return this.area;
	}

	public void setArea(double a){
		this.area = a;
	}

	public void display(){
		System.out.println("area : " + area);
	}





}


class Triangle extends Shape{

	private int base;
	private int height;

	public void setBase(int base){
		this.base = base;
	}
	public int getBase(){
		return this.base;
	}

	public void setHeight(int height){
		this.height = height;
	}
	public int getHeight(){
		return this.height;
	}

	public void findArea(){
		double areaOfTriangle = 0.5 * (base * height);
		setArea(areaOfTriangle);
	}

	public String toString(){
		String output = "";
		output += " Triangele \n";
		output += "************ \n";
		output += " base : "  +  base +  "\n";
		output += " height : " + height + "\n";
		output += " area : " + getArea() + "\n";

		return output;
	}

	
}

class Square extends Shape{

	private int side;


	public Square(){
		System.out.println("I am in Square");
	}

	public Square(int side){
		this.side = side;
	}

	public void setSide(int side){
		this.side = side;
	}
	public int getSide(){
		return this.side;
	}

	public void findArea(){
		double areaOfSquare = side * side;
		setArea(areaOfSquare);
	}


	public void display(){

		System.out.println("   Square   ");
		System.out.println("************");
		System.out.println("side : " + side);

		super.display();

	}
	
	
}