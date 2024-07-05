class InheritanceDemo{

		public static void main(String args[]){

			Triangle t1 = new Triangle();
			t1.setBase(10);
			t1.setHeight(20);
			t1.findArea();

			System.out.println(t1);


			Square s1 = new Square(5);
			s1.findArea();
			s1.display();


			/*Shape sh1 = new Shape();
			sh1.display();*/


			Square s2 = new Square();
			s2.setSide(10);
			s2.findArea();
			s2.display();



		}
	
}