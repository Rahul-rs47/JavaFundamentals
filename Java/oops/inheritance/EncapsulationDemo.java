class EncapsulationDemo{
	public static void main(String args[]){


		Circle circle1 = new Circle(); // default constructor
		Circle circle = new Circle(5); 

		circle1.setRadius(10);

		System.out.println("radius : " + circle.getRadius());
		System.out.println("area : " + circle.getArea());


		System.out.println("radius : " + circle1.getRadius());
		System.out.println("area : " + circle1.getArea());
	}
}