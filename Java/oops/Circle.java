class Circle{
	
	float radius;
	float area;
	float circumference;
	float diameter;

	public void getCircleRadius(){
//		System.out.println("Enter the circle's radius");
		radius = Helper.getF();

	}

	public void calculateArea(){
		area=3.14159f*(radius*radius);	
	}

	public void calculateCircumference(){
		circumference =3.14159f*radius*2;	
	}
	public void calculateDiameter(){
		diameter= 2 *radius;	
	}

	public void displayCircle(){
		System.out.println("Circle radius is: " + radius );
		System.out.println("Circle diameter is : " + diameter);
		System.out.println("Circle circumference is: " + circumference);
		System.out.println("Circle Area is : " + area);
	
	}
}