class DistanceApp{
	public static void main(String args[]){

		Distance distance1;

		distance1  = new Distance();
		Distance distance2 = new Distance();

		System.out.println("Enter the details of distance 1 ");
		distance1.getDistance();
		System.out.println("Enter the details of distance 2 ");
		distance2.getDistance();

		  
		Distance distance3 = distance1.addDistance(distance2);
		Distance distance4 = distance1.diffDistance(distance2);

		System.out.println("The value of  distance 1 ");
		distance1.displayDistance();

		System.out.println("The value of  distance 2 ");
		distance2.displayDistance();

		System.out.println("The value of  distance 3 ");
		distance3.displayDistance();

		System.out.println("The value of  distance 4 ");
		distance4.displayDistance();




	}
}