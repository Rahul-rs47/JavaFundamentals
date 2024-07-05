class CircleApp{
	public static void main(String args[]){


		System.out.println("Enter the circle 1's radius");
		Circle circle1 = new Circle();
		circle1.getCircleRadius();
		circle1.calculateArea();
		circle1.calculateCircumference();
		circle1.calculateDiameter();
		circle1.displayCircle();
		System.out.println("Enter the circle 2's radius");
		Circle circle2 = new Circle();
		circle2.getCircleRadius();
		circle2.calculateArea();
		circle2.calculateCircumference();
		circle2.calculateDiameter();
		circle2.displayCircle();

	}
}