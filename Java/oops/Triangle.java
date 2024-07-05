class Triangle{
	
	int breadth;
	int height;
	double area;


    
	public Triangle(){
		breadth = 0;
		height = 0;
	}
	
	public Triangle(int b,int h){
		breadth = b;
		height = h;
	}

	public  void findArea(){
		area = 0.5*(breadth * height);

	}

	public int getBreadth(){

		return breadth;
	}

	public int getHeight(){

		return height;
	}

	public double getArea(){

		return area;
	}


}