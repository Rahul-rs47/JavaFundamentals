import java.util.Scanner;
class TriangleApp{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the breadth");
		int b = sc.nextInt();
		System.out.println("Enter the height");
		int h = Helper.getI();


		Triangle t1 = new Triangle(b,h);
		t1.findArea();
		System.out.println("breadth : " + t1.getBreadth());
		System.out.println("height : " + t1.getHeight());
		System.out.println("area : " + t1.getArea());

	
		Triangle t2 = new Triangle(9,5);
		t2.findArea();
		System.out.println("breadth : " + t2.getBreadth());
		System.out.println("height : " + t2.getHeight());
		System.out.println("area : " + t2.getArea());


	}
}