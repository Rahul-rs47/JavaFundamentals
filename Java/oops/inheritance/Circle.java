class Circle{

	private int radius;
	public double area;

	public Circle(){
		
	}


	public Circle(int r){
		radius = r;
	}

	public void setRadius(int radius){
		this.radius = radius;
	}

	public int getRadius(){
		return	this.radius ;
	}


	public double getArea(){

		area = Math.PI * Math.pow(radius, 2);
		return	this.area ;
	}



	
}