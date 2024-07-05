class TypeCasting{
	public static void main(String args[]){

		X x1 = new Y();
		X x2 = new Z();

		x1.displayX();
		//x1.displayY(); // only parent call methods will be avaialble

		x2.displayX();
		//x2.displayZ();


		Y y1 = (Y)new X(); // without explicit casting will give compilation error
						  //  with explicit casting will compile without error
		//y1.displayX(); // Will throw runtime Exception
		//y1.displayY();



	}
}


class X{

	public void displayX(){
		System.out.println(" I am from display X");
	}

}

class Y extends X{

	public void displayY(){
		System.out.println(" I am from display Y");
	}

}

class Z extends X{

	public void displayZ(){
		System.out.println(" I am from display Z");
	}

}