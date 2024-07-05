class EncapusulationDemo{
	public static void main(String args[]){
		Circle c1 = new Circle(5);
		c1.findArea();
		System.out.println("radius: " + c1.getRadius());
		System.out.println("area: " + c1.getArea());
		
		Circle c2 = new Circle();
		c2.setRadius(10);
		c2.findArea();

		System.out.println("radius: " + c2.getRadius());
		System.out.println("area: " + c2.getArea());

	}
}