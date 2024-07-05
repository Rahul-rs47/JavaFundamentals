class FinalDemo{
	public static void main(String args[]){

		Y y = new Y();
		y.display();

	}
}


class X{
	int xyz = 100;
}
class Y extends X{
	int xyz = 10;

	public void display(){
		System.out.println("xyz : " + xyz);
		System.out.println("base xyz : " + super.xyz);
	}

}

final class A extends B {

	 final int  MAX_MARK = 200;

	public final void display1(){
		System.out.println("I am from class A display method");
	}

}

class B{

	 int  MAX_MARK = 100;

	public final void display(){
		System.out.println("I am from class B display method");
		 //MAX_MARK = 200; //  error: cannot assign a value to final variable MAX_MARK
	}

	public void changeMaxMark(int mark){
		//MAX_MARK = mark;
	}

}

class C extends B{

	//error: display() in C cannot override display() in B
	/*public  void display(){
		System.out.println("I am from class C display method");
	}*/

}

//Error  cannot inherit from final A
/*
class B extends A{

}*/