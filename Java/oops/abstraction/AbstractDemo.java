abstract class Shape{
	double area;
	static double PI = 3.14;
	public abstract void findArea();

	public void display(){
		System.out.println("area : " + area);
	}
}



class Square extends Shape{

	int side;

	public Square(int s){
		side = s;
	}

	public  void findArea(){// abract methods in the base class is overrided in the sub classś
		area = side * side;
	}

	public void display(){
		System.out.println("side : " + side);
		super.display();
	}
	
}

class Circle extends Shape{

	double radius;

	public Circle(double r){
		radius = r;
	}

	public void findArea(){
		area = PI * radius *radius;
	}

	public void display(){
		System.out.println("radius : " + radius);
		super.display();
	}
}

/*

class Circle extends Shape{
	double radius;
	
}*/

class AbstractDemo{
	public static void main(String args[]){
		 Shape shape = new Square(5);
		 	//shape.findArea();
		 	//shape.display();

		 Circle shape1 = new Circle(4);
		 //	shape1.findArea();
		 	//shape1.display();


		 AbstractDemo.findArea(shape1);
	}


	public static void findArea(Shape shape){
		shape.findArea();
		shape.display();
	}


}